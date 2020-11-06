package in.hoptec;

import java.util.*;

class StringPalindromesArray {


    boolean checkpal(String s) {
//
//        if(s.charAt(0)!=s.charAt(s.length()-1))
//            return false;

        for (int i = 0; i <= s.length() / 2 - 1; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }


    void palindromes(String str, ArrayList<String> resultarr) {

        if (str.length() <= 1) {
            resultarr.add(str);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            for (int j = str.length() - 1; j > i; j--) {
                String substr = str.substring(i, j);
                if (checkpal(substr)) {
                    int start = i;
                   int  end = j;
                    resultarr.add(substr);
                    if(start>0)
                    palindromes(str.substring(0, start-1), resultarr);
                    if(end<str.length())
                    palindromes(str.substring(end, str.length() - 1), resultarr);
                    return;

                }
            }

        }

    }


    public void m(String x){
        System.out.println("SortHeapMin");
    }
    public void m(SortHeap  x){
        System.out.println("SortHeap");
    }

    public static void main(String[] args) {


        StringPalindromesArray s=new StringPalindromesArray();

        ArrayList<String>  re=new ArrayList<>();
        s.palindromes("sshsevesh",re);
        PrintUtil.print(re);

        s.m(new SortHeap());
        s.m(new SortHeapMin());
//        s.m(null);
        Collection c=new ArrayList();

    }

}