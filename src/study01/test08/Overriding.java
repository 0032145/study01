package study01.test08;

class Mother{
	public void a() {
		System.out.println("엄마");
	}
}

public class Overriding extends Mother {

	
	public void a() {
		System.out.println("아들");
	}
	public static void main(String[] args) {
		Overriding or = new Overriding();
		or.a();
	}
}
/*
 * 상속받으면서 같은 파라메터를 가지면 오버라이딩
 */
