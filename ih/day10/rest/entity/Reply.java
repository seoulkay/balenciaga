package balenciaga_web.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Reply")
public class Reply {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;

		@Column(name = "content")
		private String content;

		@Column(name = "writer")
		private String writer;
		
		@Column(name = "password")
		private String password;
		
		@Column(name = "published")
		private boolean published;

		public Reply() {

		}

		public Reply(String content, String writer, String password, boolean published) {
			this.content = content;
			this.writer = writer;
			this.password = password;
			this.published = published;
		}

		public long getId() {
			return id;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getWriter() {
			return writer;
		}

		public void setWriter(String writer) {
			this.writer = writer;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public void setId(long id) {
			this.id = id;
		}

		public boolean isPublished() {
			return published;
		}

		public void setPublished(boolean isPublished) {
			this.published = isPublished;
		}

		@Override
		public String toString() {
			return "Tutorial [id=" + id + ", content=" + content + ", writer=" + writer + " , password=" + password + ", published=" + published + "]";
		}

}
