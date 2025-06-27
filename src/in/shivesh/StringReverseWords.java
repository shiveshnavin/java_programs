package in.shivesh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringReverseWords {


    public static void main(String[] args) {

        String word = " Shivesh never accepts defeat .";

        Pattern rev=Pattern.compile("(\\w+)");
        Matcher mat=rev.matcher(word);
        while (mat.find()){
            PrintUtil.print(mat.start(),mat.end(),mat.group());
            word=word.substring(0,mat.start())
                    +new  StringBuilder(word.substring(mat.start(),mat.end())).reverse().toString()
                    +word.substring(mat.end());
        }

        PrintUtil.print("-",word,"-");
    }

}
