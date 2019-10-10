package study01.test11;

public class ContinueTest {

	public static void main(String[] args) {
		for(int i = 1;i<=10;i++) {
			if(i%2==0)continue; // 끝내지않고 중간에 건너뛰어야할때
			System.out.println(i);
		}
	}
}
