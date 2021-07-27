package ch02_2_primitive;

public class LongExample {

	public static void main(String[] args) {
		
		/*
		 * 기본적으로 자바 컴파일러는 정수 리터럴을 int 형으로 간주한다.
		 * long 타입임을 명시적으로 컴파일러에게 알려줘야 한다.
		 */
		long var1 = 10;
		long var2 = 20L;
		long var3 = 1000000000;
		long var4 = 10000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
//		long v1 = 2L;
//		float v2 = 1.8f;
//		double v3 = 2.5;
//		String v4 = "3.9";
//		int r =  (int)(v1 + v2 + v3 +(int)Double.parseDouble(v4));
//		System.out.println(r);
		
	}

}
