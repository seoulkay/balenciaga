package balenciaga_web.rest.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import balenciaga_web.rest.entity.Chara;
import balenciaga_web.rest.entity.Reply;


@RestController
public class BalenciagaController {
	@CrossOrigin(origins = "*")
	@GetMapping("/sample")
	public String getSample(){
		return "성공";
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/chara")
	public ArrayList<Chara> getChara(){
		Chara missfortune = new Chara("미스 포츈", "Miss Fortune", "현상금 사냥꾼", "The Bounty Hunter","미스 포츈은 상대방을 압박하여 성장을 방해하는 원거리 챔피언으로 초반에 강력한 모습을 보입니다. 패시브 기술인 활보와 공격 스킬들을 사용하여 빠르게 적을 견제하고 도주할 수 있습니다.", "원거리, 둔화",790, 3150);
		Chara garen = new Chara("가렌", "Garen", "데마시아의 힘", "The Might of Demacia","가렌은 고유의 회복 효과로 전투를 오래 지속할 수 있는 챔피언입니다. 회복 능력은 레벨이 오를수록 강화되어 빠른 속도로 체력을 회복하게 됩니다. 궁극기로는 적에게 고정 피해를 입힐 수 있어 방어력을 무시하고 공격할 수 있습니다.", "전사, 탱커, 침묵",260, 450);
		
		ArrayList<Chara> charaList = new ArrayList<Chara>();
		
		charaList.add(missfortune);
		charaList.add(garen);
		
		return charaList;
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("chara/reply")
	public ArrayList<Reply> getReply(){
		Reply r1 = new Reply("삼hatchery","이친구는 몇달연속 1티어인데 노잼이라 별 문제가 안됨 ㅋㅋㅋㅋㅋ", "2020-04-18",4);
		Reply r2 = new Reply("트레버","얘 E랑 코그모 E 바꿨으면 좋겠다...", "2020-04-18",5);
		Reply r3 = new Reply("아쌈","일러스트 깡패 인게 실패", "2020-04-18",4);
		
		ArrayList<Reply> replyList = new ArrayList<Reply>();
		
		replyList.add(r1);
		replyList.add(r2);
		replyList.add(r3);

		float sum = 0;
		for(int i = 0; i<replyList.size(); i++) {
			sum = sum+replyList.get(i).point;
		}

		System.out.println(sum/replyList.size());
		
		return replyList;
		
	}
}
