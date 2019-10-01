package study01.test04;

import java.util.Random;

public class ObjectTest {
	// public ObjectTest(){}(생성자)가 숨겨져있음, 그러므로 아래서 호출 가능
	
	int age; // 맴버 변수는 자바가 0으로 초기화 해줌
	String name; // 정해져있지 않은 데이터타입의 초기값 : null
	Random r;
	
	String getStr() {
		return null;
	}
	
	public static void main(String[] args) {
		ObjectTest objectTest = new ObjectTest();
		/*
		 *  위라인에서 6~8라인을 읽고 값을 초기화시켜줌
		 *  정해져있지 않는 데이터타입 초기화 = 
		 *  데이터타입 변수 = new 데이터타입(); 
		*/
		
		System.out.println(objectTest.age);
		System.out.println(objectTest.name);
		System.out.println(objectTest.r.nextInt());
		
		/* 
		 * 컴파일 익셉션 : 번역오류, 실행불가(실행 자체가 불가)
		 * 런타임 익셉션 : 번역 가능, 실행 후 오류(실행 해봐야 알수있음)
		 */
	}
}
