package in.hoptec;

import java.io.IOException;
import java.util.*;

public class MaxRectAreaInSubseq {





        public static void main(String[] args) throws IOException {

            //System.out.println("MAX : "+maxProduct(arr,0, n-1));;

            //if(1==1) return;
            Scanner sc=new Scanner(System.in);


            int N = sc.nextInt();
            int Q = sc.nextInt();
            int ar [] =new int [N];
            for(int i =0 ;i<N;i++)
            {
                ar[i] = sc.nextInt();
            }


            while(Q>0)
            {
                // sc.nextInt()
                int p0  = sc.nextInt();
                int p1  = sc.nextInt() ;
                int p2   = sc.nextInt();


                if(p0 == 2)
                {
                    ar[p1-1] = p2 ;
                }
                else if(p0 == 1)
                {

                        //  System.out.println("Inp "+p0+ " "+p1 + " "+p2+" -> "+maxProduct(ar,p1 -1, p2  ));
                        int ar2 [] =new int[p2-p1+1];
                    System.arraycopy(ar, p1 - 1, ar2, 0, ar2.length);
                    System.out.println(findLargestSumPair(ar2,ar2.length));

                }

                Q--;
            }


        }



        static int findLargestSumPair(int arr[], int n)
        {
            // Initialize first and second largest element
            int first, second;
            if (arr[0] > arr[1])
            {
                first = arr[0];
                second = arr[1];
            }
            else
            {
                first = arr[1];
                second = arr[0];
            }

            // Traverse remaining array and find first and second largest
            // elements in overall array
            for (int i = 2; i<n; i ++)
            {
        /* If current element is greater than first then update both
        first and second */
                if (arr[i] > first)
                {
                    second = first;
                    first = arr[i];
                }

                /* If arr[i] is in between first and second then update second */
                else if (arr[i] > second && arr[i] != first)
                    second = arr[i];
            }
            return (first * second);
        }


    }
