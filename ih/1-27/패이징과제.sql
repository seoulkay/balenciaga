SELECT * FROM hong.gesiPost order by id desc;

#첫번쨰 페이지33-29
SELECT * FROM hong.gesiPost order by id desc limit 5 offset 0;

#두번째 페이지25-21
SELECT * FROM hong.gesiPost order by id desc limit 5 offset 5;

#세번째 페이지19-9
SELECT * FROM hong.gesiPost order by id desc limit 5 offset 10;

#4번째 페이지는 8-6
SELECT * FROM hong.gesiPost order by id desc limit 5 offset 15;

#포스트 전체 보는 페이지의 url
#postall?pageSize=5&currentPage=0

#postall 아무것도 안넣을시 첫페이지로 가는 처리!
#if pageSize==null || currentPage==null
#pageSize = 5  
#currentPage=0

#전체 개수 / pageSize / currentPage
#전체 개수 -> totalSize
SELECT count(*) as totalSize FROM hong.gesiPost;

#컨트롤러 전체 포스트 보기 에서 System.out.println 토탈사이즈 표시 하기!

#PageManager.java
#private Integer pageSize
#private Integer currentPage
#private Integer totalSize


#pageSize / currentPage / totalSize
#세개의 값을 JSP 보낸다.
#totalSize를 pageSize나눈다
#나눈결과 만큼 pageItem을 반복 생성한다. 
#그리고 currentPage를 active파란색으로 표시한다.

#JSTL if 문법 검색!
