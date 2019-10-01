package study01.test04;

public class MethodTest2 {

	static void test() { 
		/* void는 변수선언 불가 (method 선언)
		void : 아무것도 return하지 않겠다.*/
		System.out.println(1);
	}
	
	static int getNum() {
		return 0;
	}
	
	public static void main(String[] args) {
		test(); // method에 {영역}있으면 선언, 없으면 호출
		int a = getNum(); // 같은 데이터타입 변수에 대입 가능(호출), 반대는 불가(정의)
		
	}
}
