package www.tellmebaby.shop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import www.tellmebaby.shop.entity.Reply;
import www.tellmebaby.shop.entity.User;

public class MySql {

	 
	 
	    Connection con;
	    Statement stmt;
	    ResultSet rs;
	 
	    String url = "jdbc:mysql://18.221.103.17:3306/";
	    String id = "root";
	    String pw = "**";
	 
	    public MySql(){
	 
	        try{
	            //드라이버 로딩 (Mysql 또는 Oracle 중에 선택하시면 됩니다.)
	            Class.forName("com.mysql.jdbc.Driver");    //mysql
	            //Class.forName("oracle.jdbc.driver.OracleDriver");    //oracle
	        }catch (Exception e){
	            e.printStackTrace();
	        }
	 
	    }
	    
	    public boolean idPassCheck(User user) {
	    	boolean result = false;
	    	try {
	    	stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM hong.login WHERE instaId = '"+user.getInstaId()+"' AND hong.login.passWord = '"+user.getPassWord()+"'");
            
           //만약에 리절트셋이 있으면 로그인 성공 
            
            //없으면 로그인 실패 
           if(rs.next()) {
        	   result = true;
           }else {
        	   result = false;
           }
            
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    		System.out.println("아이디 비번 체크하다가 에러 났어요. ");
	    	}
	    	return result;
	    }
	    
	    
	    public void getConnection(){
	 
	        try{
	            //커넥션을 가져온다.
	            con = DriverManager.getConnection(url, id, pw);
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	 
	    }
	    
	    public void insertReply(String instaId, String description) {
	    	try {
	    		stmt = con.createStatement();
	    		
	    		stmt.execute("INSERT INTO hong.Reply(instaId, description) Values (\""+instaId+"\", \""+description+"\");");
	    		
	    	}catch(Exception e) {
	    		System.out.println("리플라이 글저장하다가 디베에서 에러났어요!");
	    	}
	    }
	    
	    public void insertLogin(String instaId, String name, String passWord, String avatar) {
	    	try {
	    		stmt = con.createStatement();
	    		
	    		stmt.execute("INSERT INTO hong.login(instaId, name, passWord, avatar) Values (\""+instaId+"\", \""+name+"\", \""+passWord+"\", \""+avatar+"\");");
	    		
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    		System.out.println("로긴페이지에서 글저장하다가 디비에서 에러났어요!");
	    	}
	    }
	    //모든 리플라이를 가지고 오
	    public ArrayList<Reply> getReplyList(){
	    	ArrayList<Reply> replyList = new ArrayList<Reply>();
	    	try {
	    		stmt = con.createStatement();
	            rs = stmt.executeQuery("SELECT * FROM hong.Reply");
	            
	            while(rs.next()) {
	            	Reply reply = new Reply();
	            	reply.setId(rs.getInt("id"));
	            	reply.setInstaId(rs.getString("instaId"));
	            	reply.setDescription(rs.getString("description"));
	            	replyList.add(reply);
	            
	            }
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    		System.out.println("리플라이 글 가지고 오다가 디비에서 에러났어요!!");
	    		
	    	}
	    	
	    	
	    	return replyList;
	    	
	    }
	    
	    public ArrayList<User> getUserList(){
	    	ArrayList<User> userList = new ArrayList<User>();
	    	try {
	    		stmt = con.createStatement();
	            rs = stmt.executeQuery("SELECT * FROM hong.login");
	            
	            while(rs.next()) {
	            	User user = new User();
	            	user.setInstaId(rs.getString("instaId"));
	            	user.setName(rs.getString("name"));
	            	user.setPassWord(rs.getString("passWord"));
	            	user.setAvatar(rs.getString("avatar"));
	            	userList.add(user);
	            
	            }
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    		System.out.println("유저 글 가지고 오다가 디비에서 에러났어요!!");
	    		
	    	}
	    	
	    	
	    	return userList;
	    	
	    }
	    
	    
	    public void getData(){
	 
	        try{
	            
	            stmt = con.createStatement();
	            //데이터를 가져온다.
	            rs = stmt.executeQuery("SELECT * FROM hong.Reply");
	            
	            System.out.println("이제 부터 디비 출력!");
	 
	            while(rs.next()){
	                //출력
	                System.out.println(rs.getString("instaId"));
	                System.out.println(rs.getString("description"));
	 
	            }
	 
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
