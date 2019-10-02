package study01.test07;

public class Cons {
	int num;

	/*
	 * 생성자는 메소드에서 return과 오버라이딩을 제외한것이라고 봐도됨
	 * 클래스와 생성자는 똑같아야한다(대소문자까지)
	 */
	
	public Cons() {
		System.out.println("호출됨");
	}
	public Cons(int num) { // 강제된 생성자가 만들어지면 자바가 기본생성자를 만들지않음
		System.out.println("num파라메터 호출");
	}
	public static void main(String[] agrs) {
		Cons c = new Cons(); // 범위를 읽고 초기화 한 뒤 실행
		System.out.println(c.num);
		
	/*
	 * 데이터를 처음 만들때 선행되어야 하는게 있을때
	 * 데이터베이스를 만들때 접속할때 
	 */
		
	}
}
