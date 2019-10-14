package study01.test13;

public class ListTest1 {
	
	private String[] strs;
	
	public ListTest1() {
		this.strs = new String[0];
	}
	public void add(String str) {
		String[] tmpstrs = this.strs;
		this.strs = new String[this.strs.length+1];
		this.strs[this.strs.length-1] = str;
		for(int i = 0;i<tmpstrs.length;i++) {
			this.strs[i] = tmpstrs[i];
			}
	}
	public void remove(int num) {
		this.strs[num] = this.strs[num+1];
		String[] tmpstrs = this.strs;
		this.strs = new String[this.strs.length-1];
		for(int i = 0;i<strs.length;i++) {
			this.strs[i] = tmpstrs[i];
		}
	}
	
	public static void main(String[] args) {
		ListTest1 t = new ListTest1();
		t.add("a");
		t.add("b");
		t.add("c");
		t.add("d");
		t.add("e");
		System.out.println(t.strs[0]+", "+t.strs[1]+", "
							+t.strs[2]+", "+t.strs[3]+", "+t.strs[4]);
		t.remove(2);
		System.out.println(t.strs[0]+", "+t.strs[1]+", "
				+t.strs[2]+", "+t.strs[3]);
		
	}

}
