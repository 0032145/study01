package study01.test10;

public class ExceptionTest {

	public static void main(String[] args) {
		String strNum = "일이삼사";
		try{
			int num = Integer.parseInt(strNum);
		}catch(Exception e) {
			System.out.println("올바른 숫자가 아닙니다.");
		}finally {
			System.out.println("무조건 실행");
		}
	}
}
/*
 * try에서 오류가 발생하면 바로 catch으로 넘어감(오류 아래 문장 실행X)
 * try에서 오류가 나지 않으면 catch 동작 X
 * finally는 넘어가지않고 무조건 실행됨
 */
