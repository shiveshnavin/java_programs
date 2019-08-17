package in.hoptec;

import java.util.Scanner;

public class ArrayKLargestElements {

    public static void kl(int [] arr,int K)
    {
        int maxarr [] =new int[K];

        for(int i=0;i<arr.length;i++)
        {

            for(int k=0;k<K;k++)
            {
                if(arr[i]>maxarr[k])
                {
                    for(int j=K-1;j>k;j--)
                    {
                        maxarr[j]=maxarr[j-1];
                    }
                    maxarr[k]=arr[i];
                    break;
                }
            }
        }

        for(int k=0;k<K;k++)
        {
            System.out.print( maxarr[k] +" ");
        }

    }

    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        while (T-->0)
        {
            int N=s.nextInt();
            int K=s.nextInt();
            int [] array=new int[N];
            while (N-->0)
            {
                array[N]=s.nextInt();
            }
            kl(array,K);
        }
    }
}
/*

2
5 2
12 5 787 1 23
7 3
1 23 12 9 30 2 50

 */