package study01.test10;

import java.util.ArrayList;

public class IntegerList {

	public static void main(String[] args) {
		int[] ints = new int[3]; 
		for(int i=0;i<ints.length;i++) {
			ints[i]= (i+1)*10;
			System.out.println(ints[i]);
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		// <> 생략 가능 하지만, <Object>로 변경됨
		for(int j=0;j<al.size();j++) {
			System.out.println((j)+"번, "+al.get(j));
		}
				
		
	}	
}
