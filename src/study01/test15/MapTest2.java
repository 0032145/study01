package study01.test15;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {
		Map<String,String> map =new LinkedHashMap<String,String>();
		// HashMap은 순서가 없고, LinkedHashMap은 put한 순서대로 나옴
		map.put("음료1","사이다");
		map.put("음료2","콜라");
		map.put("음료3","커피");
		map.put("음료4","물");
		map.put("음료5","주스");
		map.put("음료6","소주");
		map.put("음료7","맥주");
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key : " + key + ", value : " + map.get(key));
		}
	}
}
