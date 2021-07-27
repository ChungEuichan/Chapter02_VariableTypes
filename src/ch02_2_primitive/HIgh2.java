package ch02_2_primitive;

import java.util.Scanner;

public class HIgh2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("[필수 입력 정보]");
		
		System.out.print("1. 이름 :");
		String name = scn.nextLine();
		
		System.out.print("2. 주민번호 :");
		String ssn = scn.nextLine();
		
		System.out.print("3. 전화번호 :");
		String num = scn.nextLine();
	
		System.out.println();

		System.out.println("[입력된 내용:]");
		System.out.println("1. 이름 :" + name);
		System.out.println("2. 주민번호 :" + ssn);
		System.out.println("3. 전화번호 :" + num);
		
	}

}
