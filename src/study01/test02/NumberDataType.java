package study01.test02;

public class NumberDataType {

	public static void main(String[] args) {
		// byte : -128~127 (0은 양수로 취급) 제일 작음
		byte b = 127;
		// byte보다는 큼 (2byte)
		short s = 128;
		//short보다는 큼 (4byte)
		int i = 100000;
		//정수 저장 할 수 있는 것 중 제일 큼 (8byte)
		long l = 10000000;
		
		double d = 1; // 
		//f1.1  1.1f로 수가 float이라고 알려줘야함
		float f = 1.1f;
	}
}
