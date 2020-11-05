//시간이 없어서 이것 밖에 못함

//2개의 에러가 있음.
//String cannot be converted to Integer
//			Integer student = sc.nextLine();
//			                             ^
//2 errors



import java.util.Scanner;
import java.util.ArrayList;

public class HomeWork13th{
	public static void main(Integer[] args){
		ArrayList<Integer> arrayList = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");

		while(student>=0){
			Integer student = sc.nextLine();
			arrayList.add(student);
		}
		for(int i : arrayList){
			System.out.println("점 : " + i);
		}
	}
}

