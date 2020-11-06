import java.util.Scanner;
import java.util.ArrayList;

public class HomeWork13th{
	public static void main(String[] args){
		//빈 어레이리스트 만들기
		ArrayList<Integer> arrayList = new ArrayList<>();
		//점수를 입력받을 스캐너 정의하기 
		Scanner sc = new Scanner(System.in);
		
		//점수를 반복해서 입력받는 로직
		while(true){
			System.out.println("점수를 입력하세요.");
			int s = sc.nextInt();
			if(s < 0){
				break;  //입력값이 음수면 반복 끝
			}
			arrayList.add(s); //입력값을 어레이리스트에 추가
		}	
		
		//완성한 어레이리스트의 값들을 출력
		for(int i : arrayList){
			System.out.println("점수를 입력하세요 : " + i);
		}
		//의문점은 음수값(ex. -1)은 출력되지 않는데 어떻게 하면 표시할 수 있는지 아직 모르겠음.
		
		//학생수와 성적을 출력
		System.out.println("전체 학생은 " + arrayList.size()+" 명이다.");		
		
		//한 줄 안에 배열 내용 출력
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
