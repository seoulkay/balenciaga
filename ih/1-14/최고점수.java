//어래이 리스트 만든다. ArrayList<Integer> arrayList = new ArrayList<>();

//반복한다1시작 while(true)
	//점수를 입력하세요 라고 말한다..System.out.println
	//입력한 숫자를 읽는다. int s = sc.nextInt();
	//음수면 반복을 그만한다. if(s < 0){break;}
	//어래이 리스트에 넣는다.arrayList.add(s);
//반복한다1끝

//68 90 88

//최고점은 0점이다. int max = 0;

//전체 학생은 "어레이리스트 사이즈" 명이다. 라고 출력
//학생들의 성적 :

//반복 "어레이리스트 순서대로 출력" for(int i =0 ; i < arrayList.size() ; i++)
	//숫자를 읽는다. arrayList.get(i)
	//숫자를 최고점과 비교하고 크면 최고점에 넣는다. if(arrayList.get(i) > max){max = arrayList.get(i);}

//반복 for(int i =0 ; i < arrayList.size() ; i++)
//"i"번 학생의 성적은 "get(i)"점이며 등급은 ""이다.
//등급 최고점수 -10은 a 혹은 -20 b 아니면 c if(arrayList.get(i) > max - 10){"a"}else if(arrayList.get(i) > max - 20){b}else{c}
//함수 파라미터는(max, 현재점수) 리턴 String: A,B,C  



//파라미터는 숫자 어레이리스트, 리턴을 최고점수하는 함수를 만든다.
//최고 점수를 찾자. int max
	//배열을 하나 더 만들고 복사 
	//원래 배열 오름차순으로 정렬 맨마지막 숫자



//배열 값이랑 i랑 더해서 100이초과 하면 멈춤
/*i = 10
	j = 0
	68+i > 100?	
	90+i > 100? j == 1
	"j가 최고값이다!"  break;
	*/

//만점을 알지 못하면 못씀
//이중반복을 해야되는점

/*68+90+88/반으로 나누고 =?
0이 될때까지 뺀다.

3.4 + 4.5 + 4.4 = 12*/


/*for(int i =0 ; i < arrayList.size()+1 ; i++){
	arrayList.add(a);
} 무한 반복을 하는 방식?*/
