package ch02_4_console_in_out;

import java.util.Scanner;

public class SystemInOut {

	public static void main(String[] args){

//		[KeyCodeExample.java]
		
//		int keycode;
		
//		try {
//			
//			System.out.printf("keyCode:%d\n" ,System.in.read());
//			System.out.printf("keyCode:%d\n" ,System.in.read());
//			System.out.printf("keyCode:%d\n" ,System.in.read());
//			System.out.printf("keyCode:%d\n" ,System.in.read());
//			System.out.printf("keyCode:%d\n" ,System.in.read());
//	
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		[ContinueKeyCodeReadExample.java]
//		boolean working = true ;
//		int keyCode;
//		
//		while(working) {
//			try {
//				
//				keyCode = System.in.read();
//				
//				System.out.printf("keyCode: %d\n", keyCode );
//				
//				if(keyCode == 'q' || keyCode =='Q') {
//					
//					working = false;
//					
//				}
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

//		System.out.println("���α׷��� ���������� ����Ǿ����ϴ�.");
		
//		[ScannerExample.java]
		
		Scanner scn = new Scanner(System.in);
		String str = "";
		
		while(true) {
	
			str = scn.nextLine();
			System.out.printf("�Է� ���ڿ��� \"%s\" �Դϴ�.\n", str);
			if(str.equalsIgnoreCase("q")) { 
				break;
				
			}
		}
		

		System.out.println("���α׷��� ���������� ����Ǿ����ϴ�.");
		
		scn.close();
	}

}
