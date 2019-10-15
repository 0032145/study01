package study01.test13;

import java.util.ArrayList;

public class ListTest {
	private String[] strs;
	
	public ListTest() {
		this.strs = new String[0];
	}
	public int size() {
		return this.strs.length;
	}
	public void add(String str) {
		String tmpstrs[] = this.strs;
		this.strs = new String[this.strs.length+1];
		this.strs[this.strs.length-1] = str;
		for(int i = 0;i<tmpstrs.length;i++) {
			this.strs[i] = tmpstrs[i];
		}
	}
	public String toString() {
		String str = "[";
		for(int i = 0;i<strs.length;i++) {
			str += strs[i] + ", ";
		}
		str = str.substring(0,str.length()-2);
	//substring(int) : 데이터를 잘라서 보여주는 기능/삭제 아님 (int번 방부터 보여줌)
	//substring(int1,int2) : int1방부터 in2방까지 보여줌
		return str += "]";
	}
	
	public static void main(String[] args) {
		ListTest lt = new ListTest();
		lt.add("a");
		lt.add("b");
		lt.add("c");
		System.out.println(lt.size());
		System.out.println(lt.strs[0]);
		System.out.println(lt.strs[1]);
		System.out.println(lt.strs[2]);
		System.out.println(lt);
	}
}
