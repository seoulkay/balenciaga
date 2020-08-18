package pack1;

public class CarUse {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.model="GLS580";
		car1.brand="벤츠";
		car1.color="블랙";
		car1.speed=60;
		car1.oil=20;
		car1.image = "https://search.pstatic.net/common?type=f&size=128x76&quality=75&direct=true&src=https%3A%2F%2Fimgauto-phinf.pstatic.net%2F20200526_92%2Fauto_1590456200502mTVlf_PNG%2F20200526102317_a3HegZN5.png";
		
		Car car2 = new Car();
		car2.model="5.0SC";
		car2.brand="랜드로버";
		car2.color="그레이";
		car2.speed=50;
		car2.oil=40;
		car2.image = "https://search.pstatic.net/common?type=ofullfill&size=202x152&quality=95&direct=true&src=https%3A%2F%2Fimgauto-phinf.pstatic.net%2F20200508_58%2Fauto_1588901890960anoJM_JPEG%2F20200508103805_ZnrHaL0y.jpg";
		
		car1.CarInfo();
		car1.AccelCar(20);
		car1.StopCar();
		car1.AddOil(25);
		
		car2.CarInfo();
		car2.AccelCar(30);
		car2.StopCar();
		car2.AddOil(15);
		
	}

}
