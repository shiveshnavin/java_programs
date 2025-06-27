package in.shivesh;

public class Count1sInMatrix {
    /*
     Suppose that each row of an 'n x n' array A consists of l's and O's such that, in any row of A,
     all the l's come before any O's in that row. Suppose further that the number of l's in row 'i' is at
     least the number in row 'i + 1' . Complexity must be O(n) */


    public int [] count1s(int [][] m)
    {
        int coloumn=0;
        int row=m.length-1;
        int res [] =new int[m.length];
        while(coloumn<m.length)
        {
            if(m[row][coloumn]==1)
            {
               res[row]++;
                coloumn++;
            }
            else
            {
                if(row>0) res[row-1]=res[row];
                row--;
            }

        }

        return res;
    }

    public static void main(String[] args) {
        int ar[][]={
                {1,1,1,1},
                {1,1,1,0},
                {1,1,0,0},
                {1,1,0,0},
        };
        int res [] =new Count1sInMatrix().count1s(ar);
        for(int i=0;res.length>i;i++)
        {
            System.out.println(""+i+" : "+res[i]);
        }
    }

}
