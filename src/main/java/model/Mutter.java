package model;

import java.io.Serializable;

public class Mutter implements Serializable{
	private String userName;
	private String text;
	private int id;
	
	public Mutter() {}
	public Mutter(String userName,String text) {
		this.userName = userName; //ユーザー名
		this.text = text;         //つぶやき内容
	}
	public Mutter(int id,String userName,String text) {
		this(userName,text);
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public String getText() {
		return text;
	}
}
