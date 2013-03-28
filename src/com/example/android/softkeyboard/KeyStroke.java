package com.example.android.softkeyboard;

public class KeyStroke {
	public char key;
	public long time;
	public boolean isOnPress; // if false, assumed on release.
	public int keyCode;
	
	public KeyStroke(char key, int keyCode, long time, boolean isOnPress)
	{
		this.key = key;
		this.time = time;
		this.isOnPress = isOnPress;
		this.keyCode = keyCode;
	}
}
