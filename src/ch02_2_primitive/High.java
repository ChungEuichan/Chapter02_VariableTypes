package ch02_2_primitive;

import java.util.Scanner;

public class High {

	public static void main(String[] args) throws Exception{
		
		Scanner scn = new Scanner(System.in);
		String inputData;
		
		while(true) { 
			inputData = scn.nextLine();
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			if(inputData.equals("q")) {
				break;
				
			}
			
		}
		
		System.out.println("종료");
	}

}
