package lt.sdacademy.Fundamentals.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".s", "as")); //tikrina ar pirmas bet koks simolis, o antras s
        System.out.println(Pattern.matches(".t", "dt"));
        System.out.println(Pattern.matches(".d", "odt"));
        System.out.println(Pattern.matches(".d", "oodt"));
        System.out.println(Pattern.matches("..t", "odt"));

        Pattern emailPattern = Pattern.compile("^(.+)@(.+)$");  //elektoninio pasto validacija ^-zodzio pradzia  $- zodzio pabaiga
        // (.+)-visos reiksmes iki @
        Matcher emailMatcher = emailPattern.matcher("deim*.saltis@gmail.com");
        System.out.println(emailMatcher.matches());

    }

}
