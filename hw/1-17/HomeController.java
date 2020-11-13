package www.coldestseason.me;

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

import www.coldestseason.me.entity.Feed;
import www.coldestseason.me.entity.Post;
import www.coldestseason.me.entity.Reply;
import www.coldestseason.me.entity.User;


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
		//나의 커스텀 코드 시작!
		int result = plus(1,2);
		model.addAttribute("result", result );
		
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("홍성");
		studentList.add("해원");
		studentList.add("일환");
		model.addAttribute("studentList", studentList );
		
		
		
		//인스타그램 시작//
		
		Feed feed1 = new Feed();
		
		
		Post post1 = new Post();
		post1.setDescription("떠나요 셋이서. 제주도 푸른 밤 그 별 아래... 아파트 담벼락 보다는 별을 볼 수 있는 창문이 좋아요. 일환과 해원, 홍성 세 친구가 여행을 갈 수 있게 도와주세요.");
		post1.setLikeNumber(769);
		post1.setWriterId("jeju_island");	
		post1.setPicture("insta01.png");
		post1.setAvatarPic("insta02.png");

		Date time1 = new Date();
		time1.setTime(1605107812000l);
		post1.setCreate(time1);
		post1.setAgo(agoCalculate(post1.getCreate()));
		

		
		Post post2 = new Post();
		post2.setDescription("작업실 내놓습니다. 채광이 끝내주는 서교동 작업실입니다. 방음 정말 잘 됩니다. 옆 방 소리가 하나도 들리지 않아요.");
		post2.setLikeNumber(2342);
		post2.setWriterId("abbeyroad_official");	
		post2.setPicture("post03.jpg");
		post2.setAvatarPic("img_avatar03.jpg");
		
		Date time2 = new Date();
		time2.setTime(1602429412000l);
		post2.setCreate(time2);
		post2.setAgo(agoCalculate(post2.getCreate()));
		
		
		
		Post post3 = new Post();
		post3.setDescription("존맛! 넘나 맛있는 하몽~~~");
		post3.setLikeNumber(122);
		post3.setWriterId("food_fighter");	
		post3.setPicture("jamon.jpg");
		post3.setAvatarPic("food_fight.png");
		
		Date time3 = new Date();
		time3.setTime(1605283870000l);
		post3.setCreate(time3);
		post3.setAgo(agoCalculate(post3.getCreate()));
		
		
		ArrayList<Post> postList = new ArrayList<Post>();
		postList.add(post1);
		postList.add(post2);
		postList.add(post3);

		
		
		Reply reply1 = new Reply();
		reply1.setReplyId("jiyeon1004");
		reply1.setDescription("나 넘나 가고파");
		reply1.setReplyLike(false);
		
		Reply reply2 = new Reply();
		reply2.setReplyId("sowon_jjang");
		reply2.setDescription("제주에 살자~");
		reply2.setReplyLike(false);
		
		Reply reply3 = new Reply();
		reply3.setReplyId("seoul_seoul");
		reply3.setDescription("아파트 가격 떨어지는 소리하네");
		reply3.setReplyLike(true);	
		
		ArrayList<Reply> replyList1 = new ArrayList<Reply>();
		replyList1.add(reply1);
		replyList1.add(reply2);
		replyList1.add(reply3);
		replyList1.add(reply3);
		
		ArrayList<Reply> replyList2 = new ArrayList<Reply>();
		replyList2.add(reply3);
		replyList2.add(reply1);
		replyList2.add(reply2);
		replyList2.add(reply1);
		
		
		ArrayList<Reply> replyList3 = new ArrayList<Reply>();
		replyList3.add(reply2);
		replyList3.add(reply1);
		replyList3.add(reply3);
		replyList3.add(reply2);
		replyList3.add(reply3);
		
		
		post1.setReplyNumber(replyList1.size());
		post1.setReplyList(replyList1);
		
		post2.setReplyNumber(replyList2.size());
		post2.setReplyList(replyList2);
		
		post3.setReplyNumber(replyList3.size());
		post3.setReplyList(replyList3);
		
		//리플라이 리스트에서 인스타 아이디 대표자 넣어주기 
		post1.setLikeInstaId(likeInstaIdCal(replyList1));
		post2.setLikeInstaId(likeInstaIdCal(replyList2));
		post3.setLikeInstaId(likeInstaIdCal(replyList3));
		
		
		User me = new User();
		me.setAvatar("img_avatar.png");
		me.setInstaId("kimhaewonmusic");
		me.setRealName("Haewon Kim");
		
		//int replyNum = replyList.size();
		
		//feed1.setPostList(postList);
		
		//for(int i = 0; i < postList.size(); i++){
		//	postList.get(i).setReplyNumber(replyList.size());
		//	postList.get(i).setReplyList(replyList);
		//}
		
		//post1.setReplyNumber(replyList.size());
		//post1.setReplyList(replyList);
		
		model.addAttribute("postList", postList);
		model.addAttribute("me", me);
		//model.addAttribute("post", post1);
		//model.addAttribute("feed", feed1);
		
		
		
		//MVC Model View-->jsp Controller--->java
		//나의 커스텀 코드 끝!
		return "home";
	}
	
	
	public static Integer plus(int a, int b) {
		return a+b;
	}

	
	public static String agoCalculate(Date create) {
		
		Date now = new Date();
		
		//몇 분 전에 쓴 글인지 계산 
		long agoTemp = (now.getTime() - create.getTime())/1000/60;
		//한시간 전이면 몇분 전에 썼다고 하기
		//하루 전이면 몇시간 전에 썼다고 하기
		//아니면 몇일 썼다고 하기
		
		String agoResult ="";
		
		if(agoTemp < 60) {
			
			if(agoTemp ==1) {
				agoResult = agoTemp+"분 전";
			}else{
				agoResult = agoTemp+"분들 전";
			}
			
		}else if(agoTemp < (60*24)){
			if(agoTemp < 60*2){
				agoResult = (agoTemp/60)+"시간 전";
			}else {
				agoResult = (agoTemp/60)+"시간들 전";
			}

		}else{
			if(agoTemp < (60*24*2)) {
				agoResult = (agoTemp/60/24)+"일 전";
			}else {
				agoResult = (agoTemp/60/24)+"일들 전";
			}
		}
		
		return agoResult;
				
	}
	
	public static String likeInstaIdCal(ArrayList<Reply> replyList) {
		Random random = new Random();
		Reply pick = replyList.get( random.nextInt(replyList.size()) );
		return pick.getReplyId();
	}
	
	
}
