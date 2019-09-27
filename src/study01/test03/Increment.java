package study01.test03;

public class Increment {

	public static void main(String[] args) {
		int num = 1;
		num = num +1;
		num += 1; // 1을 제외한 수를 더할때
		num ++; // 1씩 더할때
		System.out.println(num++); // 후순연산자 출력 = 4  출력이후 num값 = 5
		System.out.println(num);
		
		num = num - 1;
		num -= 1;
		num --;
		System.out.println(num--);
		System.out.println(num);
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
}
