package study01.test09;

class ObjectTest2{
	static int num2 = 2;
}
public class ObjectTest {

	int num1;
	static int num2;
	// static은 new를 써주지 않아도 됨
	public static void main(String[] args) {
		ObjectTest ot = new ObjectTest();
		ot.num1 = 10;
		ot.num2 = 20;
		ot = new ObjectTest(); // static은 new로 다시 읽어도 초기화 되지않음(고정값)
		System.out.println(ot.num1);
		System.out.println(ot.num2);


		num2 = 3;
		System.out.println(num2);
		System.out.println(ObjectTest2.num2);
		// 같은 클래스 안에서는 생략 가능하지만 다른클래스에서는 써줘야함
	}
}
