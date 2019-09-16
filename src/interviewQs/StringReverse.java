package interviewQs;

import java.util.*;

public class StringReverse {
	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		String A=sc.next();
//		/* Enter your code here. Print output to STDOUT. */
//		StringBuilder builder = new StringBuilder(A);
//		if(A.equals(builder.reverse().toString())){
//			System.out.println("Yes");
//		}else{
//			System.out.println("No");
//		}
//
//		Map<String,String > letter = new LinkedHashMap<>();
//		System.out.println(letter.put("yes","yes"));
//		String [] maga = {"give"+ "me"+"one"+ "grand" +"today"+ "night"};
//		List <String> magarr = new LinkedList<>()List<>(Arrays.asList(maga));
		
		twoStrings("hi","world");
	}
	static String twoStrings(String s1, String s2) {
		for(int i = 0 ; i<s1.length();i++){
			for(int j = i+1 ; j<=s1.length();j++){
				if(s2.indexOf(s1.substring(i,j))>=0){
					
					return"yes";
				}
			}
		} return"No";
		
		
	}
}
