package balenciaga_web.rest.entity;

public class Reply {
	public String id;
	public String content;
	public String date;
	public int point;
	//생성자
	public Reply(String id, String content, String date, int point) {
		this.id = id;
		this.content = content;
		this.date = date;
		this.point = point;
	}

}
