package study01.test10;

import java.util.ArrayList;
import java.util.Random;

public class DoubleList {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		ArrayList<Double> doubleList = new ArrayList<Double>();
		Random r = new Random();
		for(int i=0;i<10;i++) {
			strList.add(r.nextInt(100)+"."+r.nextInt(10));
			doubleList.add(Double.parseDouble(strList.get(i)));
		}
		// out, parseDouble처럼 기울어진 글씨(이탤릭체)는 static이다.
		
		System.out.println(doubleList);
		System.out.println(doubleList.get(0)+doubleList.get(1));
		
		for(int i =0;i<doubleList.size();i++) {
			for(int j = i+1; j<doubleList.size();j++) {
				if(doubleList.get(i)>doubleList.get(j)) {
					double tmpdb = doubleList.get(i);
					doubleList.set(i,doubleList.get(j));
					doubleList.set(j,tmpdb);
				}
			}
		}
		System.out.println(doubleList);
	}
}

/*
 * 정렬 : 크거나 작은수를 하나씩 비교하여 순서대로 나열하는것
 * 예를 들어 20, 40, 10, 30, 50일때 작은것부터 정렬한다고 하면,
 * 20은 40보다 작으므로 20을 기억한다. 20은 10보다 큼으로 10으로 바꿔서 기억한다.
 * 반복하면 10이 제일 작은 수로 10을 제일 처음으로 두고 다시 다음 수를 비교하여 반복한다.
 * 결과는 작은수로 정렬할때 10, 20, 30, 40, 50순으로 정렬된다.
 */