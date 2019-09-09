package RegularExpressions;

public class Main {
	public static void main(String[] args) {
		String string  = "I am a string. Yes, I am. ";
		System.out.println(string);
		String yourString = string.replaceAll("I","You");
		System.out.println(yourString);
		
		String alpahanumeric = "abcDeeefj2Ghhiiiifjkl99z";
		
		System.out.println(alpahanumeric.replaceAll(".","Y"));// . is wildcard for all chars
		System.out.println(alpahanumeric.replaceAll("^abcDeee","YYY"));//^ begins with
		String secondString = "abcDeeefj2Ghhiiiifjkl99z";
		System.out.println(secondString.replaceAll("^abcDeee","YYY"));
		System.out.println(secondString.matches("^hello"));
		System.out.println(secondString.matches("^abcDeee"));//the whole string must match for this to be true
		System.out.println(secondString.matches("^abcDeeeF12Ghhiiiiijkl99z"));
		
		System.out.println(secondString.replaceAll("l99z$"," THE End"));
		
		System.out.println(secondString.replaceAll("[aei]","X"));//looking for any a e or i
		System.out.println(secondString.replaceAll("[aei]","I replaced the letter here"));
		System.out.println(secondString.replaceAll("[aei][fj]","*"));
		System.out.println("harry".replaceAll("[Hh]arry","Harry"));
		System.out.println("ejABCDEFG".replaceAll("[^ej]","*"));
		String newalpahanumeric = "abcDeEefj2GJhiiiJfjkl99z";
		System.out.println(newalpahanumeric.replaceAll("[^ejEJ]","*"));
		System.out.println(newalpahanumeric.replaceAll("[a-f3-8]","*"));//same as abcdef345678
		//you can turn of the case sensitivity through special constructor
		System.out.println(newalpahanumeric.replaceAll("(?i)[a-f3-8]","*"));//*****
		System.out.println(newalpahanumeric.replaceAll("[1-9]","*"));
		System.out.println(newalpahanumeric.replaceAll("\\d","*"));//you have to escape the backslash first so you need two //
		System.out.println(newalpahanumeric.replaceAll("\\D","*"));
		System.out.println(newalpahanumeric.replaceAll("\\w","*"));
		
		
		String hasWhiteSpace = "I have blanks and\ta tab, and also a newLine\n";
		System.out.println(hasWhiteSpace);
		System.out.println(hasWhiteSpace.replaceAll("\\s","*"));//replace whiteSpace
		System.out.println(hasWhiteSpace.replaceAll("\\t","*"));//replace tabs
		System.out.println(hasWhiteSpace.replaceAll("\\S","**"));//non whitespace
		
		
		
		System.out.println(newalpahanumeric.replaceAll("\\w","*"));//remove all chars except whitespace and tabs and lines
		System.out.println(hasWhiteSpace.replaceAll("\\w","*"));//remove all chars except whitespace and tabs and lines
		System.out.println(hasWhiteSpace.replaceAll("\\b","X"));//word boundaries
		
		System.out.println(hasWhiteSpace.replaceAll("\\b","<html>"));
		
	}
}
