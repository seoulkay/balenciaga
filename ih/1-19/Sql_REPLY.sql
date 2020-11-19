#읽기
SELECT * FROM kay.Reply;
#쓰기 
INSERT INTO kay.Reply(instaId, description) VALUES ("inst_22", "드디어 글을 저장할수 있어....");
#수정
UPDATE kay.Reply SET instaId="aaa222", description="이제 수정도 되네요" WHERE id=2;
#삭제
DELETE FROM kay.Reply WHERE id=2;
