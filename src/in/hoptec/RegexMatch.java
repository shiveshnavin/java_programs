package in.hoptec;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatch {

    public static void main(){
        String str = "$$aadas";
        Pattern pattern=Pattern.compile("^\\$2+");
        Matcher matcher=pattern.matcher(str);
        while (matcher.find())
        {
            System.out.println("Start "+matcher.start());
            System.out.println("End "+matcher.start());
            System.out.println("Char "+matcher.group());
        }

    }


}
