package www.iamk.shop;

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
		
		model.addAttribute("result", result );
		
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("홍성");
		studentList.add("해원");
		studentList.add("일환");
		
		model.addAttribute("studentList", studentList );
		
		//Model View Controller
		//나의커스텀코드 끝!
		return "home";
	}
	
	public static int plus(int a, int b) {
		return a+b;
	}
	
}
