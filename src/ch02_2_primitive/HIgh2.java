package ch02_2_primitive;

import java.util.Scanner;

public class HIgh2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("[�ʼ� �Է� ����]");
		
		System.out.print("1. �̸� :");
		String name = scn.nextLine();
		
		System.out.print("2. �ֹι�ȣ :");
		String ssn = scn.nextLine();
		
		System.out.print("3. ��ȭ��ȣ :");
		String num = scn.nextLine();
	
		System.out.println();

		System.out.println("[�Էµ� ����:]");
		System.out.println("1. �̸� :" + name);
		System.out.println("2. �ֹι�ȣ :" + ssn);
		System.out.println("3. ��ȭ��ȣ :" + num);
		
	}

}
