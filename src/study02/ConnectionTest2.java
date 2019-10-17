package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest2 {
	// final은 상수니까 상수는 대문자로 씀 
	public static final String URL;
	public static final String ID;
	public static final String PWD;
	public static final String DRIVER_NAME;
	
	static{
		
		URL ="jdbc:oracle:thin:@localhost:1521:xe";
		ID = "bdi";
		PWD = "12345678";
		DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
		
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(URL, ID, PWD);			
			String sql = "select * from user_info ";
			//select * from user_info/띄어쓰기 해줘야함/where id =
			Scanner scan = new Scanner(System.in);
			System.out.println("검색할 아이디를 입력해주세요");
			String id = "'%" + scan.nextLine() + "%'";
			sql += "where id like " + id + " ";
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getString("id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}	
		}
		
		}
	}
}
