package pack3;

import java.util.ArrayList;

public class Page {

		String title;
		String engTitle;
		String desc;
		int hp;
		int mp;
		
		
		ArrayList<Reply> replies = new ArrayList<Reply>();
		
		public int getRepliesNumber() {
			return replies.size();
		}
		
		public int getRepliesAvr() {
			int result = 0;
			for (int i = 0 ; i < replies.size(); i++) {
				result = replies.get(i).ss+result;
			}
			result = result/replies.size();
			return result;
			
		}
		
		public Page(String title, String engTitle, String desc, int hp, int mp) {
			this.title = title;
			this.engTitle = engTitle;
			this.desc = desc;
			this.hp = hp;
			this.mp = mp;
			
		}
}
