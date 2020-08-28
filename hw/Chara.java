package balenciaga_web.rest.entity;

public class Chara {
	public String name;
	public String img;
	public String album;
	public int hp;
	public int mp;
	
	public Chara(String name, String img, String album, int hp, int mp) {
		this.name = name;
		this.img =  img;
		this.album = album;
		this.hp = hp;
		this.mp = mp;
	}
	
}
