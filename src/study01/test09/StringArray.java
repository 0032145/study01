package study01.test09;

import java.util.ArrayList;
import java.util.Random;

public class StringArray {

	public static void main(String[] args) {
		String[] strs = new String[10];
		// 입력부
		Random ran = new Random();
		for(int i=0;i<strs.length;i++) {
			int rNum = ran.nextInt(20)+1;
			strs[i] = rNum + "";
			for(int j=i-1;j>=0;j--) {
				if(strs[i].contentEquals(strs[j])) {
					i--;
					break;
				}
			}
		}
		// 출력부
		for(int i=0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}
	System.out.println();
		
	
		// String[]
		String[] str = new String[0];
		str = new String[1];
		str[0] = "a";
		str = new String[2];
		str[0] = "a";
		str[1] = "b";
		str[1] = null;
		System.out.println(str[0]+","+str[1]);
		str = new String[1];
		str[0] = "a";
		System.out.println(str[0]);
		
		
		// String으로 구성된 ArrayList, 정해진 사이즈가 없음.
		ArrayList<String>strList = new ArrayList<String>();
		strList.add("a");
		strList.add("b");
		strList.remove(1);
		strList.add("b");
		strList.add("c");
		strList.add("d");
		System.out.println(strList);
		System.out.println(strList.size());
		
		
		String str1 = "ABCD";
		System.out.println(str1.indexOf("C"));
		
		System.out.println();
		
		System.out.println("알파벳 검색");
		for(int i=0;i<strList.size();i++) {
			System.out.println((i)+"번, "+strList.get(i));
		}
		System.out.println("검색하신 것은 "+ strList.indexOf("c")+"번째 있어요");
		
		
		
		int a = 1;
		Integer i = 1; // = new Integer(1);  wrapping class
		
		ArrayList<Integer>numList = new ArrayList<Integer>();
		numList.add(1); // Integer라서 정수만 들어감
		numList.add(2);
		numList.add(3);
		System.out.println(numList);
	}
}
