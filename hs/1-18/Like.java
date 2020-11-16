package www.tellmebaby.shop.entity;

import java.util.Date;

public class Like {
	//인스타아이디 //누가 좋아요를 했
	private String instaId;
	
	//포스트의 아이디 //무엇을 좋아요를 했나
	private long postId;
	
	//타임스탬프 //언제 좋아요를 했나
	private Date create;

	public String getInstaId() {
		return instaId;
	}

	public void setInstaId(String instaId) {
		this.instaId = instaId;
	}

	public long getPostId() {
		return postId;
	}

	public void setPostId(long postId) {
		this.postId = postId;
	}

	public Date getCreate() {
		return create;
	}

	public void setCreate(Date create) {
		this.create = create;
	}
	
	

}
