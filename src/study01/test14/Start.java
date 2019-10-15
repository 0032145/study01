package study01.test14;
// 인터페이스 몸통 가질수있는방법 1. default(접근제어자 아님) 2.static

final class End{
	final void test() {
		System.out.println("난 End's test메소드");
	}
}
public class Start { // extends End (final + class = 상속불가)
					 // ex) public final class String
	// void test() {} (final + method = 오버라이딩불가)
	// (변경하면 안되는 중요한 메소드)
	
	
	public static void main(String[] args) {
		
	}
	
}
