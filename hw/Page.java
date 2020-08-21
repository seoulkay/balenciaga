package pack3;

import java.util.ArrayList;

public class Page {
	String artistTitle;
	String songTitle;
	String releaseDate;
	String desc;
	int playCount;
	int likeCount;
	
	//제너릭 
	ArrayList<Reply> replies = new ArrayList<Reply>();
	
	public int getRepliesNumber() {
		return replies.size();	
	}

	//생성자 
	public Page(String artistTitle, String songTitle, String releaseDate, String desc, int playCount, int likeCount) {
		this.artistTitle = artistTitle;
		this.songTitle = songTitle;
		this.releaseDate = releaseDate;
		this.desc = desc;
		this.playCount = playCount;
		this.likeCount = likeCount;
	}
}
