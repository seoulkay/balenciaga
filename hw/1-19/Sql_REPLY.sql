#읽기
SELECT * FROM hw_utf8.Reply;
#쓰기
INSERT INTO hw_utf8.Reply(replyId, description) VALUES ("inst_22", "드디어 글을 저장할 수 있어...");

#수정
UPDATE hw_utf8.Reply SET replyId="aaa222", description="이제 수정도 되네요." WHERE id=2;

#삭제
DELETE FROM hw_utf8.Reply WHERE id=3;
