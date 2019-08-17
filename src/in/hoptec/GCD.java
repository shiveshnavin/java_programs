package in.hoptec;

import java.util.Scanner;

public class GCD {


    //10:21 -- > 10:43
    public int getGCD(int x,int y)
    {
        int num;
        int n2=y,n1=x;
        if(x>y)
        {
            n2=x;
            n1=y;
        }

        num=1;
        if(n2%n1==0)
            return n1;
        for(int i=1;i<=n1/2;i++)
        {
            if(n1%i == 0 && n2%i == 0)
                num=i;
        }

        return num;
    }

    public int getLCM(int x,int y)
    {
        int n2=y,n1=x;
        if(x>y)
        {
            n2=x;
            n1=y;
        }


        if(n2%n1==0)
            return n2;

        int i=1;
        while (true)
        {
            int test=n1*i++;
            if(test % n2==0)
                return test;

        }


    }

    public GCD() {


        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n-->0)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println(getLCM(x,y)+" "+getGCD(x,y));

        }



    }
}
