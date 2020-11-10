package www.tellmebaby.shop;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import www.tellmebaby.shop.entity.Post;
import www.tellmebaby.shop.entity.Reply;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		//나의커스코드시작!
		
		int result = plus(1,2);
		
		
		model.addAttribute("result", result );
		
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("홍성");
		studentList.add("혜원");
		studentList.add("일환");
		
		model.addAttribute("studentList", studentList );
		
		//인스타 그램 시작//
		Post post1 = new Post();
		post1.setDescription("이것은 본문입니다. 해원이는 옷샀고요 홍성이는 술먹네요.");
		post1.setLikeNumber(2999);
		post1.setPostId("Louiviton");
		post1.setReplyNumber(450);
		post1.setPicture("gucci.png");
		
		
		Reply reply1 = new Reply();
		reply1.setInstaId("d--d");
		reply1.setDescription("좋아요");
		reply1.setReplyLike(true);
		
		Reply reply2 = new Reply();
		reply2.setInstaId("akei_223");
		reply2.setDescription("ㅇㅇㅇ좋은 제품이네요.");
		reply2.setReplyLike(false);
		
		Reply reply3 = new Reply();
		reply3.setInstaId("gucci_man");
		reply3.setDescription("이거 샀어요!");
		reply3.setReplyLike(true);
		
		ArrayList<Reply> replyList = new ArrayList<Reply>();
		replyList.add(reply1);
		replyList.add(reply2);
		replyList.add(reply3);
		
		Reply replyTotal = new Reply();
		replyTotal.setReplyTotal(replyList.size());
		post1.setReplyTotal(replyTotal.getReplyTotal());
		

		
		post1.setReplyList(replyList);
		
		model.addAttribute("post", post1);
		
		
		
		//나의커스텀코드 끝!
		return "home";
	}
	public static Logger getLogger() {
		return logger;
	}
	public static int plus(int p1, int p2) {
		return p1+p2;
	}
}

