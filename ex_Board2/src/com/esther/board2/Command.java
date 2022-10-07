package com.esther.board2;

import java.util.Scanner;

public class Command {
	
	public Scanner sc = new Scanner(System.in);
	
	
	public String getCommand(String guide) {
		System.out.println(guide);
		String cmd = sc.next();
		return cmd;
		
		
	}
	
	public int getNumber(String guide) {
		System.out.println(guide);
		int cmd = sc.nextInt();
		return cmd;
	}
	

}

