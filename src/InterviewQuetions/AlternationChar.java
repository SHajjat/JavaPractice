package InterviewQuetions;

public class AlternationChar {
	static int alternatingCharacters(String s) {
		int count = 0;
		for ( int i = 0 ; i<s.length() ;){
			for (int j=i+1;j<=s.length();j++){
				if(j==s.length()){
					return count;
					
				}else if(s.charAt(i)==s.charAt(j)){
					
					count++;
				}else {
					i=j;
					break;
					
				}
				
			}
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		System.out.println(alternatingCharacters("AAABBB"));
	}
}
