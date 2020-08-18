package pack1;

public class Car {
	//속성 fields
	String model;
	String brand;
	String color;
	String image;
	int speed;
	int oil;
	
	//동작 methods
	public void CarInfo() {
		System.out.println("모델:"+model);
		System.out.println("브랜드:"+brand);
		System.out.println("색:"+color);
		System.out.println("사진:"+image);
	}
	
	public void AccelCar(int p1) {
		System.out.println(model+" "+p1+"만큼 속도를 더 냅니다.");
		this.speed = this.speed + p1;
		System.out.println("현재속도는 "+speed+"입니다.");
	}
	
	public void StopCar() {
		System.out.println("브레이크 밟았어요.");
		this.speed = 0;
		System.out.println("현재속도는 "+speed+"입니다.");
	}
	
	public void AddOil(int o1) {
		System.out.println("기름을 "+o1+"만큼 더 넣습니다.");
		this.oil = this.oil + o1;
		System.out.println("현재 기름은 "+oil+"만큼 있습니다.");
	}
}
