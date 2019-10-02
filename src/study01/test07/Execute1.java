package study01.test07;

class Calc1{
	private int num1;
	private int num2;
	
	public Calc1(int num1,int num2) { // int 값을 입력해야만 작동
		this.num1=num1;
		this.num2=num2;
		
	}
	public void add() {
		System.out.println(num1+num2);
	}
	public void minus() {
		System.out.println(num1-num2);
	}
	public void multiple() {
		System.out.println(num1*num2);
	}
	public void division() {
		System.out.println(num1/num2);
	}
}

public class Execute1 {
	
	public static void main(String[] args) {
		Calc1 calc = new Calc1(4,2); // int값을 쓰지않으면 작동하지않음
		
		calc.add();
		calc.minus();
		calc.multiple();
		calc.division();
	}
}
