package practice;

public class RemoveCode {
	public int countCode(String str) {
		
		return (str.length() - str.replaceAll("co\\we","").length());
	}
	
	public static void main(String[] args) {
	
	}
}
