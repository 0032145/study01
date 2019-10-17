package study02.test01;

public class TestTest6 {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
