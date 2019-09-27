package study01.test02;

public class Var1 {
	public static void main(String[] args) {
		int num = 1;
		if(num==1) {
			int num2= 10;
			System.out.println("num1은 1입니다.:");
			System.out.println(num2);
		}
		for(;num<10;num=num+1) {
			System.out.println(num);
		}
		System.out.println(num);
	}
}
