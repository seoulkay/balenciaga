package balenciaga_web.rest.entity;

public class Chara {
	public String name;
	public String img;
	public String desc;
	public int hp;
	public int mp;
	
	public Chara (String name, int hp, int mp, String desc, String img) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.desc = desc;
		this.img = img;
				
	}
			
	
}
