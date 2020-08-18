package pack1;

public class CarUse {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.model="GLS580";
		car1.brand="벤츠";
		car1.color="블랙";
		car1.speed=60;
		car1.oil=20;
		
		Car car2 = new Car();
		car2.model="5.0SC";
		car2.brand="랜드로버";
		car2.color="그레이";
		car2.speed=50;
		car2.oil=40;
		
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
