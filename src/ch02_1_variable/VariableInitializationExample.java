package ch02_1_variable;

public class VariableInitializationExample {
// 클래스명 정할때 앞에는 대문자 이후 이어지는 단어의 첫 글은 대문자로 넘어가는걸 카멜 표기법
	public static void main(String[] args) {

//		int a = 0, b = 0, c = 0;
		int a = 5;
		int b = 0;
		final double pi = 3.14;
		
//		변수?: 변화 가능한 값, 이 값은 정해져 있지 않음
//		상수?: 상수는 고정값이 있는 수 (final->상수를 지칭함)
		
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
