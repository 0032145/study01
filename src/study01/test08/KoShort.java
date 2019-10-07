package study01.test08;

class Cat{
	public void sleep() {
		System.out.println("고양이가 잡니다.");
	}
	public void run() {
		System.out.println("고양이가 달립니다.");
	}
}

public class KoShort extends Cat {
	public void sleep() {
		System.out.println("코숏고양이가 잡니다.");
	}
	public void eat() {
		System.out.println("코숏고양이가 식사를 합니다.");
	}

	public static void main(String[] args) {
		Cat ks = new KoShort();
		ks.sleep(); // Cat과 KoShort 둘다 sleep이 있어서 오버라이딩이 일어남
		ks.run();
		//ks.eat; Cat에 eat가 없어서 오류남
		System.out.println();
		Cat[] cats = new Cat[4];
		cats[0] = new Cat();
		cats[1] = new KoShort();
		cats[0].sleep(); 
		cats[1].sleep(); // 오버라이딩 Cat ks = new KoShort();
	}
}
