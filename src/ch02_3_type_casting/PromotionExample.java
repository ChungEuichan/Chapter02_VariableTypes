package ch02_3_type_casting;

public class PromotionExample {

	public static void main(String[] args) {
		
//		Ÿ��(�ڷ���) ��ȯ
//		1. �ڵ�(������) : �����Ϸ�
//		2. ����(�����)
//		
//		�� �������� ū Ÿ�� = ����Ÿ��
//		"�� �ս�"
		
		byte b = 10;
		int i = b;
		System.out.println("Int :" + i);
		
		char c = '��';
		i = c;
		System.out.println("���� �����ڵ�:" + i);
		
		i = 50;
		long lon = i;
		System.out.println("Ion:" + lon);
		
		lon = 100;
		float floatValue = lon;
		System.out.println("floatValue :" + floatValue);
		
		floatValue = 100.5f;
		double d = floatValue;
		System.out.println("d :" + d);
		
//		����(�����)����ȯ
//		: ~ �ؼ��ϴ� ����� ��ȯ..
		
		System.out.println((char)65);
//		Ȯ��(Promotion) : int ----> double �ս�(x) �ڵ�
//		���(Demotion) : double ----> ��nt �ս�(o) ����. 0.5 --> 0
		
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
