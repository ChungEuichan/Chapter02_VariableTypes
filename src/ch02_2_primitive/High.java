package ch02_2_primitive;

import java.util.Scanner;

public class High {

	public static void main(String[] args) throws Exception{
		
		Scanner scn = new Scanner(System.in);
		String inputData;
		
		while(true) { 
			inputData = scn.nextLine();
			System.out.println("�Էµ� ���ڿ�: \"" + inputData + "\"");
			if(inputData.equals("q")) {
				break;
				
			}
			
		}
		
		System.out.println("����");
	}

}
