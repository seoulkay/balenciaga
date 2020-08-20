package pack3;

import java.util.ArrayList;

public class PageUse {
	public static void main(String[] args) {
		int y = 3; //항목개수
		int a = 4+3+2;//별점총합
		int avr = (a/y);

		//System.out.println(myPage.);
		//페이지를 만들고 
		Page myPage = new Page("미스 포츈, 현상금 사냥꾼", "Miss Fortune, The Bounty Hunter","원거리,둔화", 750, 3150, avr);
		//리플을 만들고
		Reply r1 = new Reply("삼hatchery", "이친구는 몇달연속 1티어인데 노잼이라 별 문제가 안됨 ㅋㅋㅋㅋㅋ",4, "2020-04-18");
		Reply r2 = new Reply("이거맞나요", "미포는 성장 공속을 너프할게 아니라 성장공속 돌려주고 e 사거리를 지금에 "
				+ "절반으로 범위는 30-40% 줄여야함. 미포가 뜨는 이유는 라인전 자체가 강한편이기도 하지만 발빠르고 먼거리에서 "
				+ "광역 슬로우로 갱회피도 가능하고 갱호응도 가능해서임. 거기에 s급 궁까지 너무 쉽고 완벽하게 연계 할 수 있음. "
				+ "e만 지금 성능의 절반이하로 줄여 버려도 밸런스 잡을 수 있음",3, "2020-04-10");
		Reply r3 = new Reply("송도케이", "ㅂㅌㅂㅌㅂㅌㅂㅌㅂㅌㅂㅌㅂㅌㅂ",2, "2020-04-17");
		//리플을 페이지에 추가
		myPage.replies.add(r1);
		myPage.replies.add(r2);
		myPage.replies.add(r3);
		//페이지에 리플몇개인지 세는 메소드 실행
		myPage.getRepliesNumber();

		//ArrayList<Car> repairlist = new
		//페이지를 만들고 
		int y1 = 3; //항목개수
		int a1 = 3+4+2;//별점총합
		int avr1 = (a1/y1);

		Page myPage1 = new Page("가렌,데마시아의 힘","Garen, The Might of Demacia","전사,탱커,침묵",260,450,avr1);
		//리플을 만들고
		Reply r11 = new Reply("씨말", "특히 공포의 기사 끼고 솔랭돌리는 ^ㄲ들이 제일이해안됨",3, "2020-08-15");
		Reply r12 = new Reply("삭제된 글", "**삭제된 글입니다**",4, "2020-07-23");
		Reply r13 = new Reply("로롤로롤로로롤로", "ㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌㅌ",2, "2020-07-10");
		//리플을 페이지에 추가
		myPage1.replies.add(r11);
		myPage1.replies.add(r12);
		myPage1.replies.add(r13);
		myPage.getRepliesNumber();
		
		int y2 = 1; //항목개수
		int a2 = 3;//별점총합
		int avr2 = (a2/y2);
		Page myPage2 = new Page ("그라가스, 술취한 난동꾼", "Gragas, The Rabble Rouser","전사,마법사,탈출,밀치기,둔화,기절", 790, 3150,avr2);
		Reply r21 = new Reply("스코라","ㅋㅋㅋㅋㅋ",3,"2020-05-01");
		myPage2.replies.add(r21);
		myPage.getRepliesNumber();
		
		int y3 = 1; //항목개수
		int a3 = 2;//별점총합
		int avr3 = (a3/y3);
		Page myPage3 = new Page ("나미, 파도 소환사", "Nami, the Tidecaller","서포터, 마법사, 띄우기, 기절, 치유, 둔화", 880, 4800,avr3);
		Reply r31 = new Reply("도둑고양이년","누커들한테 한방에따임..자리잘잡아야함..물감옥 잘쓰면 사기",2,"2020-03-01");
		myPage3.replies.add(r31);
		myPage.getRepliesNumber();
		
		ArrayList<Page> myPages = new ArrayList<Page>();

		myPages.add(myPage);
		myPages.add(myPage1);
		myPages.add(myPage2);
		myPages.add(myPage3);
		
		for(int i = 0 ; i < myPages.size(); i++) {
			System.out.println(myPages.get(i).title+" ("+myPages.get(i).engTitle+")");
			System.out.println("특징"+"-"+myPages.get(i).desc+"|"+"평점:"+myPages.get(i).ss);
			for(int j = 0 ; j < myPages.get(i).getRepliesNumber(); j++) {
				System.out.println("  "+myPages.get(i).replies.get(j).id+" | "+
						myPages.get(i).replies.get(j).content+" | 별점 : "+
						myPages.get(i).replies.get(j).ss+" | "+
						myPages.get(i).replies.get(j).date);

			}
			System.out.println();
			
		}

		
	}
}
