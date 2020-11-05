//아직 미완성.. 이것 밖에 못 했음
//에러가 많이 뜨고 있음.

import java.util.Scanner;
import java.util.ArrayList;

public class HomeWork13th{
	public static void main(String[] args){
		ArrayList<Integer> arrayList = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");

		//arrayList.add(student);

		int s = sc.nextInt();

		while(s>=0){
		arrayList.add(s);
		}

		for(int i : arrayList){
			System.out.println("점 : " + i);
		}
	}
}
