package balenciaga_web.rest.entity;

public class Info {
	public String imgLol;
	public String titleLol;
	public String descLol;
	
	//생성자
	public Info(String imgLol, String titleLol, String descLol) {
		//this.객체속성에 매개변수를 대입해 준다.
		this.imgLol = imgLol;
		this.titleLol = titleLol;
		this.descLol = descLol;
	}

}
