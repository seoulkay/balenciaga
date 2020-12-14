package www.gesi.com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import www.gesi.com.entity.Post;
import www.gesi.com.entity.Reply;


public class MySql {

	 
	 
	    Connection con;
	    Statement stmt;
	    ResultSet rs;
	 
	    String url = "jdbc:mysql://18.221.103.17:3306/";
	    String id = "root";
	    String pw = "";
	 
	    //생성자 constructor = MySql 클래스(객체)를 생성할때 반드시 해줘야 되는 것들이야.
	    public MySql(){
	 
	        try{
	            //드라이버 로딩 (Mysql 또는 Oracle 중에 선택하시면 됩니다.)
	            Class.forName("com.mysql.jdbc.Driver");    //mysql
	            //Class.forName("oracle.jdbc.driver.OracleDriver");    //oracle
	        }catch (Exception e){
	            e.printStackTrace();
	        }
	 
	    }
	    
	    public Post getPostUpdate(int id){
    		Post post = new Post();
    		try {
	    		stmt = con.createStatement();
	            rs = stmt.executeQuery("SELECT * FROM hong.gesiPost WHERE id=(\""+id+"\");");
	            
	            while(rs.next()) {
	            
	            	post.setId(rs.getInt("id"));
	            	post.setCreate(rs.getTimestamp("create"));
	            	post.setPostId(rs.getString("postId"));
	            	post.setPostTitle(rs.getString("postTitle"));
	            	post.setDescription(rs.getString("description"));
	            	
	            
	            }
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    		System.out.println("포스트 가지고 오다가 디비에서 에러났어요!!");
	    		
	    	}
    		return post;
	    }
	    
	    public ArrayList<Reply> getReplyList(int id){
	    	ArrayList<Reply> replyList = new ArrayList<Reply>();
    	try {
    		stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM hong.gesiReply WHERE postId=(\""+id+"\") order by id desc ;");
            
            while(rs.next()) {
            	Reply reply = new Reply();
            	reply.setId(rs.getInt("id"));
            	reply.setCreate(rs.getTimestamp("create"));
            	reply.setUserId(rs.getString("userId"));
            	reply.setReplyId(rs.getInt("replyId"));
            	reply.setPostId(rs.getInt("postId"));
            	reply.setDescription(rs.getString("description"));
            	replyList.add(reply);
            	
            
            }
    	}catch(Exception e) {
    		e.printStackTrace();
    		System.out.println("포스트 가지고 오다가 디비에서 에러났어요!!");
    		
    	}
    	
    	
    	return replyList;
    	
    }
	    
	    public Post getPostOne(int id){
	    		Post post = new Post();
	    	try {
	    		stmt = con.createStatement();
	            rs = stmt.executeQuery("SELECT * FROM hong.gesiPost WHERE id=(\""+id+"\");");
	            
	            while(rs.next()) {
	            
	            	post.setId(rs.getInt("id"));
	            	post.setCreate(rs.getTimestamp("create"));
	            	post.setPostId(rs.getString("postId"));
	            	post.setPostTitle(rs.getString("postTitle"));
	            	post.setDescription(rs.getString("description"));
	            	
	            
	            }
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    		System.out.println("포스트 가지고 오다가 디비에서 에러났어요!!");
	    		
	    	}
	    	
	    	
	    	return post;
	    	
	    }
	    
	    public ArrayList<Post> getPostSearchList(String search){
	    	ArrayList<Post> postList = new ArrayList<Post>();
	    	
	    	try {
	    		stmt = con.createStatement();
	            rs = stmt.executeQuery("SELECT * FROM hong.gesiPost WHERE postTitle like \"%"+search+"%\" OR postId like \"%"+search+"%\" OR description like \"%"+search+"%\" order by id desc ");
	            
	            while(rs.next()) {
	            	Post post = new Post();
	            	post.setId(rs.getInt("id"));
	            	post.setCreate(rs.getTimestamp("create"));
	            	post.setPostId(rs.getString("postId"));
	            	post.setPostTitle(rs.getString("postTitle"));
	            	post.setDescription(rs.getString("description"));
	            	postList.add(post);
	            
	            }
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    		System.out.println("검색한 포스트 가지고 오다가 디비에서 에러났어요!!");
	    		
	    	}
	    	
	    	
	    	return postList;
	    	
	    }
	    
	    public ArrayList<Post> getPostList(){
	    	ArrayList<Post> postList = new ArrayList<Post>();
	    	
	    	try {
	    		stmt = con.createStatement();
	            rs = stmt.executeQuery("SELECT * FROM hong.gesiPost order by id desc ");
	            
	            while(rs.next()) {
	            	Post post = new Post();
	            	post.setId(rs.getInt("id"));
	            	post.setCreate(rs.getTimestamp("create"));
	            	post.setPostId(rs.getString("postId"));
	            	post.setPostTitle(rs.getString("postTitle"));
	            	post.setDescription(rs.getString("description"));
	            	postList.add(post);
	            
	            }
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    		System.out.println("포스트 가지고 오다가 디비에서 에러났어요!!");
	    		
	    	}
	    	
	    	
	    	return postList;
	    	
	    }
	    public void insertReply(String userId, String description, int id ) {
	    	try {
	    		stmt = con.createStatement();
	    		stmt.execute("INSERT INTO hong.gesiReply(hong.gesiReply.create, userId, description, postId) Values (now(), \""+userId+"\", \""+description+"\", \""+id+"\");");
	    		
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    		System.out.println("포스트페이지에서 댓글쓰다가 디비에서 에러났어요!");
	    	}
	    }
	   
	    public void insertPost(String postId, String postTitle, String description ) {
	    	try {
	    		stmt = con.createStatement();
	    		stmt.execute("INSERT INTO hong.gesiPost(hong.gesiPost.create, postId, postTitle, description) Values (now(), \""+postId+"\", \""+postTitle+"\", \""+description+"\");");
	    		
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    		System.out.println("포스트페이지에서 글저장하다가 디비에서 에러났어요!");
	    	}
	    }
	    
	    public void updatePost(String postId, String postTitle, String description, int id ) {
	    	try {
	    		stmt = con.createStatement();
	    		stmt.execute("UPDATE hong.gesiPost SET postId=\""+postId+"\" , postTitle = \""+postTitle+"\", description = \""+description+"\" WHERE id=\""+id+"\" ;");
	    		
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    		System.out.println("포스트페이지에서 글수정 하다가 디비에서 에러났어요!");
	    	}
	    }
	    
	    public void deletePost(int id ) {
	    	try {
	    		stmt = con.createStatement();
	    		stmt.execute("DELETE FROM hong.gesiPost WHERE id=\""+id+"\" ;");
	    		
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    		System.out.println("포스트페이지에서 글삭제 하다가 디비에서 에러났어요!");
	    	}
	    }

	    public void getConnection(){
	 
	        try{
	            //커넥션을 가져온다.
	            con = DriverManager.getConnection(url, id, pw);
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	 
	    }
	   
	    
	 
	    public void closeConnection(){
	 
	        try{
	            //자원 반환
	            rs.close();
	            stmt.close();
	            con.close();
	 
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	 
	    }
	    

	}
