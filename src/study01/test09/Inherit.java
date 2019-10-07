package study01.test09;

import java.util.Scanner;

import study01.test08.Atom;

public class Inherit extends Atom {

	public static void main(String[] args) {
		Inherit i = new Inherit();
		// i.privateTest();
		// i.defaultTest();
		i.protectedTest();
		i.publicTest();
		
		System.out.println(i);
		
		System.out.println(new Object());
		
		Object o =new Inherit();
		
		System.out.println(new Inherit());
		
		Object obj = 1; // Object는 아무거나 들어감(그렇다고 이렇게 쓰면 안됨)
		obj = "1";
		obj = true;
		obj = new Scanner(System.in);
		obj = new Atom();
		obj = new Inherit();
	}
}
