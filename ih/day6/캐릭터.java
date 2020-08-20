package pack1;

public class Character {
	
	//속성 fields
	String name;
	String skin;
	int hp;
	int mp;
	
	//동작 methods
	public void attack() {
		System.out.println("공격");
	}
	public void getDamage(int p1) {
		System.out.println("아퍼");
		this.hp = this.hp - p1;
	}
	public void die() {
		System.out.println("소환사가 당했습니다.");
	}
	
}
