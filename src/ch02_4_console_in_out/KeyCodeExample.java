package ch02_4_console_in_out;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {

//		[키보드로부터 입력된 내용을 변수에 저장하고 출력하기]
//		System.in.read(); 
		
		int keyCode;
		
//		keyCode = System.in.read();
//		System.out.println("keyCode:" + keyCode);
//		
//		keyCode = System.in.read();
//		System.out.println("KeyCode:" + keyCode);
//		
//		keyCode = System.in.read();
//		System.out.println("keyCode:"+ keyCode);
		
		while(true) {  //반복문 (for....횟수, while 조건)
			keyCode = System.in.read();
			System.out.println("keyCode:"+ keyCode);
		if(keyCode ==113) { 
			break;
			
		}
			
			
		}
		
		System.out.println("종료");
		

	
		
		
	}

}
