package pack3;

import java.util.ArrayList;

public class Page {
	String artistTitle;
	String songTitle;
	String releaseDate;
	int playCount;
	int likeCount;
	
	ArrayList<Reply> replies = new ArrayList<Reply>();
	
	public int getRepliesNumber() {
		return replies.size();	
	}

	public Page(String artistTitle, String songTitle, String releaseDate, int playCount, int likeCount) {
		this.artistTitle = artistTitle;
		this.songTitle = songTitle;
		this.releaseDate = releaseDate;
		this.playCount = playCount;
		this.likeCount = likeCount;
	}
}
