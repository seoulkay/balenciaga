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

import balenciaga_web.rest.entity.BigJson;
import balenciaga_web.rest.entity.BigJsonChild;
import balenciaga_web.rest.entity.Chara;
import balenciaga_web.rest.entity.Reply;
import balenciaga_web.rest.repository.BalenciagaRepository;

import java.util.ArrayList;
import java.util.List;

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
		
		Chara missfortune = new Chara("미스포츈", 200, 100,"미스 포츈은 상대방을 압박하여 성장을 방해하는 원거리 챔피언으로 초반에 강력한 모습을 보입니다. 패시브 기술인 활보와 공격 스킬들을 사용하여 빠르게 적을 견제하고 도주할 수 있습니다." ,"aa.jpg");
		Chara garen = new Chara("가렌", 100, 150, "가렌은 고유의 회복 효과로 전투를 오래 지속할 수 있는 챔피언입니다. 회복 능력은 레벨이 오를수록 강화되어 빠른 속도로 체력을 회복하게 됩니다. 궁극기로는 적에게 고정 피해를 입힐 수 있어 방어력을 무시하고 공격할 수 있습니다.", "bb.png");		
		Chara missfortune2 = new Chara("미스포츈2", 200, 100,"미스 포츈은 상대방을 압박하여 성장을 방해하는 원거리 챔피언으로 초반에 강력한 모습을 보입니다. 패시브 기술인 활보와 공격 스킬들을 사용하여 빠르게 적을 견제하고 도주할 수 있습니다." ,"aa.jpg");
		Chara garen2 = new Chara("가렌2", 100, 150, "가렌은 고유의 회복 효과로 전투를 오래 지속할 수 있는 챔피언입니다. 회복 능력은 레벨이 오를수록 강화되어 빠른 속도로 체력을 회복하게 됩니다. 궁극기로는 적에게 고정 피해를 입힐 수 있어 방어력을 무시하고 공격할 수 있습니다.", "bb.png");		
		
		
		ArrayList<Chara> charaList = new ArrayList<Chara>();
		
		charaList.add(missfortune);
		charaList.add(garen);
		charaList.add(missfortune2);
		charaList.add(garen2);
		
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

	 

	
}
