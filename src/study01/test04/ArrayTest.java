package study01.test04;

import java.util.Random;

public class ArrayTest {

	public static void main(String[] args) {
		int[] nums = new int[6];
		Random r = new Random();
		
		for(int i =0;i<nums.length;i++) { // x.y.z : z는 y의 속성
			nums[i] = r.nextInt(45)+1;
			for(int j =i-1;j>=0;j--) {
				if(nums[i]==nums[j]) {
					i--;
					break;
				}
			}
		}
		for(int i =0;i<nums.length;i++) {
			System.out.println(nums[i]); 
			//x.y.z() : 함수 function method(객체지향)
		}
		
		
		long l = 12345678912l; // float의 f 처럼 long도 l을 붙여줘야함
				
		int a; // 변수의 선언 : 값이 없음(값이 존재하지않음)
		int b = 0; // 변수의 선언과 초기화 : 의미없는 값 (0이 들어가있음)
		
		
		String str = "";// (new String) ""; 생략		
	}
}
