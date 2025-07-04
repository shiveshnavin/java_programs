package in.shivesh;

import java.util.Scanner;

import static java.lang.Math.max;

public class AngryScholar {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();

        for(int k=0;k<N;k++)
        {
            int g=sc.nextInt();
            sc.nextLine();
            String sch= sc.nextLine();

             char [] car = sch.toCharArray();

            int count = 0 ;
            int max = 0;
            for(int i=car.length-1;i>=0;i--)
            {
               // System.out.println(car[i]);
                if(car[i]=='P')
                {
                  //  System.out.println("-> "+count);
                     count++;
                }
                else if(car[i]=='A' )
                {

                    if(count>max)
                    {
                        max = count ;
                    //    System.out.println("-> MAX "+max);

                    }
                    count=0;
                }
            }
            System.out.println(max);
        }
    }
    static int lcs( char[] X, char[] Y, int m, int n )
    {
        int L[][] = new int[m+1][n+1];

    /* Following steps build L[m+1][n+1] in bottom up fashion. Note
         that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
        for (int i=0; i<=m; i++)
        {
            for (int j=0; j<=n; j++)
            {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (X[i-1] == Y[j-1])
                    L[i][j] = L[i-1][j-1] + 1;
                else
                    L[i][j] = max(L[i-1][j], L[i][j-1]);
            }
        }
        return L[m][n];
    }

}
