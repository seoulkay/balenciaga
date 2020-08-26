package balenciaga_web.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.persistence.*;

import balenciaga_web.rest.entity.Chara;
import balenciaga_web.rest.entity.Reply;
import balenciaga_web.rest.entity.Subscribe;
import balenciaga_web.rest.repository.BalenciagaRepository;
import balenciaga_web.rest.repository.BalenciagaRepository2;

@RestController
public class BalenciagaController {
	@CrossOrigin(origins = "*")
	@GetMapping("/sample")
	public String getSample(){
		return "성공";
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/chara")
	public ArrayList<Chara> getChara(){
		
		Chara missfortune = new Chara("버텨요, 할 수 있는게 많지 않잖아?",200,100,"지겨워 질 때 즈음, 다시 시작되고 바닥인거 같은데 더 바닥을 쳐요, 이럴 때 일 수록 맛있는걸 먹어요, 맛있는것만 먹다보면 더 맛있는게 기다릴 거에요. 죽을힘을 다해 맛있는것만 먹어요.","aa1.jpg");
		Chara garen = new Chara("초록초록초록해",100, 150, "세상을 식혀줘 초록해 씻는게 귀찮아서 이러는게 아니야 그냥 조금만 식혀줘."
				+ " ","bb1.jpg");
		Chara gragas = new Chara("무지개비",200,100,"그게 싫은건 아닌데, 적당히 무지개정도만 만들어주고 그만 왔음 좋았잖아.","cc1.jpg");
		Chara nami = new Chara("파도에 몸을 싣자",100, 150, " 사실 잘 못타는데, 바다위에 서있는게 좋아.. 언제 갈 수 있을까 지금이라도 당장 가고싶다.","dd1.jpg");
		
		ArrayList<Chara> charaList = new ArrayList<Chara>();
		
		charaList.add(missfortune);
		charaList.add(garen);
		charaList.add(gragas);
		charaList.add(nami);
		
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
	  public ResponseEntity<List<Reply>> getAllTutorials(@RequestParam(required = false) String content) {
	    try {
	      List<Reply> replies = new ArrayList<Reply>();

	      if (content == null)
	    	balenciagaRepository.findAll().forEach(replies::add);
	      else
	    	balenciagaRepository.findByContentContaining(content).forEach(replies::add);

	      if (replies.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }

	      return new ResponseEntity<>(replies, HttpStatus.OK);
	    } catch (Exception e) {
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
	  public ResponseEntity<List<Reply>> findByPublished() {
	    try {
	      List<Reply> tutorials = balenciagaRepository.findByPublished(true);

	      if (tutorials.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      return new ResponseEntity<>(tutorials, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
}
