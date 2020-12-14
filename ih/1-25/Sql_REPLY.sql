SELECT * FROM hong.gesiPost;


#Create Read Update Delete - CRUD완성! 축하
#Search Reply 대댓글 조회수 Paging!

#글이 없습니다. 보여주기.

#검색 (디스크립션에 다라는 글이 들어있는 포스트를 보여주세요)
SELECT * FROM hong.gesiPost WHERE postId like "%%" OR postTitle like "%%" OR description like "%%"; 

#댓글
