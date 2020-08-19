package pack3;

import java.util.ArrayList;

public class PageUse {
	public static void main(String[] args) {
		//페이지를 만들고 
		Page myPage = new Page("미포", "missfortuen","롤케릭", 100, 150);
		//리플을 만들고
		Reply r1 = new Reply("바보", "재밌어요", "7월6일12시");
		//리플을 페이지에 추가
		myPage.replies.add(r1);
		//페이지에 리플몇개인지 세는 메소드 실행
	
		
		//ArrayList<Car> repairlist = new
		//페이지를 만들고 
		Page myPage1 = new Page("가렌", "missfortuen","롤케릭", 100, 150);
		//리플을 만들고
		Reply r11 = new Reply("바보", "재밌어요", "7월6일12시");
		Reply r12 = new Reply("바보", "재밌어요", "7월6일12시");
		//리플을 페이지에 추가
		myPage1.replies.add(r1);
		myPage1.replies.add(r12);
		myPage1.replies.add(r11);
		
		//페이지에 리플몇개인지 세는 메소드 실행
			
		
		ArrayList<Page> myPages = new ArrayList<Page>();
		
		myPages.add(myPage);
		myPages.add(myPage1);
		
		for(int i = 0 ; i < myPages.size(); i++) {
			System.out.println(myPages.get(i).title);
			System.out.println(myPages.get(i).desc);
			for(int j = 0 ; j < myPages.get(i).getRepliesNumber(); j++) {
				System.out.println("  "+myPages.get(i).replies.get(j).content);
				
			}
			System.out.println();
		}
		
		
	}
}
