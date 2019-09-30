package study01.test03;

public class ArrarTest {

	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int i = 0;i<nums.length;i++) {
			nums[i]=i+1;
			System.out.println(nums[i]);
		}	
		for(int i=0;i<nums.length;i++) {
			nums[i] = (i+1)*2;
			System.out.println(nums[i]);
		} 
	}
}

