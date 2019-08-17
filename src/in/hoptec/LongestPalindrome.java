package in.hoptec;

public class LongestPalindrome {

    public boolean checkPalindrome(String st)
    {
        int i=0;
        while (i++<st.length())
        {
            if(st.charAt(i)!=st.charAt(st.length()-i))
                return false;
        }
        return true;
    }
    public LongestPalindrome()
    {



        String str="ana";
        System.out.printf(""+checkPalindrome(str));



    }


}
