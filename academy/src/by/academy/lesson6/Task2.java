package by.academy.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
	//Дана строка “Versions: Java  5, Java 6, Java   7, Java 8, Java 12.”  
	//Найти все подстроки "Java <X>" и распечатать их.
	public static void main(String[] args) {
		String s = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
		
		Pattern pattern = Pattern.compile("Java\\s+\\d+");
        Matcher matcher = pattern.matcher(s);
        boolean b = matcher.matches();
        
        while (matcher.find()) {
        	System.out.println(s.substring(matcher.start(), matcher.end()));
        	System.out.println("Matcher start: " + matcher.start());
        	System.out.println("Matcher end: " + matcher.end());
        }
        System.out.println(b);
	}

}
