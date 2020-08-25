package balenciaga_web.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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
		
		Chara missfortune = new Chara("미스 포츈, 현상금 사냥꾼",200,100,"미스 포츈은 상대방을 압박하여 성장을 방해하는 원거리 챔피언으로 초반에 강력한 모습을 보입니다. 패시브 기술인 활보와 공격 스킬들을 사용하여 빠르게 적을 견제하고 도주할 수 있습니다.","aa.jpg");
		Chara garen = new Chara("가렌,데마시아의 힘",100, 150, "가렌은 고유의 회복 효과로 전투를 오래 지속할 수 있는 챔피언입니다. 회복 능력은 레벨이 오를수록 강화되어 빠른 속도로 체력을 회복하게 됩니다. 궁극기로는 적에게 고정 피해를 입힐 수 있어 방어력을 무시하고 공격할 수 있습니다.","bb.jpg");
		Chara gragas = new Chara("그라가스, 술취한 난동꾼",200,100,"그라가스는 광역 공격과 진형 붕괴가 특징인 AP 챔피언입니다. 궁극기를 사용하면 상대방을 밀쳐내거나 당겨올 수 있어서 적의 진형을 무너뜨리거나 특정 상대를 빼내오는 것도 가능합니다. 몸통 박치기로 얇은 벽을 넘어 다닐 수 있습니다.","aa.jpg");
		Chara nami = new Chara("나미, 파도 소환사",100, 150, "나미는 아군 원거리 AD를 보호하는데 특화된 챔피언으로 아군의 체력 회복과 동시에 적군에게 피해를 줄 수 있습니다. 또한, 버프 스킬을 보유하고 있어 아군 원거리 AD의 스펙을 상향시켜 줄 수도 있습니다. 나미의 가장 큰 강점은 멀고 넓은 사거리를 보유한 궁극기로 해당 스킬을 잘 활용하면 효과적으로 아군을 보호할 수 있습니다.","bb.jpg");
		
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
	 
}
