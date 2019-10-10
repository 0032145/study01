package study01.test11;

import java.util.ArrayList;

public class WhileTest {

	public static void main(String[] args) {
		int i =1;
		for(;i<=10;) {
			System.out.println(i);
			i++;
		} // 이런 for문은 안씀
		
		i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		} // while도 이런식으로 안씀
		
		ArrayList<String> strList = new ArrayList<String>();
		while(strList.size()<7) {
			strList.add("아무거나");
		}
		
		do { // 조건을 만족하지 않더라도 한번은 실행하고 while문으로 넘어감
			strList.add("아무거나");
		}while(strList.size()<7);
	}
}
