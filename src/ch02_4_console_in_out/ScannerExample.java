package ch02_4_console_in_out;

import java.util.Scanner;
// ��Ʈ�� + ����Ʈ + O ������ �ڵ������� ����Ʈ�� ��
public class ScannerExample {

	public static void main(String[] args) {


		Scanner scn = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scn.nextLine();
			System.out.println("�Էµ� ���ڿ�: \"" + inputData + "\"");
			if(inputData.contentEquals("q")) {
				break;
				
				
				
			}
			
			
			
			
		}
		
		System.out.println("����");

		
		
		
	}

}
