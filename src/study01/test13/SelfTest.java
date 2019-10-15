package study01.test13;

public class SelfTest {

	private String[] strs;
	
	public SelfTest() {
		this.strs = new String[0];
	}
	
	public void add(String str) {
		String tmp[] = strs;	
		strs = new String[strs.length+1];
		strs[strs.length-1] = str;
		for(int i =0;i<tmp.length;i++) {
			strs[i] = tmp[i];
		}
	}
	
	public void remove(int num) {
		if(0<=num) {
			for(;num<strs.length-1;num++) {
				strs[num] = strs[num++];
			}
			String[] tmp = strs;
			strs = new String[strs.length-1];
			for(int i =0; i<strs.length;i++) {
				strs[i] = tmp[i];
			}
		}
	}
	
	public String toString() {
		String str = "[";
		for(int i =0;i<strs.length;i++) {
			str += strs[i] + ", ";
		}
		str = str.substring(0, str.length()-2);
		return str += "]";
	}
	
	public static void main(String[] args) {
		SelfTest st = new SelfTest();
		st.add("1");
		st.add("2");
		st.add("3");
		st.add("4");
		st.remove(2);
		System.out.println(st);
	}
}
