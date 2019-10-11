package study01.test06;

public class MethodTest {

	public static void main(String[] args) {
		String str = "1"; // 자바가 데이터 생성(static Java memory)
		String str1 = new String("1"); // 다른곳에 데이터 생성(Heap memory)
		System.out.println("1");
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str=="1");
		System.out.println(str1=="1");
		System.out.println(str==str1); // == : 데이터 주소가 같은지 확인
		
		System.out.println(str.contentEquals(str1));
		// str과 str1의 주소가 아니라 값을 비교함
		
		int a = 2;
		System.out.println(a==1); // 정해진 데이터 타입에는 new 불가
		
		String strg = "1234567"; // String은 char의 집합체, 순서 존재
		int idx = strg.indexOf("3456");
		System.out.println("3456은 strg의 " + idx + " index자리에 있네요");
		// 찾을 수 없는 index는 -1로 출력
		
		String name = "경훈,선호,영현,종서,동민,혜영";
		String[] strs = name.split(",");
		for(int i =0;i<strs.length;i++) {
			System.out.println("이름 : " + strs[i]);
		}
	}
}
