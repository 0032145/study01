package study01.test11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("이름","홍길동");
		map.put("나이","33");
		map.put("주소","서울 강서구");
		map.put("성별","남자");
		map.put("성별","여자"); // key가 같으면 중복불가, 덮어씌움
		// map.put(a,b);  b값(data)은 a(key)다
		System.out.println(map.get("이름"));
		System.out.println(map);
		
		List<HashMap<String,String>> people =
				new ArrayList<HashMap<String,String>>();
		// HashMap<key data type,data type>까지가 데이터타입
		people.add(map);
		people.add(map); // 윗 people과 같은 map을 바라봄
		people.get(1).put("이름","김길동");
		map.put("이름","임꺽정"); // map 자기 자신을 바꿈
		map = new HashMap<String,String>();
		System.out.println(map);
		System.out.println(people.get(0));
		System.out.println(people);
		/*
		 * map = new HashMap<String,String>();을 한다고해서
		 * people은 초기화되지 않고 기존의 map을 계속 바라본다.
		 */
	}
}
