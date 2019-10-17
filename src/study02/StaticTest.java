package study02;

public class StaticTest {

	final static int a;
	static { 
		// static 영역 : 선로딩 후작업 프리로딩(pre-Loading) 로딩 느리고 작업 빠름
		a = 10;
	}
	
	public static void main(String[] args) {
		System.out.println(StaticTest.a);
	}
}
