package ch02_4_console_in_out;

public class PrintfExample {

	public static void main(String[] args) {

		System.out.printf("�̸� : %s", "������");
		System.out.printf("\n���� : %d", 28);
		System.out.printf("\n���� : %f", 173.2);
		
		int value = 123;
		
		System.out.printf("��ǰ�� ����: %d��\n", value);
		System.out.printf("��ǰ�� ����: %6d��\n", value);
		System.out.printf("��ǰ�� ����: %-6d��\n", value);
		System.out.printf("��ǰ�� ����: %06d��\n", value);
		
		double area = 3.141592 * 10 * 10;
		System.out.printf("�������� %d�� ���� ����: %10.2f\n", 10, area);
		
		
		
		
		
		
		
		
		
	}

}
