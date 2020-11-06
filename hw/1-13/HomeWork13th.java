import java.util.Scanner;
import java.util.ArrayList;

public class HomeWork13th{
	public static void main(String[] args){
		ArrayList<Integer> arrayList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.println("점수를 입력하세요.");
			int s = sc.nextInt();
			if(s < 0){
				break;
			}
			arrayList.add(s);
		}	
		
		for(int i : arrayList){
			System.out.println("점수를 입력하세요 : " + i);
		}

		System.out.println("전체 학생은 " + arrayList.size()+" 명이다.");		
		System.out.print("학생들의 성적 :  ");

		for(int i = 0; i < arrayList.size(); i++){
			System.out.print(arrayList.get(i)+"  "); //줄을 띄우지 않고 배열안의 점수를 나열시킨다.			
		}
		System.out.println(); // 한 줄 띄운다.

		
		//최고점의 출발을 0으로 하고 배열에 들어온 수를 차례로 맥스와 비교해서 최고점을 갱신시킨다.
		
		int max = 0;
		
		for(int i = 0; i < arrayList.size(); i++){
			if(arrayList.get(i) > max){
				max = arrayList.get(i);
			}
		}
		
		//System.out.println(max);  //최고 점수 확인

		
		//반복
		//i번 학생의 성적은 get(i)점이며, 등급은 "" 이다. 출력
		
		for(int i =0;i<arrayList.size(); i++){
			if(arrayList.get(i) >= max - 10){
				System.out.println(i+"번 학생의 성적은" + arrayList.get(i) + "이며, " + "등급은 A이다.");
			}else if(arrayList.get(i) >= max - 20){
				System.out.println(i+"번 학생의 성적은" + arrayList.get(i) + "이며, " + "등급은 B이다.");
			}else{
				System.out.println(i+"번 학생의 성적은" + arrayList.get(i) + "이며, " + "등급은 C이다.");
			}
		}


	}
}
