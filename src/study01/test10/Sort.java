package study01.test10;

import java.util.Random;

public class Sort {

	public static void main(String[] args) {
		int[] nums = new int[10];
		Random r = new Random();
		
		//입력부
		for(int i =0;i<nums.length;i++) {
			nums[i] = r.nextInt(100);
		}
		
		//정렬
		for(int i =0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]<nums[j]) {
					int tempNum = nums[i];
					nums[i] = nums[j];
					nums[j] = tempNum;
				}
			}
		}
		
		//출력부
		for(int i =0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}
