package in.hoptec;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringReverseKeepSpecialChars {

    //Program to reverse string leaving special character as it is

    // start 8:22

    public static void main(String[] args) {

        String str="ab$*&z&__*cde*f";

        Pattern loopPattern = Pattern.compile("[^A-Za-z0-9]");
        Matcher matcher=loopPattern.matcher(str);

        String strrep=str.replaceAll("[^A-Za-z0-9]","");
        StringBuilder sbr = new StringBuilder(strrep);
        sbr.reverse();

        while (matcher.find()) {
            System.out.println(matcher.group());
            sbr.insert(matcher.start(),matcher.group());
        }


        System.out.println(sbr.toString());



    }
}
