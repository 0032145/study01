package study01.test11;

class Father{
	public void test() {
		System.out.println("아빠 테스트");
	}
}
public class Son extends Father{

	public void test() {
		System.out.println("아들 테스트");
	}
	public void sonsTest() {
		System.out.println("아빠한테 없는 기능이 있음");
	}
	public static void main(String[] args) {
		Son s = new Son();
		Father s1 = new Son();
		//s1.sonsTest(); 데이터타입이 Father임으로 Son에 있는거 모름
		
		Father f = new Father();
		// Son f = new Father(); 안됨(역행)
		
		Son s2 = (Son)s1; // 형변환
		s2.sonsTest();
		
		Father f1 = new Father();
		if(f1 instanceof Son) { // 아래에서 오류나서 보통 if로 물어보고 실행함
			s2 = (Son)f; // <- 런타임 오류남(컴파일 오류로는 알아낼수없음)
			s2.sonsTest();
		}
	}
}
