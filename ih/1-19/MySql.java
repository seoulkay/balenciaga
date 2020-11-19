package www.iamk.shop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import www.iamk.shop.entity.Reply;

public class MySql {

	 
	 
	    Connection con;
	    Statement stmt;
	    ResultSet rs;
	 
	    String url = "jdbc:mysql://18.221.103.17:3306/";
	    String id = "root";
	    String pw = ############
	 
	    public MySql(){
	 
	        try{
	            //드라이버 로딩 (Mysql 또는 Oracle 중에 선택하시면 됩니다.)
	            Class.forName("com.mysql.jdbc.Driver");    //mysql
	            //Class.forName("oracle.jdbc.driver.OracleDriver");    //oracle
	        }catch (Exception e){
	            e.printStackTrace();
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
	    
	    public void insertReply(String instaId, String description) {
	    	try {
	    	stmt = con.createStatement();
	    	
	    	stmt.execute("INSERT INTO kay.Reply(instaId, description) VALUES (\""+instaId+"\", \""+description+"\");");
	    	
	    	} catch(Exception e) {
	    		e.printStackTrace();
	    		System.out.println("리플라이 글 저장하다가 디비에서 에러났어요!");
	    	}
	    }
	    //모든 리플라이를 가지고 오기
	    public ArrayList<Reply> getReplyList(){
	    	ArrayList<Reply> replyList = new ArrayList<Reply>();
	    	try {
	    		stmt = con.createStatement();
	    		rs = stmt.executeQuery("SELECT * FROM kay.Reply");
	    		
	    		while(rs.next()){
	    			Reply reply = new Reply();
	    			reply.setId(rs.getInt("id"));
	    			reply.setInstaId(rs.getString("instaId"));
	    			reply.setDescription(rs.getString("description"));
	    			replyList.add(reply);
	    		}
	    		
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    		System.out.println("리플라이 글 가지고 오다가 디비에서 에러났어요!");
	    	}
	    	
	    	return replyList;
	    }
	    public void getData(){
	 
	        try{
	            
	            stmt = con.createStatement();
	            //데이터를 가져온다.
	            rs = stmt.executeQuery("SELECT * FROM kay.Reply");
	            
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

