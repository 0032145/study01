package study01.test10;

public class FinalTest {

	//final int NUM; (오류) 멤버변수는 자바가 초기화 해주지만 final은 해주지못함
	
	public static void main(String[] args) {
		final int a = 3;
		// a = 5; (오류) 변수가 더이상 변하지않음
		// final : 상수, 반드시 초기화 해줘야 함, 보통 public static과 같이 씀
	
		//삼항연산자
		int num =3;
		String str = "넘은 3이 맞습니다";
		if(num!=3) {
			str = "넘은 3이 아닙니다";
		}
		str = (num==3)?"넘은 3이 맞습니다":"넘은 3이 아닙니다";
		System.out.println(str);
		
		
		//X instanceof Y  :  X를 Y라고 불러도되는가
		System.out.println(str instanceof String);
	}
}
