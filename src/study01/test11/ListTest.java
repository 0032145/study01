package study01.test11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest {
// List Map Set 컬렉션 프레임워크
	public static void main(String[] args) {
		// List가 ArrayList의 조상이거나 인터페이스라고 볼 수 있어야함
		List<String> strList1 = new ArrayList<String>();
		/*
		 * 순서를 알고있는 리스트
		 * 잘 변경(삭제,추가)하지 않음, 값대체는 set
		 * ㅣㅁㅁㅁ
		 */
		
		
		List<String> strList2 = new LinkedList<String>();
		/* strList = new LinkedList<String>(); 도 됨
		 * 앞뒤에 있는것만 알고있음
		 * 추가하거나 삭제하거나 변형하거나 자주 바뀔때 씀
		 * ㅣㅁ-ㅁ-ㅁ-ㅁ
		 */
		List<String> strList3 = new Vector<String>(); // 안씀
		
		
		strList1.add("1");
		strList1.add("2");
		strList1.add("3");
		strList2.add("1");
		strList2.add("2");
		strList2.add("3");
		System.out.println(strList1);
		System.out.println(strList2);
		strList1.remove(0);
		strList2.remove(0);
		System.out.println(strList1);
		System.out.println(strList2);
		strList1.set(0, "4");
		strList2.set(0, "4");
		System.out.println(strList1);
		System.out.println(strList2);
		System.out.println(strList1.size());
		System.out.println(strList2.size());
	}
}
