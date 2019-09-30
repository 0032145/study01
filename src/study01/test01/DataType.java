package study01.test01;

public class DataType {

	public static void main(String[] args) {
		int num = 10;
		num = 9;
		System.out.println(num);
		num = 8;
		double doubleNum = 1;
		System.out.println(doubleNum);
		
		char ch1 = '안'; // 2byte
		char ch2 = '녕';
		char ch3 = '하';
		char ch4 = '세';
		char ch5 = '요';
		
		String str = "안녕하세요";
		
		boolean bl = true; // 1byte
		bl = false;
		
		System.out.println(num + str);
		
		System.out.println(num + doubleNum);
	}
}