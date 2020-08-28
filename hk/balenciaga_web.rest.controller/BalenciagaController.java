package balenciaga_web.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import balenciaga_web.rest.entity.Chara;
import balenciaga_web.rest.entity.Info;
import balenciaga_web.rest.entity.Reply;
import balenciaga_web.rest.entity.Reply2;
import balenciaga_web.rest.entity.Subscribe;
import balenciaga_web.rest.repository.BalenciagaRepository;
import balenciaga_web.rest.repository.BalenciagaRepository2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;



@RestController
public class BalenciagaController {
	@CrossOrigin(origins = "*")
	@GetMapping("/sample")
	public String getSample(){
		return "성공";
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/info")
	public ArrayList<Info> getInfo(){
		Info lol = new Info("slamdunk.jpg","저기 환호 하는 사람들 속에","너의 시선을 느껴<br>놓치지 않아<br>바로 지금이야<br>날 부르는 바람의 함성을 향해<br>하늘을 향해 내 몸 던져<br>네가 있어<br>가슴 벅찬 열정을 끌어 안고<br>박차 올라 외치고 싶어<br>Crazy for you");
		
		ArrayList<Info> infoList = new ArrayList<Info>();
		
		infoList.add(lol);
		
		return infoList;
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/chara")
	public ArrayList<Chara> getChara(){
		Chara gang = new Chara("강백호", "桜木花道", "빨간 원숭이", "Red Monkey","슬램덩크의 메인 주인공. 포지션은 파워포워드.<BR>도내 최고기록 한 경기 22리바운드의 주인공. 팀내 두번째의 장신과 파워를 가져서 백업 센터도 한다.", "파워 포워드","gang.PNG",188, 83);
		Chara seo = new Chara("서태웅", "流川楓", "슈퍼 루키", "Super Rookie","슬램덩크의 서브 주인공. 포지션은 스몰포워드.<BR>하지만 다른 포지션을 맡지 않아서 그렇지 덩크, 3점슛, 드리블 등을 조합하면 산왕의 정우성처럼 올라운드에 가깝다. 북산 농구부에 가입했을 때도 스스로 모든 포지션이 가능하다고 소개했다.", "스몰 포워드","seo.jpg",187, 75);
		Chara jung = new Chara("정대만", "三井 寿", "불꽃 남자", "Men on fire","슬램덩크의 등장인물. 포지션은 슈팅가드.<BR>시작할 땐 가드포워드라고도 나왔지만 이후 슈팅가드로 굳혀졌다. 다만 현실에서는 가드포워드로 분류되는 선수들 중 많은 선수가 한 포지션으로 출전하는 경우가 많다.", "슈팅 가드","jung.PNG",184, 70);
		Chara song = new Chara("송태섭", "宮城リョータ", "비밀 병기", "The Secret Weapon","슬램덩크의 등장인물. 포지션은 포인트 가드.<BR>원래는 1학년 때부터 농구부에 들었지만 정대만과 폭력사태로 병원에 입원하면서 그동안 농구부에서 뛰지 못했다가 복귀하면서 첫 등장. 단신에 스피드를 살린 농구 스타일의 소유자.", "포인트 가드","song.jpg",168, 59);
		Chara chae = new Chara("채치수", "赤木剛憲", "고릴라", "Gorilla","슬램덩크의 등장인물. 북산고 3학년으로 농구부 주장이다. 포지션은 센터.<BR>강백호가 붙인 별명은 괴물 고릴라. 하지만 나중에는 그냥 고릴라, 또는 고릴라 선배로 부른다. 도내 베스트 파이브에 선정될 정도니 단연 도내 최고의 센터다.", "센터","chae.PNG",197, 93);
		
		ArrayList<Chara> charaList = new ArrayList<Chara>();
		
		charaList.add(gang);
		charaList.add(seo);
		charaList.add(jung);
		charaList.add(song);
		charaList.add(chae);
		
		
		return charaList;
	}
	
	
	@Autowired
	  BalenciagaRepository balenciagaRepository;
	  
	  @CrossOrigin(origins = "*")
	  @PostMapping("/reply")
	  public ResponseEntity<Reply> createTutorial(@RequestBody Reply reply) {
	    try {
	      Reply _reply = balenciagaRepository
	          .save(new Reply(reply.getContent(), reply.getWriter(), reply.getPassword(), true));
	      System.out.println(reply.getContent());
	      return new ResponseEntity<>(_reply, HttpStatus.CREATED);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  
	  @CrossOrigin(origins = "*")
	  @GetMapping("/reply")
	  public ResponseEntity<Map<String, Object>> getAllReplies(@RequestParam(required = false) String content,  @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "5") int size) {
	    try {
	      List<Reply> replies = new ArrayList<Reply>();
	      Pageable paging = new PageRequest(page, size);
	      
	      Page<Reply> pageReplies;

	      if (content == null) {
	    	  pageReplies = balenciagaRepository.findByOrderByIdDesc(paging);
	      }
	      else {
	    	  pageReplies = balenciagaRepository.findByContentContaining(content, paging);
	      }
	      
	      replies = pageReplies.getContent();
	      
	      if (replies.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      
	      Map<String, Object> response = new HashMap<>();
	      response.put("replies", replies);
	      response.put("currentPage", pageReplies.getNumber());
	      response.put("totalItems", pageReplies.getTotalElements());
	      response.put("totalPages", pageReplies.getTotalPages());

	      return new ResponseEntity<>(response, HttpStatus.OK);
	    } catch (Exception e) {
	    	e.printStackTrace();
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }

	  
	  @Autowired
	  BalenciagaRepository2 balenciagaRepository2;
	  
	  @CrossOrigin(origins = "*")
	  @PostMapping("/subscribe")
	  public ResponseEntity<Subscribe> createTutorial2(@RequestBody Subscribe subscribe) {
	    try {
	    	Subscribe _subscribe = balenciagaRepository2.save(new Subscribe(subscribe.getInputEmail()));
	      System.out.println(subscribe.getInputEmail());
	      return new ResponseEntity<>(_subscribe, HttpStatus.CREATED);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  
	  @CrossOrigin(origins = "*")
	  @GetMapping("/subscribe")
	  public ResponseEntity<List<Subscribe>> getAllTutorials2(@RequestParam(required = false) String inputEmail) {
	    try {
	      List<Subscribe> subscribes = new ArrayList<Subscribe>();

	      if (inputEmail == null)
	    	balenciagaRepository2.findAll().forEach(subscribes::add);
	      else
	    	balenciagaRepository2.findByInputEmail(inputEmail).forEach(subscribes::add);

	      if (subscribes.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }

	      return new ResponseEntity<>(subscribes, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  
	  @CrossOrigin(origins = "*")
	  @GetMapping("/reply/{id}")
	  public ResponseEntity<Reply> getReplyById(@PathVariable("id") long id) {
	    Optional<Reply> tutorialData = balenciagaRepository.findById(id);

	    if (tutorialData.isPresent()) {
	      return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }

	
	  @CrossOrigin(origins = "*")
	  @PutMapping("/reply/{id}")
	  public ResponseEntity<Reply> updateReply(@PathVariable("id") long id, @RequestBody Reply reply) {
	    Optional<Reply> oldReply = balenciagaRepository.findById(id);
	    
	    if (oldReply.isPresent()) {
	      Reply _reply = oldReply.get();
	      _reply.setContent(reply.getContent()); 
	      _reply.setWriter(reply.getWriter());
	      
	      Reply oldReplyForPassword = balenciagaRepository.getOne(id);
	      if(!(oldReplyForPassword.getPassword().equals(reply.getPassword()))) {
	    	  return new ResponseEntity<>(HttpStatus.UNAUTHORIZED); 
	      }
	      return new ResponseEntity<>(balenciagaRepository.save(_reply), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	  
	  @Transactional
	  @CrossOrigin(origins = "*")
	  @DeleteMapping("/reply/{id}")
	  public ResponseEntity<HttpStatus> deleteReply(@PathVariable("id") long id, @RequestBody Reply reply) {
	    try {
	    	
	    	Reply oldReplyForPassword = balenciagaRepository.getOne(id);
		      if(!(oldReplyForPassword.getPassword().equals(reply.getPassword()))) {
		    	  return new ResponseEntity<>(HttpStatus.UNAUTHORIZED); 
		      }
	    	
	    	balenciagaRepository.deleteById(id);
	      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    } catch (Exception e) {
	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	  
	  @CrossOrigin(origins = "*")
	  @DeleteMapping("/replies")
	  public ResponseEntity<HttpStatus> deleteAllReplies() {
	    try {
	      balenciagaRepository.deleteAll();
	      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    } catch (Exception e) {
	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }

	  }
	  
	  @CrossOrigin(origins = "*")
	  @GetMapping("/reply/published")
	  public ResponseEntity<List<Reply>> findByPublished(@RequestParam(defaultValue = "0") int page,
		        @RequestParam(defaultValue = "3") int size) {
	    try {
	    	List<Reply> tutorials = new ArrayList<Reply>();
	        Pageable paging = new PageRequest(page, size);
	        
	        Page<Reply> pageTuts = balenciagaRepository.findByPublished(true, paging);
	        tutorials = pageTuts.getContent();

	      if (tutorials.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      return new ResponseEntity<>(tutorials, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	
	
	@CrossOrigin(origins = "*")
	@GetMapping("chara/reply")
	public float getReply(){
		Reply2 r1 = new Reply2("삼hatchery","이친구는 몇달연속 1티어인데 노잼이라 별 문제가 안됨 ㅋㅋㅋㅋㅋ", "2020-04-18",4);
		Reply2 r2 = new Reply2("트레버","얘 E랑 코그모 E 바꿨으면 좋겠다...", "2020-04-18",5);
		Reply2 r3 = new Reply2("아쌈","일러스트 깡패 인게 실패", "2020-04-18",4);
		
		ArrayList<Reply2> replyList = new ArrayList<Reply2>();
		
		replyList.add(r1);
		replyList.add(r2);
		replyList.add(r3);

		float sum = 0;
		for(int i = 0; i<replyList.size(); i++) {
			sum = sum+replyList.get(i).point;
		}

		sum = sum/replyList.size();
		
		return sum;
		
	}
}
