package study01.test12;

public class PadTest {
// 디버깅 : 알트 쉬프트 d + j
	
	public static void main(String[] args) {
		String str = "1";
		int max = 4 - str.length(); // str.length() 디버깅 : 드래그, 컨트롤 쉬프트 i
		for(int i =1;i<=max;i++) {
			str +="0";
			System.out.println(str);
		}
	}
}
