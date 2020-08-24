package balenciaga_web.rest.entity;

public class Chara {
	public String title;
	public String engTitle;
	public String nickname;
	public String engNickname;
	public String desc;
	public String feature;
	public String img;
	public int hp;
	public int mp;
	
	//생성자
	public Chara(String title, String engTitle, String nickname, String engNickname, String desc, String feature, String img, int hp, int mp) {
		//this.객체속성에 매개변수를 대입해 준다.
		this.title = title;
		this.engTitle = engTitle;
		this.nickname = nickname;
		this.engNickname = engNickname;
		this.desc = desc;
		this.feature = feature;
		this.img = img;
		this.hp = hp;
		this.mp = mp;
	}

}
