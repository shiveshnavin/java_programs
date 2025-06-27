package in.shivesh;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Itv {


    char []  arr1={'a','z','z','b','i'};
    char [] arr2={'j','a','z'};

    public char [] getCom()
    {
        if(arr1==null || arr2 == null)
        {
            return null;
        }

        Set<Character> st=new HashSet<>();

        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j] )
                {
                        st.add(arr1[i]);
                }
            }
        }

        char [] res=new char[st.size()];
        int i=0;
        Iterator<Character> it=st.iterator();
        while (it.hasNext())
        {
            res[i++]=it.next();
        }

        for(char c:res)
        {
            System.out.println(""+c);
        }

        return res;
    }


    public static void main(String[] args) {



        Itv y=new Itv();

            y.getCom();



    }
}
