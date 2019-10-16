package study01.test15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SelfMapTest {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("핸드폰", "갤럭시");
		map.put("컴퓨터", "다나와");
		map.put("세탁기", "LG");
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key : " + key);
			String value = map.get(key);
			System.out.println("value : " + value);
		}
	}
}
