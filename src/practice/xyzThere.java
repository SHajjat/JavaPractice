package practice;

import java.util.regex.Pattern;

public class xyzThere {
	public static  boolean xyzThere(String str) {
		return (str.length() - str.replace("[^\\.]xyz","").length() )!=0;
	}
	
	public static void main(String[] args) {
		
		System.out.println(bobThere("bob"));
		//System.out.println(xyzThere("abcxyz"));
		
	}
	
	public static boolean bobThere(String str) {
		return Pattern.compile(".b[a-zA-Z]b.").matcher(str).find();
	}
	public boolean xyBalance(String str) {
		int coutX =0,coutY=0;
		str=str.toLowerCase();
		for(int i = 0 ; i<str.length();i++){
			coutX =str.charAt(i)=='x'?++coutX:coutX;
			coutY =str.charAt(i)=='x'?++coutY:coutY;
		}
		return coutY<=coutX;
	}
}
