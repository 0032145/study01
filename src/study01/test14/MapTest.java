package study01.test14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>(); //table
		map.put("이름","홍길동");
		map.put("나이", "33");
		
		List<HashMap<String,String>> mapList // row
			= new ArrayList<HashMap<String,String>>();
		mapList.add(map);
		map.put("성별","남자");
		System.out.println(mapList); // List출력 []   Map출력 {}
		/*
		 * List는 인터페이스라서 new가 안됨
		 * 그래서 List 요건을 충족하는 ArrayList로 new ArrayList를 씀
		 * LinkedList도 가능
		 */
		HashMap<String,List<HashMap<String,String>>> totalMap; // sheet
		// List<정해지지않은 데이터타입>....
		
		
	}
}
