package study01.test07;

public class OverLoading {
	public void test() {
		System.out.println("test() 메소드 호출");
	}
	public void test(int i) {
		System.out.println("test(int i)메소드 호출");
	}
	public void test(String str) {
		System.out.println("test(String str)메소드 호출");
	}
	public void test(String str,int i) {
		System.out.println("test(String str,int i) 메소드 호출");
	}
	public void test(int i, String str) {
		System.out.println("test(int i,String str) 메소드 호출");
	}
	
	public static void main(String[] args) {
		OverLoading ol = new OverLoading();
		ol.test("sdas",23);
	}
	/*
	 * OverLoading 오버로딩
	 * method 이름이 같아야한다.
	 * println(int), println(String).....
	 * 한 메소드 안에 여러가지 파라메터를 쓸 수 있다.
	 * String,int와 int,String은 서로 다른것이다.
	 */
}
