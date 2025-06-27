package in.shivesh;

import java.lang.reflect.Array;
import java.util.*;

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
//        Scanner s=new Scanner(System.in);
//        int T=s.nextInt();
//        while (T-->0)
//        {
//            int N=s.nextInt();
//            int K=s.nextInt();
//            int [] array=new int[N];
//            while (N-->0)
//            {
//                array[N]=s.nextInt();
//            }
//            kl(array,K);
//        }

        solveWithQ(new Integer[]{2,7,1,3,9,12,55,8});
    }

    public static void solveWithQ(Integer arr[]){

        Queue<Integer> s = new ArrayDeque<>(3);
        ArrayList<Integer> ss = new ArrayList<>(Arrays.asList(arr));
        Integer t = ss.stream().reduce(0,(curTtl,curEle)->{
            return Math.max(curEle,curTtl);
        });
        System.out.println("Agg "+t);
        int curMax = 0;
        int i=0;
        while (i<arr.length){
            if(curMax < arr[i]){
                curMax = arr[i];
                s.add(curMax);
                if(s.size()>3){
                    s.remove();
                }
            }
            i++;
        }

        System.out.println("QQ "+s.peek());
    }
}
/*

2
5 2
12 5 787 1 23
7 3
1 23 12 9 30 2 50

 */