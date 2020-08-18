package pack1;

public class CharacterUse {
	public static void main(String[] args) {
	   Character missfortune = new Character();
	   missfortune.name = "미스포츈";
	   missfortune.hp = 100;
	   missfortune.mp = 150;
	   missfortune.skin = "기본스킨";
	   
	   Character garen = new Character();
	   garen.name = "가렌";
	   garen.hp = 200;
	   garen.mp = 50;
	   garen.skin = "졸라멋진 스킨";
	   
	   System.out.println(missfortune.hp);
	   System.out.println(garen.hp);
	   
	   missfortune.attack();
	   garen.getDamage(10);
	   System.out.println(garen.hp);
	}
}
