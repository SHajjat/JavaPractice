package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {
	public static void main(String[] args) {
		String hasWhiteSpace = "I have blanks and\ta tab, and also a newLine\n";
		String alpahanumeric = "abcDeeefj2Ghhiiiijkl99z";
		System.out.println(hasWhiteSpace);
		System.out.println(hasWhiteSpace.replaceAll("\\s","*"));//replace whiteSpace
		System.out.println(hasWhiteSpace.replaceAll("\\t","*"));//replace tabs
		System.out.println(hasWhiteSpace.replaceAll("\\S","**"));//non whitespace
		System.out.println(hasWhiteSpace.replaceAll("\\w","*"));//remove all chars except whitespace and tabs and lines
		System.out.println(hasWhiteSpace.replaceAll("\\W","*"));//remove all chars except whitespace and tabs and lines
		System.out.println(hasWhiteSpace.replaceAll("\\b","X"));//word boundaries
		System.out.println(hasWhiteSpace.replaceAll("\\B","X"));//word boundaries
		System.out.println(alpahanumeric.replaceAll("^abcDeee","YYY"));
		//or we can say
		System.out.println(alpahanumeric.replaceAll("^abcDe{3}","YYY"));//it has to come after the letter it give the quantity there is
		System.out.println(alpahanumeric.replaceAll("^abcDe+","YYY"));// + is one or more
		System.out.println(alpahanumeric.replaceAll("^abcDe*","YYY"));// * is 0 or more
		System.out.println(alpahanumeric.replaceAll("^abcDe?","YYY"));// * is 0 or 1
		System.out.println(alpahanumeric.replaceAll("^abcDe{2,5}","YYY"));// followed by 2 to 5 e chars
		System.out.println(alpahanumeric.replaceAll("h+i*j","YYY"));
		
		StringBuilder htmlText = new StringBuilder("<h1>My Headeing</h1>");
		htmlText.append("<h2>Sub-Heading</h2>");
		htmlText.append("<p>This is a paragraph about something</p>");
		htmlText.append("<p>This is another paragraph about something</p>");
		htmlText.append("<h2>Summary</h2>");
		htmlText.append("<p>Here is the summary.</p>");
		
		String h2Pattern =  ".*<h2>.*"; // the matcher match the whole string as a unit thats why we put . for any char and * for any number
		Pattern pattern = Pattern.compile(h2Pattern);
		Matcher matcher = pattern.matcher(htmlText);
		System.out.println(matcher.matches());
		
		
		
		
		
		
		
		
		
		
		
	}
}
