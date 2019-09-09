package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherFindAndGroup {
	public static void main(String[] args) {
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
		
		String h2Pattern2 = "</?h2>";
		Pattern pattern1 = Pattern.compile(h2Pattern2);
		Matcher matcher1 = pattern1.matcher(htmlText);
		int count = 0;
		matcher.reset();//reset the internal state of the matcher
		while (matcher1.find()){
			count++;
			System.out.println("Occurrence "+count+" : "+ matcher1.start()+" to "+matcher1.end());
			//sooo whats happening is , matcher.find() find a match , matcher.start() gives the index of the beignning of the match
			//and matcher.end() returns the index of the last
		}
		//greedy quantifier * --> it will look to as much matches as it can find so in this case it will give
		//<h2>Sub-Heading</h2><p>This is a paragraph about something</p><p>This is another paragraph about something</p><h2>Summary</h2>
		//lazy quantifier ? --> if you add ? to the * if becomes lazy quantifier *? and gives
		//<h2>Sub-Heading</h2>
		//<h2>Summary</h2>
		
		String h2GroupPattern = "(<h2>.*?</h2>)";
		Pattern groupPattern = Pattern.compile(h2GroupPattern);
		Matcher groupMatcher = groupPattern.matcher(htmlText);
		System.out.println(groupMatcher.matches());
		
		groupMatcher.reset();
		while (groupMatcher.find()){
			System.out.println("Occurrence "+count+" : "+groupMatcher.group(1)+ " "+ groupMatcher.start()+" to "+groupMatcher.end());
		}
		
		String h2TextGroups ="(<h2>)(.+?)(</h2>)";
		Pattern h2TextPatten = Pattern.compile(h2TextGroups);
		Matcher h2TextMatcher = h2TextPatten.matcher(htmlText);
		
		h2TextMatcher.reset();
		while (h2TextMatcher.find()){
			System.out.println("Occurrence "+h2TextMatcher.group(2));
			
		}
		
	}
}
