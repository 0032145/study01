package study01.test14;

// 클래스는 new로 메모리 생성을 하기때문에 나타낼 몸통이 있어야함
// 인터페이스는 new로 메모리생성을 못하기때문에 몸통이 없음

class Son extends AbstractTest{

	@Override
	public void test() {
		System.out.println("test");
	}
}

public abstract class AbstractTest { // 추상 클래스 
//추상은 인터페이스처럼 new 사용불가, 몸통 없음
	public abstract void test(); // 추상 메소드
	
	public static void main(String[] args) {
		AbstractTest at = new Son(); // 상속을 받아 정의를 했기때문에 new 사용가능
		at.test();
	}
}
