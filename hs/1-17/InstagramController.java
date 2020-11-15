package www.tellmebaby.shop;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import www.tellmebaby.shop.entity.Post;
import www.tellmebaby.shop.entity.Reply;
import www.tellmebaby.shop.entity.User;

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
		Date now = new Date();
		Post post1 = new Post();
		post1.setDescription("이것은 본문1입니다. 해원이는 옷샀고요 홍성이는 술먹네요.");
		post1.setLikeNumber(2999);
		post1.setPostId("gucci");
		post1.setPicture("gucci.png");
		post1.setPostIdPicture("post1.png");
		Date time1 = new Date();
		time1.setTime(1605180050449l);
		post1.setCreate(time1);
		post1.setAgo(agoCalculator(post1.getCreate()));
		
		
		
		Post post2 = new Post();
		post2.setDescription("이것은 본문2입니다. 해원이는 옷샀고요 홍성이는 술먹네요.");
		post2.setLikeNumber(2999);
		post2.setPostId("gucci");
		post2.setPicture("gucci.png");
		post2.setPostIdPicture("post1.png");
		Date time2 = new Date();
		time2.setTime(1605160050449l);
		post2.setCreate(time2);
		post2.setAgo(agoCalculator(post2.getCreate()));
		
		Post post3 = new Post();
		post3.setDescription("이것은 본문3입니다. 해원이는 옷샀고요 홍성이는 술먹네요.");
		post3.setLikeNumber(2999);
		post3.setPostId("gucci");
		post3.setPicture("gucci.png");
		post3.setPostIdPicture("post1.png");
		Date time3 = new Date();
		time3.setTime(1604180050449l);
		post3.setCreate(time3);
		post3.setAgo(agoCalculator(post3.getCreate()));
		
		
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
		
		ArrayList<Reply> replyList1 = new ArrayList<Reply>();
		replyList1.add(reply1);
		replyList1.add(reply2);
		replyList1.add(reply3);
		
		ArrayList<Reply> replyList2 = new ArrayList<Reply>();
		replyList2.add(reply3);
		replyList2.add(reply2);
		replyList2.add(reply1);
		
		ArrayList<Reply> replyList3 = new ArrayList<Reply>();
		replyList3.add(reply2);
		replyList3.add(reply1);
		replyList3.add(reply3);
		
		post1.setReplyNumber(replyList1.size());
		post1.setReplyList(replyList1);
		
		post2.setReplyNumber(replyList2.size());
		post2.setReplyList(replyList2);
		
		post3.setReplyNumber(replyList3.size());
		post3.setReplyList(replyList3);
		
		post1.setLikeInstaId(likeInstaIdCal(replyList1));
		post2.setLikeInstaId(likeInstaIdCal(replyList2));
		post3.setLikeInstaId(likeInstaIdCal(replyList3));
		
		ArrayList<Post> postList = new ArrayList<Post>();
		
		postList.add(post1);
		postList.add(post2);
		postList.add(post3);
		model.addAttribute("postList", postList);
		
		User me = new User();
		me.setPicture("img_avatar.jpeg");
		me.setInstaId("TellMeBaby407");
		me.setName("Tellmebaby");
		model.addAttribute("me", me);
		
		User guest1 = new User();
		guest1.setPicture("img_guest1.png");
		guest1.setInstaId("kayLee");
		guest1.setName("회원님을 위한 추천");
		model.addAttribute("guest1", guest1);

		User guest2 = new User();
		guest2.setPicture("img_guest2.png");
		guest2.setInstaId("haewon__kim");
		guest2.setName("인스타그램 추천");
		model.addAttribute("guest2", guest2);
		
		User guest3 = new User();
		guest3.setPicture("img_guest3.png");
		guest3.setInstaId("hyukoofficial");
		guest3.setName("인스타그램 추천");
		model.addAttribute("guest3", guest3);
		
		User guest4 = new User();
		guest4.setPicture("img_guest4.png");
		guest4.setInstaId("Haewon");
		guest4.setName("인스타그램 추천");
		model.addAttribute("guest4", guest4);
		
		User guest5 = new User();
		guest5.setPicture("img_guest5.png");
		guest5.setInstaId("Haewon");
		guest5.setName("인스타그램 추천");
		model.addAttribute("guest5", guest5);
		
		//나의커스텀코드 끝!
		return "home";
	}
	public static Logger getLogger() {
		return logger;
	}
	public static int plus(int p1, int p2) {
		return p1+p2;
	}
	
	public static String agoCalculator(Date create) {
		
	Date now = new Date();
	
	long agoTemp = (now.getTime() - create.getTime())/ 1000 / 60;
		
	String agoResult = "";
		
	if (agoTemp < 60) {
			//한시간 전이면 몇분 전에 썼다고 하기
		if(agoTemp ==1) {
			agoResult = agoTemp+" minute ago";
		}else {
			agoResult = agoTemp+" minutes ago";
		}
	}else if(agoTemp < (60*24)) {
			//하루 전이면 몇시간 전에 썻다고 하기
		if(agoTemp < 60*2) {
			agoResult = (agoTemp/60)+" hour ago";
		}else {
			agoResult = (agoTemp/60)+" hours ago";
		}
	}else {
			//아니면 몇일전에 썼다고 하기
		if(agoTemp < (60*24*2)) {
			agoResult = (agoTemp/60/24)+" day ago";
		}else {
			agoResult = (agoTemp/60/24)+" days ago";
		}
	
	}
	return agoResult;
	}
	//리플라이리스트에서 랜덤으로 아이디를 가지고 오는
	public static String likeInstaIdCal(ArrayList<Reply> replyList) {
		Random random = new Random();
		Reply pick = replyList.get(random.nextInt(replyList.size()));
		return pick.getInstaId();
	}
}
