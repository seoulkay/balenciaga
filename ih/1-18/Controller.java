
package www.iamk.shop;

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

import www.iamk.shop.entity.Like;
import www.iamk.shop.entity.Post;
import www.iamk.shop.entity.Reply;
import www.iamk.shop.entity.User;

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
		//나의커스텀코드시작!
		
		int result = plus(1,2);
		
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("홍성");
		studentList.add("해원");
		studentList.add("일환");
		
		//인스타 그램 시작//

	
		
		Post post1 = new Post();
		
		post1.setDescription("이것은 본문입니다. 해원이는 옷샀고요 홍성이는 술먹네요."); 
		post1.setLikeNumber(2999);
		post1.setInstaId("louisvuitton");
		post1.setPicture("gucci.png");
		Date time1 = new Date();
		time1.setTime(1605180050449l);
		post1.setCreate(time1);
		post1.setAgo(agoCalculator(post1.getCreate()));
		post1.setPostId(1);
		
		
		Post post2 = new Post();
		
		post2.setDescription("이것은 본문2입니다. 해원이는 옷샀고요 홍성이는 술먹네요."); 
		post2.setLikeNumber(2999);
		post2.setInstaId("louisvuitton");
		post2.setPicture("gucci.png");
		Date time2 = new Date();
		time2.setTime(1604180050449l);
		post2.setCreate(time2);
		post2.setAgo(agoCalculator(post2.getCreate()));
		post2.setPostId(2);
		
		Post post3 = new Post();
		
		post3.setDescription("이것은 본문3입니다. 해원이는 옷샀고요 홍성이는 술먹네요."); 
		post3.setLikeNumber(2999);
		post3.setInstaId("louisvuitton");
		post3.setPicture("gucci.png");
		Date time3 = new Date();
		time3.setTime(1583680050449l);
		post3.setCreate(time3);
		post3.setAgo(agoCalculator(post3.getCreate()));
		post3.setPostId(3);
		
		
		Reply reply1 = new Reply();
		reply1.setInstaId("d--d");
		reply1.setDescription("좋아요");
		reply1.setReplyLike(false);
		
		Reply reply2 = new Reply();
		reply2.setInstaId("akei_223");
		reply2.setDescription("ㅇㅇㅇ 좋은 제품이네요.");
		reply2.setReplyLike(false);
		
		Reply reply3 = new Reply();
		reply3.setInstaId("gucci_man");
		reply3.setDescription("이거 샀어요!");
		reply3.setReplyLike(true);
		
		ArrayList<Reply> replyList = new ArrayList<Reply>();
		replyList.add(reply1);
		replyList.add(reply2);
		replyList.add(reply3);
		
		ArrayList<Reply> replyList2 = new ArrayList<Reply>();
		replyList2.add(reply3);
		replyList2.add(reply2);
		replyList2.add(reply1);
		replyList2.add(reply1);
		replyList2.add(reply1);
		replyList2.add(reply2);
		
		ArrayList<Reply> replyList3 = new ArrayList<Reply>();
		replyList3.add(reply2);
		replyList3.add(reply1);
		replyList3.add(reply3);
		replyList3.add(reply3);
		replyList3.add(reply3);
		
		//포스트에 리플라이리스트 넣어주기
		post1.setReplyList(replyList);
		post1.setReplyNumber(replyList.size());
		
		post2.setReplyList(replyList2);
		post2.setReplyNumber(replyList2.size());
		
		post3.setReplyList(replyList3);
		post3.setReplyNumber(replyList3.size());
		
		//리플라이 리스트에서 인스타 아이디 대표자 넣어주기
		post1.setLikeInstaId(likeInstaIdCal(replyList));
		post2.setLikeInstaId(likeInstaIdCal(replyList2));
		post3.setLikeInstaId(likeInstaIdCal(replyList3));
		
		
		
		
		
		ArrayList<Post> postList = new ArrayList<Post>();
		
		postList.add(post1);
		postList.add(post2);
		postList.add(post3);
		
		User me = new User();
		me.setAvatar("img_avatar.png");
		me.setRealName("이일환");
		me.setInstaId("kayilhwanlee");
		
		User friend1 =new User();
		friend1.setAvatar("img_avatar.png");
		friend1.setRealName("친구1");
		friend1.setInstaId("chingoo1");
		
		User friend2 =new User();
		friend2.setAvatar("img_avatar.png");
		friend2.setRealName("친구2");
		friend2.setInstaId("chingoo2");
		
		User friend3 =new User();
		friend3.setAvatar("img_avatar.png");
		friend3.setRealName("친구3");
		friend3.setInstaId("chingoo1");
		
		User friend4 =new User();
		friend4.setAvatar("img_avatar.png");
		friend4.setRealName("친구4");
		friend4.setInstaId("chingoo4");
		
		User friend5 =new User();
		friend5.setAvatar("img_avatar.png");
		friend5.setRealName("친구5");
		friend5.setInstaId("chingoo5");
		
		ArrayList<User> friendList = new ArrayList<User>();
		friendList.add(friend1);
		friendList.add(friend2);
		friendList.add(friend3);
		friendList.add(friend4);
		friendList.add(friend5);
		
		
		Like like1 = new Like();
		like1.setCreate(new Date());
		like1.setInstaId("like1Doer");
		like1.setPostId(1);
		
		Like like2 = new Like();
		like2.setCreate(new Date());
		like2.setInstaId("like2Doer");
		like2.setPostId(1);
		
		Like like3 = new Like();
		like3.setCreate(new Date());
		like3.setInstaId("like3Doer");
		like3.setPostId(1);
		
		
		ArrayList<Like> likeList = new ArrayList<Like>();
		likeList.add(like1);
		likeList.add(like2);
		likeList.add(like3);
		
		//라이크리스트를 분류해서 포스트 리스트의 각각의 포스트의 라이크 리스트에 넣어줘야 되.
		
		
		//for포스트를 돌리고
		//빈 라이크 배열은 만들고
			//for라이크를 돌려
			//아이디가 맞았을때 빈라이크 배열에다가 넣는다.
			//라이크 반복이 끝났을때 빈라이크 배열을 포스트에 넣는다.
		
		for(int i = 0 ; i < postList.size() ; i++) {
			ArrayList<Like> resultLikeList = new ArrayList<Like>();
			for(int j = 0 ; j < likeList.size() ; j++) {
				if(postList.get(i).getPostId() == likeList.get(j).getPostId()) {
					resultLikeList.add(likeList.get(j));
				}
			}
			postList.get(i).setLikeList(resultLikeList);
		}
		
		
		//모델 보내는 부분
		
		model.addAttribute("studentList", studentList );
		model.addAttribute("result", result );
		model.addAttribute("friendList", friendList);
		model.addAttribute("me", me);
		model.addAttribute("postList", postList);

		//Model View Controller
		//나의커스텀코드 끝!
		return "home";
	}
	
	public static int plus(int a, int b) {
		return a+b;
	}
	

	
	public static String agoCalculator(Date create) {
				Date now =  new Date();
		
				//몇분전에 쓴 글인지 확인
				long agoTemp = (now.getTime() - create.getTime()) / 1000 / 60;
				 
				String agoResult = "";
				
				if(agoTemp < 60) {
					//한시간 전이면 몇분 전에 썼다고 하기
					if(agoTemp == 1) {
						agoResult = agoTemp+" minute ago";
					}else {
						agoResult = agoTemp+" minutes ago";
					}
				}else if(agoTemp < (60*24)) {
					//하루 전이면 몇시간 전에 썼다고 하기
					if(agoTemp < 60*2) {
						//두시간 전이면 hour ago
						agoResult = (agoTemp/60)+" hour ago";
					}else {
						agoResult = (agoTemp/60)+" hours ago";
					}
					
				}else {
					//아니면 몇일전에 썼다고 하기
					if(agoTemp < (60*24*2)) {
						//이틀 전이면 day ago
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
