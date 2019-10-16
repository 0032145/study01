package study01.test14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ForMapTest {

	private int sample() {
		return 10;
	}
	
	public static void main(String[] args) {
		ForMapTest fmt = new ForMapTest();
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("이름","홍길동");
		map.put("나이", "33");
		map.put("성별","남자");
		
		List<HashMap<String,String>> mapList
			= new ArrayList<HashMap<String,String>>();
		for(int i = 0;i<fmt.sample();i++) {
			map = new HashMap<String,String>();
			map.put("이름",i+"");
			map.put("나이", i+"");
			map.put("성별", i+"");
			mapList.add(map);			
		}
		for(int i = 0;i<mapList.size();i++) {
			System.out.println(mapList.get(i));
		}
		HashMap<String,List<HashMap<String,String>>> totalMap;
		
		
		
	}
}

