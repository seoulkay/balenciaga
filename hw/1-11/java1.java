//JavaTest.java

//터미널 명령어 
//cd Desktop/ (데스크탑 폴더로 이동)
//ls -lrt (폴더에 있는 것 확인하기)


//java - 코드 파일
//java -> class(컴퓨터가 이해하는 2진수)로 바꿔주는 과정을 컴파일 이라고 한다.
//class - 바이너리(2진수) 파일


//컴파일
//javac JavaTest1.java
//JavaTest1.class 생성
//실행할 때는 java JavaTest1

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

		//변수
		int a = 1;
		String b = "문자변수";
		double c = 1.1;
		boolean d = true;
		char e = 'e';   // 한글자짜리 용도

		//정수 byte short int long 는 각각 메모리 크기와 표현 가능 범위가 있다.
		//실수 float double  역시 각각 메모리 크기와 소수점 처리양에 따라 나뉘어짐. 그냥 더블 써라.


		//단향연산자 i++ i를 1 더하고 그다음 연산을 해라 ++i 연산을 하고서 i를 더해라.

		//for(int i = 0 : i < 10 ; i++){

		//}

		//우선순위!!
		//꼭 괄호를 써라.

		//문자열 비교는 equal로 해라. 나머지는 ==, !=
		String f = "문자변수";
		String g = "숫자변수";
		System.out.println(b.equals(f));
		System.out.println(!b.equals(g));

		for(int i = 0 ; i < 10 ; i++){
			System.out.println(i);
		}		

		int i = 0;
		while(i < 10){
			System.out.println(i);
			i++;
		}

		int[] arraya = {1,2,3,4,5,6,7,8,9};

		for(int j = 0; j <arraya.length ; j++){
			System.out.println(arraya[j]);
		}

		//향상된 반복문! foreach
		for(int ele : arraya){
			System.out.println(ele+"가 향상되었다.");
		}
		int plustest = plus(3,6);
		System.out.println(plustest);

		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		//sc.close();

		System.out.println("제 이름은 " +name+ "입니다.");



		//가위바위보 게임

		String[] rsp = {"가위","바위","보"};
		boolean win = true;
		int point = 0;

		//Scanner sc = new Scanner(System.in);

		while(win){
			System.out.println("가위바위보.");
			String player = sc.nextLine();

			Random random = new Random();
			String computer = rsp[random.nextInt(3)];



			if(player.equals("가위")){
				if(computer.equals("가위")){
					System.out.println("너는"+player+"컴퓨터는"+computer+" 그래서 비김.");
				}else if(computer.equals("바위")){
					System.out.println("너는"+player+"컴퓨터는"+computer+" 네가 짐.");
					win = false;
				}else{
					System.out.println("너는"+player+"컴퓨터는"+computer+" 네가 이김.");
					point++;
				}
			}else if(player.equals("바위")){
				if(computer.equals("가위")){
					System.out.println("너는"+player+"컴퓨터는"+computer+" 네가 이김.");
					point++;
				}else if(computer.equals("바위")){
					System.out.println("너는"+player+"컴퓨터는"+computer+" 그래서 비김.");
				}else{
					System.out.println("너는"+player+"컴퓨터는"+computer+" 네가 짐.");
					win = false;
				}			
			}else if(player.equals("보")){
				if(computer.equals("가위")){
					System.out.println("너는"+player+"컴퓨터는"+computer+" 네가 짐.");
					win = false;
				}else if(computer.equals("바위")){
					System.out.println("너는"+player+"컴퓨터는"+computer+" 네가 이김.");
					point++;
				}else{
					System.out.println("너는"+player+"컴퓨터는"+computer+" 비김.");
				}			
			}else{
				System.out.println("가위 바위 보 중에서 내라고 이 사람아.");
				break;
			}
		}

		sc.close();
		System.out.println("당신의 이름은 "+name+" 이며, 당신의 총 점수는 "+point+"입니다.");

		//System.out.println(computer);

		
		//int rand = 0;


	}
	//커스텀 펑션은 메인 펑션 밖에

	//메소드 정의
	//아무나 접근 가능 / 프로그램이 시작할 때 메모리에 올림 / 리턴타입이 숫자 / 메소드 이름 /
	//숫자 두개를 받는다.

	public static int plus(int a, int b){
		int result = a+b;
		return result;
	}
}
