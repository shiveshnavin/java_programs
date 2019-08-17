package in.hoptec;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LargestElementOnRight {

    //1-14 === 1-30

    public int [] getReplaced(int ar [])
    {


        for(int i=0;i<ar.length;i++)
        {


            int lar=0;
            for(int j=i+1;j<ar.length;j++)
            {
              if(ar[j]>lar)
                  lar=ar[j];

            }

            ar[i]=lar;

        }
        ar[ar.length-1]=-1;


        return ar;
    }
    public LargestElementOnRight()
    {

        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();

        for(int t=2;t<T;t++)
        {
            int N=scanner.nextInt();
            int ar [] =new int[N];
            int x=0;
            while (x<N)
            {
                ar[x]=scanner.nextInt();
                x++;
            }

            getReplaced(ar);


            for(int i=0;i<ar.length;i++)
            {
                System.out.printf(ar[i]+" ");
            }

            System.out.printf("\n");

        }


    }

}
