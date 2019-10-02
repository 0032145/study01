package study01.test07;

class Calc {
	int num1;
	int num2;

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


public class Execute {

	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.num1 = 5;
		calc.num2 = 3;
		calc.add();
		Calc calc2 = new Calc();
		calc2.add();
		
		Calc[] calcs = new Calc[3]; 
		// 정해지지않은 데이터 타입 배열의 초기값은 null
		calcs[0] = new Calc(); // 이 작업 안하면 익셉션뜸(null을 0으로 초기화함)
		calcs[0].add();
		
		calc.num1 = 5;
		calc.num2 = 2;
		calc.add();
		calc.minus();
		calc.multiple();
		calc.division();

	}
}
