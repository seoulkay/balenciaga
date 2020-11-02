
//java - 코드 파일
//바꿔주는 과정을 컴파일
//class - 바이너리(2진수) 파일

//컴파일
//javac JavaTest1.java
//JavaTest1.class 생성
//java JavaTest1
import java.util.Scanner;
import java.util.Random;


public class JavaTest1{
	public static void main(String[] args){
		System.out.println("헬로월드");
		System.out.println(1+2);
		System.out.println(2*5);		
		System.out.println(6/2);
		System.out.println('헬');
		//홍성이가 "안녕"이라고 말했다.
		System.out.println("홍성이가 \"안녕\"이라고\n 말했다.");
		
		int a = 1;
		String b = "문자변수";
		double c = 1.1;
		boolean d = true;
		char e = 'e';

		//꼭 괄호써라.
		//(10+((20+20)*30))

		//문자열 비교는 equal로 해라
		String f = "문자변수";
		System.out.println(b.equals(f));

		for(int i = 0 ; i < 10 ; i++){
			System.out.println(i);
		}

		int i = 0;
		while(i < 10){
			System.out.println(i);
			i++;
		}
		int[] arraya = {1,2,3,4,5,6,7,8,9};

		for(int j = 0 ; j < arraya.length ; j++){
			System.out.println(arraya[j]);
		}

		//향상된 반복문! foreach
		for(int ele : arraya){
			System.out.println(ele+"가 향상되었다.");
		}
		int plustest = plus(3, 6);
		System.out.println(plustest);



		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		

		System.out.println("제이름은 "+name+"입니다.");


		
		int point = 0;
		boolean win = true;
		while(win){
			System.out.println("가위바뷔보 중에서 입력하세요.");
			String player = sc.nextLine();

			int result = rsp(player);
			
			if(result == 1){
				point++;
			}else if(result == 2){

			}else{
				win = false;
			}
		}

		sc.close();

		System.out.println("당신의 이름은 "+name+" 이며, 당신의 총 점수는 "+point+"입니다.");

	}	


	//메소드 정의
	//아무나 접근 가능 / 프로그램이 시작할때 메모리올림 / 리턴타입이 숫자 / 메소드 이름 / 숫자 두개를 받는다.
	public static int plus(int a, int b){
		int result = a+b;
		return result;
	}

	public static int rsp(String player){
			//1 승리 2 비김 3 짐
			String[] rsp = {"가위", "바위", "보"};
			
			Random random = new Random();
			String computer = rsp[random.nextInt(3)];
			
			if(player.equals("가위")){
				if(computer.equals("가위")){
					System.out.println("너는"+player+"컴퓨터는"+computer+"그래서 비김.");
					return 2;
				}else if(computer.equals("바위")){
					System.out.println("너는"+player+"컴퓨터는"+computer+"너가 짐.");
					return 3;
				}else{
					System.out.println("너는"+player+"컴퓨터는"+computer+"너가 승리.");
					return 1;
				}
			}else if(player.equals("바위")){
				if(computer.equals("가위")){
					System.out.println("너는"+player+"컴퓨터는"+computer+"너가 승리.");
					return 1;
				}else if(computer.equals("바위")){
					System.out.println("너는"+player+"컴퓨터는"+computer+"우리는 비김.");
					return 2;
				}else{
					System.out.println("너는"+player+"컴퓨터는"+computer+"컴퓨터의 승리.");
					return 3;
				}
			}else if(player.equals("보")){
				if(computer.equals("가위")){
					System.out.println("너는"+player+"컴퓨터는"+computer+"컴퓨터의 승리.");
					return 3;
				}else if(computer.equals("바위")){
					System.out.println("너는"+player+"컴퓨터는"+computer+"너만의 승리.");
					return 1;
				}else{
					System.out.println("너는"+player+"컴퓨터는"+computer+"우리는 비김.");	
					return 2;	
				}
			}else{
				System.out.println("가위 바위 보중에서 내라고 이사람아!");
				return 3;
			}
	}
}
