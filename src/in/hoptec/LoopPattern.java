package in.hoptec;

public class LoopPattern {


    public static void l(String pr)
    {
        System.out.print(""+pr);
    }

    public LoopPattern(int n)
    {
        /*
input : 4
output :

1
3*2
4*5*6
10*9*8*7
11*12*13*14*15

         */

        int ctr=1;
        for(int i=1;ctr<n*n;i++)
        {
            int ptr=ctr;
            if(i==1 || i%2!=0)
               ;
            else
                ptr=ctr+i-1;

            for(int j=1;j<=i;j++)
            {
                if(i==1 || i%2!=0)
                {
                    l(""+ptr);
                    ptr++;
                }
                else {
                    l(""+ptr);
                    ptr--;
                }
                if(j+1<=i)
                    l("*");
                ctr++;
            }
            l("\n");


        }


    }
}
