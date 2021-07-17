package by.academy.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
	//Ќайти в строке не только зап€тые, но и другие знаки препинани€. ѕодсчитать общее их количество
	public static void main(String[] args) {
		String s = "Hello world, good day! yes?";
		
		Pattern pattern = Pattern.compile("\\W");
        Matcher matcher = pattern.matcher(s);
        boolean b = matcher.matches();
        
        int x = 0;
        x++;
        
        while (matcher.find()) {
        	System.out.print(s.substring(matcher.start(), matcher.end()));
        	
        	
        }
        System.out.println(b);
        System.out.println(x);
	}
}
