package study01.test08;

class Animal /*extends Object*/{
	
}

class Dog extends Animal{
	public void test() {
		System.out.println("Dog의 테스트");
	}
}

public class Jindo extends Dog {

	public static void main(String[] args) {
		Object o = new Jindo();
		Dog jindo = new Jindo();
		jindo.test();
		Animal a = new Jindo();
		//a.test(); test가 Dog에 포함되어 있어서 Animal은 안됨(아래있는건 모름)
	}
}
/*
 * 상속은 무한정 가능하다.
 * 자바는 단일상속만 가능하다(다중상속 불가능) a>b>c O   a,b>c X
 * 아무것도 상속받지 않는 클래스도 결국은 Object클래스를 상속받는다.
 */