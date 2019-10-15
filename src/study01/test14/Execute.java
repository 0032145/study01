package study01.test14;

import java.util.ArrayList;
import java.util.List;

public class Execute {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("김종서");
		p.setAge(27);
		p.setAddr("부천");
		List<Person> pList = new ArrayList<Person>();
		pList.add(p);
		p = new Person();
		p.setName("석철민");
		p.setAge(27);
		p.setAddr("영주");
		pList.add(p);
		System.out.println(pList);
		p = pList.get(0);
		p.setName("한준혁");
		System.out.println(pList.get(0));
		System.out.println(pList.get(1));
	} // 자신(p)가 바뀌면 링크가 끊기지만, 안에것(p.setName 등)이 바뀌면 값이 바뀐다.
}
