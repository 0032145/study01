package study01.test08;

class Father{
	int a = 3;
	Father(){
		System.out.println("1. 난 Father클래스의 생성자");
	}
}

public class Constructor extends Father {
	Constructor(){
		System.out.println(a);
		System.out.println("2. 난 생성자 클리스의 생성자");
	}
	public static void main(String[] args) {
		Constructor c = new Constructor();
	}
}
/*
 * 클래스 이름과 대소문자까지 똑같아야한다.
 * return값을 받지 않는다.
 * 클래스 이름과 같아야하기에 오버라이딩 불가능
 */

/*
 * 같은 영역에서 일어나냐 상속관계에서 일어나나
 */