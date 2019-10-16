package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectionTest {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "bdi";
		String pwd = "12345678";
		
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 오라클 서버 선택
			
			con = DriverManager.getConnection(url, id, pwd); // 접속
			
			Statement stmt = con.createStatement(); // 글씨판 생성
			
			String sql = "select * from user_info"; // query문 생성
			ResultSet rs = stmt.executeQuery(sql); // query 실행
			// rs는 메타데이터와 데이터를 가지고있다.
			
			List<Map<String,String>> userList 
				= new ArrayList<Map<String,String>>();
			// List를 위에 써야 Map을 담을수있다.
			while(rs.next()) {
				Map<String,String> userMap = new HashMap<String,String>();
				userMap.put("id", rs.getString("id"));
				userMap.put("pwd", rs.getString("pwd"));
				userMap.put("name", rs.getString("name"));
				userMap.put("age", rs.getString("age"));
				userMap.put("etc", rs.getString("etc"));				
				userList.add(userMap);
			}
			System.out.println(userList);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
