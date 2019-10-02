package study01.test07;

class Calc2{
	double num1;
	double num2;
	
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
public class Execute2 {

	public static void main(String[] args) {
		Calc2 calc2 = new Calc2();
		calc2.num1 = 8.8;
		calc2.num2 = 5.3;
		calc2.add();
		calc2.minus();
		calc2.multiple();
		calc2.division();
	}
}
