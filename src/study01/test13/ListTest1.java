package study01.test13;

public class ListTest1 {

	private String[] strs;

	public ListTest1() {
		this.strs = new String[0];
	}

	public void add(String str) {
		String[] tmpstrs = this.strs;
		this.strs = new String[this.strs.length + 1];
		this.strs[this.strs.length - 1] = str;
		for (int i = 0; i < tmpstrs.length; i++) {
			this.strs[i] = tmpstrs[i];
		}
	}
	
	public int indexOf(String str) {
		for(int i = 0; i < strs.length; i++) {
			if(str.equals(strs[i])) {
				return i;
			}
		}
		return -1;
	}
	
	public void remove(String str) {
		int num = indexOf(str);
			if(num != -1) {
		}
			remove(num);
		}

	public void remove(int num) { // 오버로딩
		if (0 <= num) {
			for (; num < strs.length - 1; num++) {
				strs[num] = strs[num + 1];
			}
			String[] tmpstrs = this.strs;
			this.strs = new String[this.strs.length - 1];
			for (int i = 0; i < strs.length; i++) {
				this.strs[i] = tmpstrs[i];
			}
		}
	}
	
	/* 기준점에서 앞에꺼 붙이고 뒤에꺼 이어붙이는방법
	 * public void remove(int idx) {
	 * 	String[] tmp = strs;
	 * 	strs = new String[strs.length - 1];
	 * 	for(int i = 0; i < idx; i++) {
	 * 		strs[i] = tmp[i];
	 * 	}
	 * 	for(int i = idx + 1; i < tmp.length; i++) {
	 * 		strs[i-1] = tmp[i];
	 * 	}
	 * }
	 */

	public String toString() {
		String str = "[";
		for (int i = 0; i < strs.length; i++) {
			str += strs[i] + ", ";
		}
		str = str.substring(0, str.length() - 2);
		return str += "]";
	}

	public static void main(String[] args) {
		ListTest1 t = new ListTest1();
		t.add("a");
		t.add("b");
		t.add("c");
		t.add("d");
		t.add("e");
		System.out.println(t); // [a, b, c, d, e]
		t.remove(1); // [a, c, d, e]
		t.remove("d"); // [a, c, e]
		t.remove(-1);
		System.out.println(t);
	}
}
