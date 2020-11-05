import java.util.Scanner;

public class Scan1{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		String name;
		int Math;
		String lv;

		System.out.print("번호?");
		name = sc.next();

		System.out.print("점수?");
		Math=sc.nextInt();

		/*if(Math>90){
			lv += "A";
		}else if(Math>70){
			lv += "B";
		}else{
			lv += "C";
		}*/

		//for문 if 변수만들기 변수 넣기 배역에서 읽기같은 연습이 더 필요함 
		System.out.println(name+"번 학생의 성적은"+Math+"점이며 등급은 A 이다.");
	}
}
