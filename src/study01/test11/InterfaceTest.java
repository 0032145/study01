package study01.test11;

interface Promise{ // 인터페이스는 default라고 써주지않으면 기본적으로 public
	void test();
	public void test1();
}

public class InterfaceTest implements Promise{
	
	public void test() { // 반드시 인터페이스에 있는거 써줘야함(오버라이딩)
	// 오버라이딩은 리턴타입까지 같아야함
	}
	public void test1() {
		
	}
	public void test2() { 
	// 접근제어자는 더 작은범위로 설정하지못함	
	}
}
