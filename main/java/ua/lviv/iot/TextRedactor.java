package ua.lviv.iot;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextRedactor {
	public static String addressFormating(String inputText, TextRedactor formator) {
		final String patternStringToReplace = "[ADDRESS]";
		String regEx = "[A-Z][a-z]{2,}[,]\\s(str)\\s[A-Z][a-z]{2,}[,]\\s[0-9][a-z]?";
		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher(inputText);
		return matcher.replaceAll(patternStringToReplace);
	}
}
