package practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReversingACharArray {
	
	public static void main(String[] args) {
		ReversingACharArray reversingACharArray = new ReversingACharArray();
		char [] array ={'h','e','l','l','o'};
		reversingACharArray.reverseString(array);
	}
	public void reverseString(char[] s) {
		s=reverse(s).toCharArray();
		System.out.println(Arrays.toString(s));
	}
	
	public static String reverse(char [] s){
		if(s.length==0) return "";
		return s[s.length-1]+reverse(Arrays.copyOf(s,s.length-1));
		
	}
	
	public int countCode(String str) {
		
		return (str.length() - (str.replace("co\\we","")).length())/4;
	}
}
