package study01.test05;

import java.util.Random;

import study01.test04.PrivateTest;

/*
 * java패키지 안에 util패키지 안에 Random클래스
 * 같은 패키지 안에 있으면 import 하지않음
 */

	class Test{
		private int num; // 같은 파일에 있어도 다른 클래스에서 사용불가
	}
	
	public class PublicTest {
	
/* 접근제어자
 * public
 * protected
 * default
 * private
 */
	
	public int num;
	
	Random ran;

	public static void main(String[] args) {
		PublicTest publicTest = new PublicTest();
		System.out.println(publicTest.num);
		
		PrivateTest privateTest = new PrivateTest();
		System.out.println(privateTest.num);
		// 접근제어자가 default면 같은 패키지에서만 불러올수있음
	}
}
