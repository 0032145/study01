package study01.test07;

class Cat{
	private int age;
	private String name;
	private String type;
	// private는 method를 통한 주입과 출력을 함
	
	public void setAge(int age) {
		this.age = age;
	}public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}public String getName() {
		return name;
	}
	
	public void setType(String type) {
		this.type = type;
	}public String getType() {
		return type;
	}
	
	/* get set method (Plain Old Java Object : POJO 옛날방식의 자바)
	 * setter : 주입하는 method(값만 입력, 로직 입력하지 않기)
	 * getter : 가져오는 method(값을 입력하지 않아도 됨)
	 */
}
public class Access {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.setAge(5);
		c.setName("양이");
		c.setType("먼치킨");
		
		System.out.println(c.getAge());
		System.out.println(c.getName());
		System.out.println(c.getType());
		System.out.println(c.getName() + "의 나이는 " + c.getAge()
		+ "살이고 종류는 " + c.getType() + "이다.");
		
	}
}
