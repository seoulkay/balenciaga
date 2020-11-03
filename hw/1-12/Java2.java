//package mypackage;
//import mypackage.Car;

import java.util.ArrayList;

public class JavaTest2{

	//메인에 있는 것만 실행한다.
	
	//Car를 메인에서 가져다가 쓴다.

	public static void main(String[] args){
		//객체(클래스) Car / 인스턴스 c, c2
		Car c = new Car("검정",2);
		Car c2 = new Car("파랑",3);
		Car c3 = new Car("레드",4);
		//Human h = new Human();
		//Table t = new Table();
		
		//멤버변수 접근
		//System.out.println(c.color);
		//멤버메소드 접근
		//c.forward();

		//이 어레이리스트에는 Car만 넣을 거다. "제네릭".
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(c);  //0
		carList.add(c2); //1
		carList.add(c3); //2

		carList.remove(1);
		carList.add(c2);

		for(int i = 0; i < carList.size(); i++){
			System.out.print(carList.get(i).color+"차가 ");
			carList.get(i).forward();
		}

		ElecCar ec = new ElecCar("파랑",4);
		//ec.forward();
		//ec.charge();
		//System.out.println(ec.voltage);
		//System.out.println(plus(1,2));
		//System.out.println(plus(1,2,3));
		//System.out.println(plus(1,2,3,4));


	}

/////////////////////////////////////////////
	//이너 클래스  // 설계도
	public static class Car{
	//객체는 변수(특징)이랑 메소드의 집합체이다.

		//멤버 변수 //기본값
		String color = "빨강";
		int door = 4;		
		
		//생성자 // 리턴만 없애면 돼! // 클래스랑 이름이 같아야됨.
		public Car(String color, int door){
			//뭔가 해줘야함.
			this.color = color;
			this.door = door;
		}

		//멤버 메소드
		public void forward(){
			System.out.println("앞으로 갑니다.");
		}
	}

/////////////////////전기자동차는 자동차를 상속
	public static class ElecCar extends Car{

		//생성자를 만들어줘야함.
		public ElecCar(String color, int door){
			//아빠한테 생성자 인자를 전달해야함.
			super(color,door);
		}

		int voltage = 110;		
		public void charge(){
			System.out.println("전기충전");
		}
		//오버라이드 - 아빠의 말을 무시
		public void forward(){
			System.out.println("전기차는 뒤로 갑니다.");
		}
	}
	//오버로딩
	//오버로딩과 오버라이드는 전혀 관련이 없다.
	//오버로딩은 함수를 다양하게 쓰기 위해서 쓰는 기법이다.
	public static int plus(int p1, int p2){
		return p1+p2;
	}

	public static int plus3(int p1, int p2, int p3){
		return p1+p2+p3;
	}

	public static int plus(int p1, int p2, int p3){
		return p1+p2+p3;
	}

	public static int plus(int p1, int p2, int p3, int p4){
		return p1+p2+p3+p4;
	}

	//String a[] = {"2","2","4"};
	//베열을 그냥 쓰면 여러모로 좋지 않다.
	//컬렉션 - arrayList 배열리스트








}
