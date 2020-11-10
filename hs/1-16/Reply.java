package www.tellmebaby.shop.entity;

public class Reply {
	//속성:
	//댓글 단사람 아이디
	private String instaId;
	//댓글 내용
	private String description;
	//댓글 라이크
	private boolean replyLike;
	//댓글 총갯수
	private int replyTotal;
	
	
	
	public int getReplyTotal() {
		return replyTotal;
	}
	public void setReplyTotal(int replyTotal) {
		this.replyTotal = replyTotal;
	}
	public String getInstaId() {
		return instaId;
	}
	public void setInstaId(String instaId) {
		this.instaId = instaId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isReplyLike() {
		return replyLike;
	}
	public void setReplyLike(boolean replyLike) {
		this.replyLike = replyLike;
	}

}

