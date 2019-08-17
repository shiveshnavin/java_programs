package in.hoptec;

public class MatrixSpiral {

    public static void print(int [][]arr,int i,int j,int R,int C)
    {
        while(j<C-1)
        {
            System.out.println(arr[i][j++]);
        }


        while(i<R-1)
        {
            System.out.println(arr[i++][j]);
        }


        j=0;C--;
        while(j<=C-1)
        {
            System.out.println(arr[i][C-j++]);
        }

        j=C-j;i=0;R--;
            while(i<R-1)
        {
            System.out.println(arr[R-i++][j]);
        }

        i=R-i;


            print(arr,i,j,R,C);
    }
    public static void main(String [] args)
    {
        int R=4,C=4;
        int arr[][]=new int[R][C];
        int cout=0;
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                arr[i][j]=cout++;
            }
        }

        print(arr,0,0,R,C);

    }

}
