import java.util.ArrayList;
import java.util.Scanner;


public class bestpoint
{

	public static void main (String [] args)
	{
		System.out.println("즐거운 성적 입력 시스템에 로그인 되었습니다.");
		//어래이 리스트 만든다.
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{  //반복한다1시작
			System.out.print("학생들의 점수를 번호 순으로 입력해주세요. (*종료시 음수를 입력하세요.) : "); //점수를 입력하세요 라고 말한다.
			int s = sc.nextInt(); //입력한 숫자를 읽는다.
			if ( s < 0 ) //음수면 반복을 그만한다.
			{
				System.out.println("입력을 종료 합니다.");
				break;
			}
			arrayList.add(s); //어래이 리스트에 넣는다.


		}  //반복한다1끝
		sc.close();
		
		//68 90 88
		int max = 0; //최고점은 0점이다.

		System.out.println("전체 학생은 "+arrayList.size()+"명 입니다.");//전체 학생은 "어레이리스트 사이즈" 명이다. 라고 출력

		System.out.print("입력한 학생들의 성적 : ");//학생들의 성적 :
		for(int i = 0 ; i < arrayList.size(); i++)
		{
			System.out.print(arrayList.get(i)+" ");
		}
		System.out.println();


		for(int i = 0 ; i < arrayList.size() ; i++)
		{//반복 "어레이리스트 순서대로 출력"
			arrayList.get(i);//숫자를 읽는다.
			if(max < arrayList.get(i))
			{//숫자를 최고점과 비교하고 크면 최고점에 넣는다.
				max = arrayList.get(i);
			}
		}
		//반복 
		
		//"i"번 학생의 성적은 "get(i)"점이며 등급은 ""이다.
		for(int i =0 ; i < arrayList.size() ; i++)
		{//등급 최고점수 -10은 a 혹은 -20 b 아니면 c 
			System.out.print((i)+"번 학생의 성적은"+arrayList.get(i)+"점이며 등급은");
		if(arrayList.get(i) > max - 10)
			{
				System.out.println("A 입니다.");
			}
			else if(arrayList.get(i) > max - 20)
				{
					System.out.println("B 입니다.");
				}
					else
					{
						System.out.println("C 입니다.");
					}


		}
	System.out.println("시스템을 종료합니다. 3초후 폭발합니다.");
	}
}
