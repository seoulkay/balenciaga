package pack1;

import java.util.ArrayList;

public class PageUse {

	public static void main(String[] args) {
		//페이지를 만들고
		Page myPage1 = new Page("미스 포츈", "Miss Fortune", "현상금 사냥꾼", "The Bounty Hunter","미스 포츈은 상대방을 압박하여 성장을 방해하는 원거리 챔피언으로 초반에 강력한 모습을 보입니다. 패시브 기술인 활보와 공격 스킬들을 사용하여 빠르게 적을 견제하고 도주할 수 있습니다.", "원거리, 둔화",790, 3150);
		
    //포인트를 만들고
		Point s1 = new Point(30, "4.53 졈");
		//포인트를 페이지에 추가
    myPage1.points.add(s1);
		
		//리플을 만들고
		Reply m1 = new Reply("삼hatchery","이친구는 몇달연속 1티어인데 노잼이라 별 문제가 안됨 ㅋㅋㅋㅋㅋ", "2020-04-18");
		Reply m2 = new Reply("트레버","얘 E랑 코그모 E 바꿨으면 좋겠다...", "2020-04-18");
		Reply m3 = new Reply("아쌈","일러스트 깡패 인게 실패", "2020-04-18");
		//리플을 페이지에 추가
		myPage1.replies.add(m1);
		myPage1.replies.add(m2);
		myPage1.replies.add(m3);

		
		Page myPage2 = new Page("가렌", "Garen", "데마시아의 힘", "The Might of Demacia","가렌은 고유의 회복 효과로 전투를 오래 지속할 수 있는 챔피언입니다. 회복 능력은 레벨이 오를수록 강화되어 빠른 속도로 체력을 회복하게 됩니다. 궁극기로는 적에게 고정 피해를 입힐 수 있어 방어력을 무시하고 공격할 수 있습니다.", "전사, 탱커, 침묵",260, 450);
		
    Point s2 = new Point(20, "3.44 점");
		myPage2.points.add(s2);

    Reply g1 = new Reply("아키상어","가렌 상향이 필요하다 q침묵 마스터하면2초 w예날 롤빽해줘야한다.", "2020-7-7");
		Reply g2 = new Reply("멍파치","가렌 너무 약하다...ㄹㅇ 상향 필수", "2020-4-6");
    myPage2.replies.add(g1);
		myPage2.replies.add(g2);
		
		
		ArrayList<Page> myPages = new ArrayList<Page>();
		
		myPages.add(myPage1);
		myPages.add(myPage2);
		
		for(int i = 0; i<myPages.size(); i++) {
			System.out.println(myPages.get(i).title+", "+myPages.get(i).nickname);
			System.out.println(myPages.get(i).engTitle+", "+myPages.get(i).engNickname);
			System.out.println(myPages.get(i).hp+" "+myPages.get(i).mp);
			System.out.println();
			System.out.println(myPages.get(i).desc);
			System.out.println("특징: "+myPages.get(i).feature);
			System.out.println();
			for(int k = 0; k<myPages.get(i).points.size();k++) {
				System.out.println("롤 인벤 유저들의 평가"+"      "+"참여자: "+myPages.get(i).points.get(k).total+"명");
				System.out.println(myPages.get(i).points.get(k).starPoint);				
			}
			System.out.println();
			System.out.println("코멘트("+myPages.get(i).replies.size()+")");
			for(int j = 0; j<myPages.get(i).replies.size();j++) {
				System.out.println("       "+myPages.get(i).replies.get(j).id+"   "+myPages.get(i).replies.get(j).content+"   "+myPages.get(i).replies.get(j).date);
			}
			System.out.println();
			
		}

	}

}
