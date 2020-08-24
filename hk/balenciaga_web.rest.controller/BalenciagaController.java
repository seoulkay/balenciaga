package balenciaga_web.rest.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import balenciaga_web.rest.entity.Chara;
import balenciaga_web.rest.entity.Info;
import balenciaga_web.rest.entity.Reply;


@RestController
public class BalenciagaController {
	@CrossOrigin(origins = "*")
	@GetMapping("/sample")
	public String getSample(){
		return "성공";
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/info")
	public ArrayList<Info> getInfo(){
		Info lol = new Info("bg.jpg","League of Legend", "라이엇 게임즈가 개발 및 서비스 중인 MOBA 장르의 게임. 국내에선 게임 명칭의 앞 글자들을 따서 롤(LoL), 서양에서는 League 등으로 불린다.");
		
		ArrayList<Info> infoList = new ArrayList<Info>();
		
		infoList.add(lol);
		
		return infoList;
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/chara")
	public ArrayList<Chara> getChara(){
		Chara missfortune = new Chara("미스 포츈", "Miss Fortune", "현상금 사냥꾼", "The Bounty Hunter","미스 포츈은 상대방을 압박하여 성장을 방해하는 원거리 챔피언으로 초반에 강력한 모습을 보입니다. 패시브 기술인 활보와 공격 스킬들을 사용하여 빠르게 적을 견제하고 도주할 수 있습니다.", "원거리, 둔화","aa.jpg",790, 3150);
		Chara garen = new Chara("가렌", "Garen", "데마시아의 힘", "The Might of Demacia","가렌은 고유의 회복 효과로 전투를 오래 지속할 수 있는 챔피언입니다. 회복 능력은 레벨이 오를수록 강화되어 빠른 속도로 체력을 회복하게 됩니다. 궁극기로는 적에게 고정 피해를 입힐 수 있어 방어력을 무시하고 공격할 수 있습니다.", "전사, 탱커, 침묵","bb.jpg",260, 450);
		Chara ash = new Chara("애쉬", "Ashe", "서리 궁수", "The Fros Archer","애쉬는 원거리 공격 챔피언으로 기본적인 능력을 가지고 있습니다.생존기가 없는대신 정찰능력과 감속 효과 기술을 가지고 있습니다.궁극 기술은 엄청난 사정거리를 가지고 있지만 잘 적중시키려면 상당한 숙련도가 필요합니다.궁극이 적중하면 굉장히 긴 기절 효과가 있기 때문에 팀에 큰 기여를 하게 됩니다.", "원거리, 정찰, 둔화, 기절","cc.jpg",260, 450);
		Chara zac = new Chara("자크", "Zac", "비밀 병기", "The Secret Weapon","자크는 정글, 탑에서 자주 운영되는 챔피언으로 자신의 체력을 소비하여 스킬을 사용합니다. 자크는 먼 거리를 도약할 수 있는 새총발사 스킬 덕분에 갱킹과 도주에 매우 강한 모습을 보입니다. 또한, 적 진영을 붕괴시킬 수 있는 궁극기 덕분에 훌륭한 이니시에이터로도 활용할 수 있습니다.", "탱커, 전사, 띄우기, 탈출, 둔화, 치유","dd.jpg",880, 4800);
		
		ArrayList<Chara> charaList = new ArrayList<Chara>();
		
		charaList.add(missfortune);
		charaList.add(garen);
		charaList.add(ash);
		charaList.add(zac);
		
		
		return charaList;
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("chara/reply")
	public float getReply(){
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

		sum = sum/replyList.size();
		
		return sum;
		
	}
}
