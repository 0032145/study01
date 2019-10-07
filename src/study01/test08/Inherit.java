package study01.test08;

public class Inherit extends Atom {

	public static void main(String[] args) {
		Inherit i = new Inherit();
		// i.privateTest();  java가 읽긴하지만 접근제어자가 private라서 못씀
		i.defaultTest();
		i.protectedTest();
		i.publicTest();
	}
}
