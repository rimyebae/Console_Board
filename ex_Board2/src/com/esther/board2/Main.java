package com.esther.board2;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		Display disp = new Display();
		Command cmd = new Command();
		ArrayList<Post> posts =  new ArrayList<>();
		DayTime dt = new DayTime();
	
		
		int newNo = 0 ;

//		posts.add(new Post("첫번째글입니다", "태초마을입니다.", "지우", 1,0));
//		posts.add(new Post("두번째글입니다", "와우.", "유리", 2,0));
//		posts.add(new Post("세번째글입니다", "우와우.", "껌", 3,0));

    
		disp.showTitle("WELCOME");
		dt.time();
		
		
		loop:
			while(true) {
				
                disp.showTitle("MENU");   
				disp.showMainMenu();
				String c = cmd.getCommand("");

				switch(c) {


				//board list
				case"1":
					disp.showTitle("BOARD LIST");

					
					break;


				//Write
				case"2":

					disp.showTitle("POST WRITE");
					String title = cmd.getCommand("Please enter your post's title");

					String content = cmd.getCommand("Please enter your post's content");

					String id = cmd.getCommand("Please enter your ID");
					String time = dt.rnowtime();
				
					newNo = newNo + 1;
					//newNo = posts.size()+1;

					posts.add(new Post(title, content , id , newNo,0,time));
					disp.showResult("UPLOADED");
					break;


			   //READ 
				case"3":

					disp.showTitle("READ POST");
					int readNo = cmd.getNumber("Please enter Post's number");
					
					for(int i = 0 ; i < posts.size() ; i++) {

						if(readNo == posts.get(i).no ) {
							posts.get(i).lookup = posts.get(i).lookup + 1 ;
							
							System.out.println("=============================");
							System.out.println("TITLE: "+ posts.get(i).title + "   Look:"+ posts.get(i).lookup);
							System.out.println("=============================");
							System.out.println(posts.get(i).content);
							System.out.println("=============================");
							System.out.println(posts.get(i).no +" "+"id:" + posts.get(i).id +"/"+posts.get(i).time);
							

						}
					}
					break;

					//글 지우기
				case"4":
					disp.showTitle("DELETE POST");
					int delNo =  cmd.getNumber("Please enter Post's number");
					
					for(int i = 0 ; i < posts.size() ; i++) {
						if(delNo == posts.get(i).no) {
							posts.remove(i);
							System.out.println("Deleted posts cannot be retrieved.");
							disp.showResult("DELETED");
						}
					}
					break;
					
					
				//글수정하기	
				case "5":
					disp.showTitle("EDIT POST");
					int editNo =  cmd.getNumber("Please enter Post's number");
					
					for(int i = 0 ; i < posts.size() ; i++) {
						if(editNo == posts.get(i).no) {
							
							String editT = cmd.getCommand("Please enter your post's title");
							String editC = cmd.getCommand("Please enter your post's content");
							String editTI = dt.rnowtime();
							
							posts.get(i).setData(editT,editC,editTI);
							
							disp.showResult("EDITIED");
						}
					
						}
					break;	
					
					
                //나가기 
				case "6":
					disp.showTitle("EXIT");
					break loop;


				}


			}


	}

}
