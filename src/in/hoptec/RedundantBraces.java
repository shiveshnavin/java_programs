package in.hoptec;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class RedundantBraces {

    public static void main(String[] args) {
        String st = "a+b*(c+d)";
        System.out.println(isContaintinRedundantBrace(st.toCharArray())?"yes":"no");
    }

    /*



a+b*

     */

    public static boolean isContaintinRedundantBrace(char [] str){

        Stack<Character> st = new Stack<>();
        List<Character> operator = Arrays.asList('+','*','-','/');

        for(Character c:str){


            if(c == ')'){ //c == '(' ||

//                if(c == '('){
//                    if(st.peek() == '(')
//                        return true;
//                    else
//                        st.push(c);
//                }
//                else {
                    char curChar = st.pop();
                    boolean isLastBlockContainsOperator = false;

                    while (curChar != '('){
                        if(operator.contains(curChar)){
                            isLastBlockContainsOperator = true;
                        }
                        curChar = st.pop();
                    }
                    if(!isLastBlockContainsOperator){
                        return true;
                    }

//                }

            }
            else {
                st.push(c);
            }
        }

        return false;

    }


}
