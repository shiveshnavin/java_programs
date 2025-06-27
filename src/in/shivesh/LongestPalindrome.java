package in.shivesh;

public class LongestPalindrome {

    public boolean checkPalindrome(String st)
    {
        for(int i=0;i<st.length()/2;i++){
            if(st.charAt(i)!=st.charAt(st.length()-1-i))
                return false;
        }
        return true;
    }
    public LongestPalindrome()
    {



        String str="XABAHJXABXXBADasdafaa";
        String largest="";
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                String substr=str.substring(i,j+1);
                if(substr.length()>largest.length() && checkPalindrome(substr)){
                    largest=substr;
                }
            }
        }

        System.out.println(largest);
    }

    public static void main(String[] args) {
        new LongestPalindrome();
    }


}
