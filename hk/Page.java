package pack1;

import java.util.ArrayList;

public class Page {
	String title;
	String engTitle;
	String nickname;
	String engNickname;
	String desc;
	String feature;
	int hp;
	int mp;
	
	ArrayList<Point> points = new ArrayList<Point>();
	
	//제너릭
	ArrayList<Reply> replies = new ArrayList<Reply>();
	
	//int [] ra = new int[10];
	
	
	public int getRepliesNumber() {
		return replies.size();
	}
	
	//생성자
	public Page(String title, String engTitle, String nickname, String engNickname, String desc, String feature, int hp, int mp) {
		//this.객체속성에 매개변수를 대입해 준다.
		this.title = title;
		this.engTitle = engTitle;
		this.nickname = nickname;
		this.engNickname = engNickname;
		this.desc = desc;
		this.feature = feature;
		this.hp = hp;
		this.mp = mp;
	}

}
