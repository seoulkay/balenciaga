package balenciaga_web.rest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Map;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
//import javax.transaction.Transactional; ???

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
		
		Chara missfortune = new Chara("앨범 소식", "aa.jpg", "1집 <바다와 나의 변화, 2018>", 200, 100);
		Chara garen = new Chara("영화음악", "bb.jpg", "<소셜포비아>,<윤희에게>", 100, 150);
		Chara missfortune2 = new Chara("실험음악", "cc.jpg", "Mago: Music For Photography", 200, 100);
		Chara garen2 = new Chara("작업공간", "dd.jpeg", "작업실을 구하고 있는 중입니다.", 100, 150);
		
		ArrayList<Chara> charaList = new ArrayList<Chara>();
		
		
		charaList.add(missfortune);
		charaList.add(garen);
		charaList.add(missfortune2);
		charaList.add(garen2);
		
		return charaList;
	}
	//객체자동생성 
	  @Autowired
	  BalenciagaRepository balenciagaRepository;
	  
	  @CrossOrigin(origins = "*")
	  @PostMapping("/reply")
	  public ResponseEntity<Reply> createReply(@RequestBody Reply reply) {
	    try {
	      Reply _reply = balenciagaRepository.save(new Reply(reply.getContent(), reply.getWriter(), reply.getPassword(), true));
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
	    	e.printStackTrace();
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
	  
	  
	  @Autowired
	  BalenciagaRepository2 balenciagaRepository2;
	  
	  @CrossOrigin(origins = "*")
	  @PostMapping("/subscribe")
	  public ResponseEntity<Subscribe> createSubscribe(@RequestBody Subscribe subscribe) {
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
	  public ResponseEntity<List<Subscribe>> getAllSubscribe(@RequestParam(required = false) String inputEmail) {
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
