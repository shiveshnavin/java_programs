package in.shivesh;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int T = sc.nextInt();
        if(T > 1000) return;
        while(T-- > 0)
        {
            int N = sc.nextInt();
            if(N > 1000) return;
            int K = sc.nextInt();
            String str=sc.next();
            System.out.println((pow(str))+" "+K);

        }

    }



    public static int pow(String s)
    {
        int al=0;
        int bl=0;
        for(int i=  0;i<s.length();)
        {
            char c = s.charAt(i);
            int n=0;
            while(i<s.length() && s.charAt(i) == c)
            {
                n++;
                i++;
            }
            if(c=='a')
            {
                al= n*(n+1)/2 ;
            }
            else
            {
                bl= n*(n+1)/2 ;
            }
        }

        return al+bl;
    }
}