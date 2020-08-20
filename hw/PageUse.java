package pack3;

public class PageUse {
	public static void main(String[] args) {
		
		Page myPage = new Page("김해원", "새 앨범","20년 8월 20일", 350, 170);
		Reply r1 = new Reply("이일환", "노래가 너무 좋아서 매일 들어요.", "8월 20일 9시 1분");
		myPage.replies.add(r1);
		System.out.println(myPage.getRepliesNumber());
		
		Page myPage1 = new Page("김해원", "예전 앨범","19년 12월 8일", 300, 50);
		Reply r11 = new Reply("이일환", "노래 똑바로 불러라.듣다가 꺼버림.", "12월12일 12시");
		Reply r12 = new Reply("홍성", "방탄소년단 새 노래 들으러 오세요.", "12월13일 12시");
		myPage1.replies.add(r1);
		myPage1.replies.add(r12);
		myPage1.replies.add(r11);				
				
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
