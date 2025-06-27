package in.shivesh;

public class NTimesX {

     public static void main(String [] args)
    {

        int X=6;
        int N=14;
        int M=9;
        Long num=new Long(X);
        for(int i=1;i<N;i++)
        {
            num+= new Double(X*(Math.pow(10,i))).longValue();
        }

      Integer  person=22;
        System.out.println(" pers "+person);

        change(person);

        System.out.println(" pers "+person);

    }


   static public void change(Integer p)
    {


    }

}
