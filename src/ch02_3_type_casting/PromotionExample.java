package ch02_3_type_casting;

public class PromotionExample {

	public static void main(String[] args) {
		
//		타입(자료형) 변환
//		1. 자동(묵시적) : 컴파일러
//		2. 강제(명시적)
//		
//		값 허용범위가 큰 타입 = 작은타입
//		"값 손실"
		
		byte b = 10;
		int i = b;
		System.out.println("Int :" + i);
		
		char c = '가';
		i = c;
		System.out.println("가의 유니코드:" + i);
		
		i = 50;
		long lon = i;
		System.out.println("Ion:" + lon);
		
		lon = 100;
		float floatValue = lon;
		System.out.println("floatValue :" + floatValue);
		
		floatValue = 100.5f;
		double d = floatValue;
		System.out.println("d :" + d);
		
//		강제(명시적)형변환
//		: ~ 해석하는 방법을 변환..
		
		System.out.println((char)65);
//		확장(Promotion) : int ----> double 손실(x) 자동
//		축소(Demotion) : double ----> ㅑnt 손실(o) 강제. 0.5 --> 0
		
		i = 44032;
		c = (char) i;
		System.out.println(c);
		
		lon = 500;
		i = (int)lon;
		System.out.println(i);
		
		d = 3.14;
		i = (int)d;
		System.out.println(i);
		
		
		
		
	}

}
