package study01.test15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// map은 순서보다 값이 중요할때 사용
		Map<String,String> map = new HashMap<String,String>();
		map.put("보물","컴퓨터");
		map.put("음식","초밥");
		map.put("할일","많음");
		//Set<String> keySet = map.keySet();
		//Iterator<String> it = keySet.iterator();
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()){ // is(의문) has(가지고있나)는 return값이 boolean
			String key = it.next();
			System.out.println("key :"+ key);
			String value = map.get(key);
			System.out.println("value :"+ value);
		}
	}
}
