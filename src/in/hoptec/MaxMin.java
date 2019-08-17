package in.hoptec;

import java.util.Scanner;

public class MaxMin {

    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter No of Values : ");
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,sum=0,n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter "+i+"th number : ");
            int num=s.nextInt();
            if(num>max)
            {
                max=num;
            }
            if(num<min)
            {
                min=num;
            }
        }
        System.out.println("Max is "+max+" & Min is "+min+" & Sum is "+(max+min));

    }

}
