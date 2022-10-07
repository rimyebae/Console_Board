package com.esther.board2;

public class Display {
	
	public static final String TITLE_BAR 
	= "==================== %s ===================="; 
	
	public static final String RESULT_FORM
	="YOUR POST IS %s!";
	
	
	
	public void showTitle(String str) {
		String s = String.format(TITLE_BAR, str);
		System.out.println(s);
		
	}
	
	public void showMainMenu() {
		System.out.print("[1: BOARD LIST / 2. POST WRITE / 3. READ POST / "
				+ "4. DELETE POST / 5. EDIT POST / 6. EXIT]");
	}
	
	public void showResult(String str) {
		String s = String.format(RESULT_FORM, str);
		System.out.println(s);
	}
	
	
	

}
