package study01.test06;

public class MethodTest2 {
	int num;
	
	int getNum() {
		System.out.println(num);
		int num = 3;
		System.out.println(num);
		System.out.println(this.num);
		return 1;
	}

	public static void main(String[] args) {
		MethodTest2 mt2 = new MethodTest2(); // 여기서 4번 초기화
		mt2.getNum();

	}
}

/*
* 모든 변수와 모든 메소드는 홀로 존재 할 수 없다.(반드시 영역 안에 들어가야함)
* 메소드는 절대적으로 클래스 아래에서 가능하다.(메소드 바로 밑 메소드 불가, 메소드 클래스 메소드는 됨)
* 변수는 클래스 안에만 있다면 어디서든 선언할 수 있다.(같은 영역 같은 이름으로는 중복 선언 불가)
* 
*/