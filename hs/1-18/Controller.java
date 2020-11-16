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

import www.tellmebaby.shop.entity.Like;
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
		
		
		
		
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("홍성");
		studentList.add("혜원");
		studentList.add("일환");
		
		
		
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
		post1.setPostNumber(1);
		
		
		
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
		post2.setPostNumber(2);
		
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
		post3.setPostNumber(3);
		
		
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

		
		User me = new User();
		me.setPicture("img_avatar.jpeg");
		me.setInstaId("TellMeBaby407");
		me.setName("Tellmebaby");
		
		
		User guest1 = new User();
		guest1.setPicture("img_guest1.png");
		guest1.setInstaId("kayLee");
		guest1.setName("회원님을 위한 추천");
		

		User guest2 = new User();
		guest2.setPicture("img_guest2.png");
		guest2.setInstaId("haewon__kim");
		guest2.setName("인스타그램 추천");
		
		
		User guest3 = new User();
		guest3.setPicture("img_guest3.png");
		guest3.setInstaId("hyukoofficial");
		guest3.setName("인스타그램 추천");
		
		
		User guest4 = new User();
		guest4.setPicture("img_guest4.png");
		guest4.setInstaId("Haewon");
		guest4.setName("인스타그램 추천");
		
		
		User guest5 = new User();
		guest5.setPicture("img_guest5.png");
		guest5.setInstaId("Haewon");
		guest5.setName("인스타그램 추천");
		
		
		ArrayList<User> guests = new ArrayList<User>();
		guests.add(guest1);
		guests.add(guest2);
		guests.add(guest3);
		guests.add(guest4);
		guests.add(guest5);
		
		Like like1 = new Like();
		like1.setCreate(new Date());
		like1.setInstaId("like1doer");
		like1.setPostId(1);
		
		Like like2 = new Like();
		like2.setCreate(new Date());
		like2.setInstaId("like2doer");
		like2.setPostId(1);
		
		Like like3 = new Like();
		like3.setCreate(new Date());
		like3.setInstaId("like3doer");
		like3.setPostId(1);
		
		ArrayList<Like> likeList = new ArrayList<Like>();
		likeList.add(like1);
		likeList.add(like2);
		likeList.add(like3);
		
		//라이크 리스트를 분류해서 포스트 리스트의 라이크리스트에 넣어줘야 되.
		
		
		
		//for포스트를 돌리고
		
		//빈 라이크 배열을 만들
			//for라이크를 돌려
			//아이디가 맞았을때 포스트 안에 있는 라이크 리스트에 넣어라
			//라이크 반복이 끝났을때 빈라이크 배열을 포스트에 있는 라이크 리스트에 넣어라
			
		for(int i = 0 ; i < postList.size() ; i++) {
			ArrayList <Like> resultLikeList = new ArrayList<Like>();
			for(int j = 0 ; j < likeList.size(); j++) {
				if(postList.get(i).getPostNumber() == likeList.get(j).getPostId()) {
					resultLikeList.add(likeList.get(j));
				}
			}
			postList.get(i).setLikeList(resultLikeList);
		}
		
		
		//모델 보내는 부분
		model.addAttribute("studentList", studentList );
		model.addAttribute("result", result );
		model.addAttribute("postList", postList);
		model.addAttribute("me", me);
		model.addAttribute("guests", guests);
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
	//라이크 리스트에서 랜덤으로 아이디를 리턴하기 //TODO
	public static String likeInstaIdCal(ArrayList<Reply> replyList) {
		Random random = new Random();
		Reply pick = replyList.get(random.nextInt(replyList.size()));
		return pick.getInstaId();
	}
}
