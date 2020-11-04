import java.util.*;

public class ArrayListTest{
	public static void main(String[] args){
		ArrayList<Integer> arrayList = new ArrayList<>();
		ArrayList<Integer> arrayList2 = new ArrayList<>();

		arrayList.add(0);
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(0,10);

		arrayList2.add(20);
		arrayList2.add(30);
		arrayList2.add(40);

		arrayList.addAll(arrayList2);

		arrayList.remove(1);

		for(int i : arrayList){
			System.out.println("값 : " + i);
		}

		List<Integer> list = arrayList.subList(0,6);

		for(int i : arrayList){
			System.out.println("arrayList : " + i);
		}

		System.out.println("-------------------------");

		for(int i : list){
			System.out.println("subList 메소드로 가져온 List : " + i);
		}

		for(int i : arrayList2){
			System.out.println("arrayList2 : " + i);
		}

	}
}
