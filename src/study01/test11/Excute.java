package study01.test11;


public class Excute {
// 인터페이스는 메모리 생성불가, 데이터타입으로 사용가능
	public static void main(String[] args) {
		Remote r = new TvRemocon(); 
		r.on();
		Remote r2 = new AirconRemocon();
		r2.on();
		
		int age = 10;
		switch(age) {
		case 10:
			System.out.println("10살 이하");
			break;
		case 20:
			System.out.println("20살 이하");
			break;
		case 30: 
			System.out.println("30살 이하");
			break;
		default:
			System.out.println("31살 이상");
			break;
		}
	}
}
