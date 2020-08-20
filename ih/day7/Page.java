//컨트롤 스페이스 자동완성 단축키
import java.util.ArrayList;

public class Page {
	String title;
	String engTitle;
	String desc;
	int hp;
	int mp;
	
	
	//제네릭
	ArrayList<Reply> replies = new ArrayList<Reply>();
	
	//int[] ra = new int[10];
	//Car myCar = new Car();
	//카멜 케이싱
	public int getRepliesNumber() {
		return replies.size();
	}
	
	//생성자
	public Page(String title, String engTitle, String desc, int hp, int mp) {
		this.title = title;
		this.engTitle = engTitle;
		this.desc = desc;
		this.hp = hp;
		this.mp = mp;
	}
	

	
}
