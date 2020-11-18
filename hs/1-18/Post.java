package www.tellmebaby.shop.entity;

import java.util.ArrayList;
import java.util.Date;

public class Post {
	//포스트 아이디
	private long postNumber;
	
	//속성 :
	//사진
	private String picture;
	
	//글 
	//게시자 아바타 
	private String postIdPicture;
	//게시자 인스타 아이디
	private String postId;
	//게시자 위치
	//게시 시간
	private Date create;
	//게시 몇일전
	private String ago;
	//본문
	private String description;
	//좋아요 숫자
	private	int likeNumber;
	//종하요 배열
	private ArrayList <Like>  likeList = new ArrayList<Like>();
	//좋아요 누른 대표자 인스타 아이디
	private String likeInstaId;
	//좋아요 누른 대표자 인스타 아바타
	//댓글들
	private ArrayList<Reply> replyList = new ArrayList<Reply>();
	//댓글숫자
	private int replyNumber;
	private int replyTotal;
	
	
	
	
	
	public ArrayList<Like> getLikeList() {
		return likeList;
	}
	public void setLikeList(ArrayList<Like> likeList) {
		this.likeList = likeList;
	}
	public long getPostNumber() {
		return postNumber;
	}
	public void setPostNumber(long postNumber) {
		this.postNumber = postNumber;
	}
	public String getLikeInstaId() {
		return likeInstaId;
	}
	public void setLikeInstaId(String likeInstaId) {
		this.likeInstaId = likeInstaId;
	}
	public String getAgo() {
		return ago;
	}
	public void setAgo(String ago) {
		this.ago = ago;
	}
	public Date getCreate() {
		return create;
	}
	public void setCreate(Date create) {
		this.create = create;
	}
	public String getPostIdPicture() {
		return postIdPicture;
	}
	public void setPostIdPicture(String postIdPicture) {
		this.postIdPicture = postIdPicture;
	}
	public int getReplyTotal() {
		return replyTotal;
	}
	public void setReplyTotal(int replyTotal) {
		this.replyTotal = replyTotal;
	}
	public ArrayList<Reply> getReplyList() {
		return replyList;
	}
	public void setReplyList(ArrayList<Reply> replyList) {
		this.replyList = replyList;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public int getReplyNumber() {
		return replyNumber;
	}
	public void setReplyNumber(int replyNumber) {
		this.replyNumber = replyNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getLikeNumber() {
		return likeNumber;
	}
	public void setLikeNumber(int likeNumber) {
		this.likeNumber = likeNumber;
	}
	
	
	//메소드
	//좋아요 버튼 누르기
	//세어 버튼누르
	//댓글쓰기
	//북마크 하기
	//큰화면으로 보기
	//기능보기
	//사진 넘기기
	//어더스 : 좋아요 누른 사람 보여주기
	//좋아요 누를 대표자 인스타 보여주기
	//모어 : 본문 크게 보
	
}

//해시테그 누르기 -> 헤시테그 검
