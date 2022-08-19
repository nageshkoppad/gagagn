package com.server.project2.baseclass;

public class KeyBoard {
	public int totalKeys;
	public int totalAlph;
	public int price;
	
	public KeyBoard()
	{
		
	}
	public KeyBoard(int totalKeys)
	{
		this();
	}
	public KeyBoard(int totalKeys,int totalAlph)
	{
		this(totalKeys);
		this.totalAlph=totalAlph;
	}

}
