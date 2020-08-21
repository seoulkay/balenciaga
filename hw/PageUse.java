package pack3;

import java.util.ArrayList;


public class PageUse {
	public static void main(String[] args) {
		
		Page myPage1 = new Page("김해원", "새 앨범","오랜만에 나온 거창한 신보", "20년 8월 20일", 350, 170);
		Reply r1 = new Reply("이일환", "노래가 너무 좋아서 매일 들어요.", "8월 20일 9시 1분", 4);
		myPage1.replies.add(r1);
		
		Page myPage2 = new Page("김해원", "예전 앨범", "싱어송라이터의 첫 걸음마", "19년 12월 8일", 300, 50);
		Reply s1 = new Reply("이일환", "노래 똑바로 불러라.듣다가 꺼버림.", "12월12일 12시", 1);
		Reply s2 = new Reply("홍성", "방탄소년단 새 노래 들으러 오세요.", "12월13일 12시", 5);
		myPage2.replies.add(s1);
		myPage2.replies.add(s2);				
				
		ArrayList<Page> myPages = new ArrayList<Page>();
				
		myPages.add(myPage1);
		myPages.add(myPage2);
				
		for(int i = 0 ; i < myPages.size(); i++) {
			System.out.println("아티스트" + "  " + myPages.get(i).artistTitle);
			System.out.println("앨범" + "  " + myPages.get(i).songTitle);
			System.out.println("발매일" + "  " + myPages.get(i).releaseDate);
			System.out.println("앨범 정보" + "  " + myPages.get(i).desc);
			System.out.println("재생 횟수" + "  " + myPages.get(i).playCount);
			System.out.println("좋아요" + "  " + myPages.get(i).likeCount);
			
			for(int j = 0 ; j < myPages.get(i).getRepliesNumber(); j++) {
					System.out.println("  " + myPages.get(i).replies.get(j).userName + "  " + myPages.get(i).replies.get(j).content+ "  " + myPages.get(i).replies.get(j).date+ "  " + myPages.get(i).replies.get(j).starPoint + "점");		
					}
			System.out.println("----------");
			}
		}
	}
