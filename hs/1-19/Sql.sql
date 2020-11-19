
#읽기
SELECT * FROM hong.Reply;
#쓰기
INSERT INTO hong.Reply(instaId, description) VALUES ("inst_22", "드디어 글을 저장할 수 있어...");
#수정
UPDATE hong.Reply SET instaId="aaa222", description="이제 수정도 되네요" WHERE id=2;
#삭제 
DELETE FROM hong.Reply WHERE id=2;
