package study01.test06;

public class ObjectTest {
	int num1;
	int num2;
	String str = "";
	
	public static void main(String[] args) {
		ObjectTest ot = new ObjectTest();
		ObjectTest ot2 = new ObjectTest();
		
		ot.num1 = 5;
		ot.num2 = 10;
		System.out.println(ot.num1);
		System.out.println(ot.num2);
		ot = new ObjectTest();
		System.out.println(ot.num1);
		System.out.println(ot.num2);
		// new 하면 기존의 데이터를 놔두고 새로운 것을 만듬
		
		System.out.println(ot.num2 == ot2.num1);
		// 정해져있는 데이터타입 값은 자바가 한번만 기억함
		System.out.println(ot.str == ot2.str);
		// 빈문자열도 자바가 한번만 기억함
		//new String으로 강제적으로 자리를 만들면 서로 다른 값을 가진다
		
	}
}
