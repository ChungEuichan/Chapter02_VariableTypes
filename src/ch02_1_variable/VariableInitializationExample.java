package ch02_1_variable;

public class VariableInitializationExample {
// Ŭ������ ���Ҷ� �տ��� �빮�� ���� �̾����� �ܾ��� ù ���� �빮�ڷ� �Ѿ�°� ī�� ǥ���
	public static void main(String[] args) {

//		int a = 0, b = 0, c = 0;
		int a = 5;
		int b = 0;
		final double pi = 3.14;
		
//		����?: ��ȭ ������ ��, �� ���� ������ ���� ����
//		���?: ����� �������� �ִ� �� (final->����� ��Ī��)
		
		a = 10;
		a = 100;
//		pi = 0.01;		
		System.out.println(a==b);
		
		int value;
		value = 1;
		
		int result = value + 10;
		System.out.println(result);
		
	}

}
