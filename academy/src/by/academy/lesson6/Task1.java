package by.academy.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
	public static void main(String[] args) {
		//»зменить регул€рное выражение в примере дл€ нахождени€ строк cab, ccab, cccab.
		String s = "cabkjh";
		        Pattern pattern = Pattern.compile("cab");
		        Matcher matcher = pattern.matcher(s);
		        boolean b = matcher.matches();
		        
		        while (matcher.find()) {
		        	System.out.println(s.substring(matcher.start(), matcher.end()) );
		        }
		        System.out.println(b);
		        
		        
		    }
	}
