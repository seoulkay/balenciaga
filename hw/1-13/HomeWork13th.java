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
			System.out.print(arrayList.get(i)+"  ");			
		}
		System.out.println();




		int max = 0;



	}
