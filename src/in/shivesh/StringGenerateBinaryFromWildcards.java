package in.shivesh;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//https://www.geeksforgeeks.org/generate-all-binary-strings-from-given-pattern/
//20:08
public class StringGenerateBinaryFromWildcards {

    public static void main(String[] args) {
        String str = "1??0?101";
        char[] buf = str.toCharArray();
        List<Integer> wildcardLocations = new ArrayList<>();
        for (int i = 0; i < buf.length; i++) {
            char c = buf[i];
            if(c == '?')
             wildcardLocations.add(i);
        }
        List<String> result = new ArrayList<>();
        double siz = Math.pow(2, wildcardLocations.size());
        for (int k = 0; k < siz; k++) {
            char[] bin = Integer.toBinaryString(k).toCharArray();
            int c = 0;
            for (int i = wildcardLocations.size() - 1; i >=0; i--) {
                if(c>=bin.length){
                    buf[wildcardLocations.get(i)] = '0';
                }
                else
                buf[wildcardLocations.get(i)] = bin[c++];
            }
            result.add(String.valueOf(buf));
        }
        System.out.println(result.size());
        System.out.println(result);
    }

    /*
     10000101
        10001101
        10100101
        10101101
        11000101
        11001101
        11100101
        11101101

[10000101, 10001101, 10001101, 10101101, 10001101, 11001101, 10101101, 11101101]

     */
}
