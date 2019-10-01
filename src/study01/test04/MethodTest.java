package study01.test04;

public class MethodTest {
/* 변수나 Method는 반드시 class(혹은 다른 영역) 안에 있어야 함
	class는 어디 있어도 상관없다 */
	static int num = 1; // class 안에서는 선언 가능(실행 불가)
	static String num2 = "2"; // 같은 영역 변수 이름 중복 불가
	static int num() { // 변수이름 != method 이름
		return 1;
	}
	public static void main(String[] args) {
		System.out.println(num); // class 선언에 static이 붙지않으면 실행불가
		int i; // int for if... 예약어
		int Int; // 변수 이름은 대문자가 가능하지만 거의 쓰지않는다
	}
}
