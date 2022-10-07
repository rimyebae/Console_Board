package com.esther.board2;

public class Post {
	
	String title;
	String content;
	String id;
	int no;
	int lookup = 0; //조회수
	String time;    //시간
	
	
	public Post(String title, String content, String id, int no, int lookup,String time) {
		super();
		this.title = title;
		this.content = content;
		this.id = id;
		this.no = no;
		this.time = time;
	}
	
	public void setData(String t, String c, String ti) {
		title = t;
		content = c;
		time = ti;
	} 
	//글 수정
	

}
