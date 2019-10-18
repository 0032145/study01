package study02.user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Execute {
	Connection con = DBCon.getCon();
	Scanner scan = new Scanner(System.in);
	
	void  insert() {
		System.out.println("ID를 입력해주세요");
		String id = "'" + scan.nextLine() + "'";
		System.out.println("PWD를 입력해주세요");
		String pwd = "'" + scan.nextLine() + "'";
		System.out.println("NAME를 입력해주세요");
		String name = "'" + scan.nextLine() + "'";
		System.out.println("AGE를 입력해주세요");
		String age = "'" + scan.nextLine() + "'";
		System.out.println("ETC를 입력해주세요");
		String etc = "'" + scan.nextLine() + "'";
		String sql = "insert into user_info(id, pwd, name, age, etc) ";
		sql += "values(" + id + ", " + pwd + ", " + name
								+ ", " + age + ", " + etc + ")";
		try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("Insert된 갯수 : " + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	void  update() {
		System.out.println("변경할 ID를 입력해주세요");
		String id = "'" + scan.nextLine() + "'";
		System.out.println("비밀번호를 입력해주세요");
		String pwd = "'" + scan.nextLine() + "'";
		System.out.println("변경할 나이를 입력해주세요");
		String age = "'" + scan.nextLine() + "'";
		System.out.println("변경할 이름을 입력해주세요");
		String name = "'" + scan.nextLine() + "'";
		String sql = "update user_info set age = "	+ age + ", name = "
				+ name + " where id =" + id + " and pwd = " + pwd;
		try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			if(result != 0) {
				System.out.println("변경 완료");
			} else{
				System.out.println("ID와 비밀번호를 다시 확인해주세요");
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	void  delete() {
		System.out.println("삭제할 ID를 입력해주세요");
		String id = "'" + scan.nextLine() + "'";
		System.out.println("비밀번호를 입력해주세요");
		String pwd = "'" + scan.nextLine() + "'";
		String sql = "delete from user_info where id = "
						+ id + " and pwd = " + pwd;
		try {
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			if(result != 0) {
				System.out.println("삭제 완료");
			} else{
				System.out.println("ID와 비밀번호를 다시 확인해주세요");
			}		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	void  select() {
		System.out.println("검색할 이름을 입력해주세요");
		String name = "'%" + scan.nextLine() + "%'";
		String sql = "select * from user_info where name like " + name;
		
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println("검색한 이름이 포함된 ID : "
							+ rs.getString("id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	void initResponse() {
		String res = "";
		while (!res.equals("q")) {
			System.out.println("원하시는 서비스 번호를 입력하세요");
			System.out.println("1. 유저생성");
			System.out.println("2. 유저삭제");
			System.out.println("3. 유저변경");
			System.out.println("4. 유저조회");
			System.out.println("q. 종료");
			res = scan.nextLine();
			
			if("1".equals(res)) {
				
			} else if("2".equals(res)) {
				
			} else if("3".equals(res)) {
				
			} else if("4".equals(res)) {
				
			} else if("q".equals(res)) {
				System.out.println("종료되었습니다");
			} else {
				System.out.println("잘못된 값입니다. 다시 입력해주세요");
			}
		}
	}
	
	public static void main(String[] args) {
		Execute ex = new Execute();
		ex.initResponse();
		/*
		while(1==1) {
			System.out.println("원하시는 서비스 번호를 입력하세요");
			System.out.println("1. 유저생성");
			System.out.println("2. 유저삭제");
			System.out.println("3. 유저변경");
			System.out.println("4. 유저조회");
			System.out.println("q. 종료");
			String orderNum = ex.scan.nextLine();
			if(orderNum.equals("q")){
				System.out.println("종료되었습니다");
				break;
			} else if(orderNum.equals("1")) {
				ex.insert();
				continue;
			} else if(orderNum.equals("2")) {
				ex.delete();
				continue;
			} else if(orderNum.equals("3")) {
				ex.update();
				continue;
			} else if(orderNum.equals("4")) {
				ex.select();
				continue;
			} else {
				System.out.println("잘못된 값입니다. 다시 입력해주세요");
				continue;
			}
		}
		*/
	}
}
