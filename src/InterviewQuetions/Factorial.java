package InterviewQuetions;

public class Factorial {
	public static void main(String[] args) {
		int number = 3, factorial =1;
		
		for(int i = number;i>1;i--){
			factorial*=i;
			
		}
		System.out.println(factorial);
	}
}
