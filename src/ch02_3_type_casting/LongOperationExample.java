package ch02_3_type_casting;

public class LongOperationExample {

	public static void main(String[] args) {
		
//		byte v1 = 10;
//		int v2 = 100;
//		long v3 = 1000L;
//		long re = v1 + v2 + v3;
//		System.out.println(re);
		
		byte b1 = 10;
		byte b2 = 20;
		int i1 = b1 + b2;
		System.out.println(i1);

		char c1 = 'A';
		char c2 = 1;
		
		int i2 = c1 + c2;
		System.out.println("유니코드 :"+ i2);
		System.out.println("출력문자 :" + (char)i2);
		
		int i3 = 10;
		int i4 = i3/4;
		System.out.println(i4);
		
		int i5 = 10;
		double d = i5 /4.0;
		System.out.println(d);
		
		int x = 1;
		int y = 2;
		double r = (double) x /y;
		System.out.println(r);
		
		
		
		
		
		
		
		
		
		
		
	}

}
