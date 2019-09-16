package InterviewQuetions;

public class Anagram {
	static int makeAnagram(String a, String b) {
		int count = 0;
		while (!a.isEmpty()){
			int alength =a.length();
			int blength =b.length();
			b =b.replace(""+a.charAt(0),"");
			a= a.replace(""+a.charAt(0),"");
			int aNew =alength-a.length();
			int bNew =blength-b.length();
			if (aNew!=bNew){
				count+=Math.abs(aNew-bNew);
			}
			
			
			
		}
		count+=b.length();
		return count;
		
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(makeAnagram("fcrxzwscanmligyxyvym","xwtrhvujlmrpdoqbisbwhmgpmeoke"));
	}
	
}
