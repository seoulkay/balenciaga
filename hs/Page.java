package pack3;

import java.util.ArrayList;

public class Page {

		String title;
		String engTitle;
		String desc;
		int hp;
		int mp;
		int ss;
		
		ArrayList<Reply> replies = new ArrayList<Reply>();
		
		public int getRepliesNumber() {
			return replies.size();
		}
		// int sum = 0
		// public int sScore() {
		//	System.out.println()
		
		
		public Page(String title, String engTitle, String desc, int hp, int mp, int ss) {
			this.title = title;
			this.engTitle = engTitle;
			this.desc = desc;
			this.hp = hp;
			this.mp = mp;
			this.ss = ss;
		}
}
