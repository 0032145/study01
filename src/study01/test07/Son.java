package study01.test07;

class Mother{
	public void cook() {
		System.out.println("재료가 없으니 물에 밥말아 먹어라");
	}
}
public class Son extends Mother{
	
	// public Son(){} : new Son();했을때 자바가 기본 생성자를 만들어줌

	public void cook() { // 같은 메소드를 재정의하는것 : 오버라이딩
	// public void cook(int a) : cook(),cook(int a)로 오버로딩임
		super.cook();
		System.out.println("라면을 끓여 먹어야겠다");
	}
	
	public static void main(String[] args) {
		Son s = new Son(); // Xxx(); : 첫글자 대문자 = 생성자 호출
		s.cook();
	}
}
