package www.gesi.com;

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
import org.springframework.web.servlet.view.RedirectView;

import www.gesi.com.MySql;
import www.gesi.com.entity.Post;
import www.gesi.com.entity.Reply;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
			@RequestMapping(value = "/postDeleteAction", method = RequestMethod.GET)
			public RedirectView postDeleteAction(Locale locale, Model model, int id) {
				MySql mysql = new MySql();
				mysql.getConnection();
				mysql.deletePost(id);
				return new RedirectView("postAll");
			}
	
			@RequestMapping(value = "/postUpdateAction", method = RequestMethod.POST)
			public RedirectView postUpdateAction(Locale locale, Model model, String postId, String postTitle, String description, int id) {
				MySql mysql = new MySql();
				mysql.getConnection();
				mysql.updatePost( postId, postTitle, description, id);
				return new RedirectView("postAll");
			}
	
			@RequestMapping(value = "/postUpdateForm", method = RequestMethod.GET)
			public String postUpdateForm(Locale locale, Model model, int id) {
				MySql mysql = new MySql();
				mysql.getConnection();
				
				Post postUpdate = new Post();
				postUpdate = mysql.getPostUpdate(id);
				
				model.addAttribute("postUpdate", postUpdate);
				return "postUpdateForm";
			}
	

			@RequestMapping(value = "/postAll", method = RequestMethod.GET)
			public String postAllPage(Locale locale, Model model, String search) {
				MySql mysql = new MySql();
				mysql.getConnection();
				
				System.out.println(search);
					
					model.addAttribute("search", search);
				if(search==null ) {
					ArrayList<Post>postList = mysql.getPostList();
					model.addAttribute("postList", postList);
				}else {
					ArrayList<Post>postList = mysql.getPostSearchList(search);	
					model.addAttribute("postList", postList);
				}
				
				return "postAll";
			}
			
			
			@RequestMapping(value = "/post", method = RequestMethod.GET)
			public String postOnePage(Locale locale, Model model, int id) {
				MySql mysql = new MySql();
				mysql.getConnection();
				
				Post postOne = new Post();
				postOne = mysql.getPostOne(id);
				
				ArrayList<Reply> replyList = new ArrayList<Reply>();
				replyList = mysql.getReplyList(id);
				
				model.addAttribute("postOne", postOne);
				model.addAttribute("replyList", replyList);
				return "post";
			}
			
			@RequestMapping(value = "/replyFormAction", method = RequestMethod.POST)
			public RedirectView postFormAction(Locale locale, Model model, String userId, String description, int id) {
			
				MySql mysql = new MySql();
				mysql.getConnection();
				mysql.insertReply( userId, description, id);
				return new RedirectView("post?id="+id);
			}
	
	//겟으로 /postForm이 왔을때 postForm.jsp로 가주세요.
			@RequestMapping(value = "/postFormAction", method = RequestMethod.POST)
			public RedirectView postFormAction(Locale locale, Model model, String postId, String postTitle, String description) {
			
				MySql mysql = new MySql();
				mysql.getConnection();
				mysql.insertPost( postId, postTitle, description);
				return new RedirectView("postForm");
			}
			
			
			
			
			@RequestMapping(value = "/postForm", method = RequestMethod.GET)
			public String postForm(Locale locale, Model model) {
				return "postForm";
			}
			
			
	
}
