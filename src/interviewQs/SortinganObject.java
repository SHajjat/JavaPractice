package interviewQs;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Comparator;

public class SortinganObject  {
	public static void main(String[] args) {
		User user1 = new User("Samir","hajjat");
		User user2 = new User("abdullah","aljan");
		User user3 = new User("Ahmad","Mohammad");
		
		int a = 4;
		int b = 3;
		a=a^b^(b=a);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		b= (b*a)/(a=b);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		
		
	}
	
	
	
}
class User {
	String name = "ahmad";
	String last = "mohammad";
	
	User(String name, String last) {
		this.last = last;
		this.name = name;
		
	}
}