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
	
	public static void main(String[] args) {
		ListTest lt = new ListTest();
		lt.add("a");
		lt.add("b");
		lt.add("c");
		System.out.println(lt.size());
		System.out.println(lt.strs[0]);
		System.out.println(lt.strs[1]);
		System.out.println(lt.strs[2]);
	}
}
