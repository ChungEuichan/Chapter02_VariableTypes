package ch02_4_console_in_out;

import java.util.Scanner;
// 컨트롤 + 쉬프트 + O 누르면 자동적으로 임포트가 됨
public class ScannerExample {

	public static void main(String[] args) {


		Scanner scn = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scn.nextLine();
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			if(inputData.contentEquals("q")) {
				break;
				
				
				
			}
			
			
			
			
		}
		
		System.out.println("종료");

		
		
		
	}

}
