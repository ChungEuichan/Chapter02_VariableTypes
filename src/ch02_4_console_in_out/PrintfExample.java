package ch02_4_console_in_out;

public class PrintfExample {

	public static void main(String[] args) {

		System.out.printf("이름 : %s", "정의찬");
		System.out.printf("\n나이 : %d", 28);
		System.out.printf("\n신장 : %f", 173.2);
		
		int value = 123;
		
		System.out.printf("상품의 가격: %d원\n", value);
		System.out.printf("상품의 가격: %6d원\n", value);
		System.out.printf("상품의 가격: %-6d원\n", value);
		System.out.printf("상품의 가격: %06d원\n", value);
		
		double area = 3.141592 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area);
		
		
		
		
		
		
		
		
		
	}

}
