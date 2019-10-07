package study01.test08;

public class Overloading {

	public void a() {
		
	}
	public int a(int a) {
		return 1;
	}
	public void a(int a,String s) {
		
	}
	public void a(String a) {
		
	}
	public void a(String s, int a) {
		
	}
}

/*
 * 같은 영역 안에서 같은 Method 이름
 * 파라메터 갯수가 달라야함
 * 파라메터 갯수가 같다면 데이터타입이 달라야한다.
 * 파라메터 갯수도 같고 데이터타입도 같다면 순서가 달라야한다.
 */