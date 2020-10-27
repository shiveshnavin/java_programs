package in.hoptec;

public class MarsStones {

    public static void main(String[] args) {

//       System.out.println(""+max(10,3,new int[]{1,3,5}));
        System.out.println(""+max(14,4,new int[]{4,6,8,9}));

    }

    public static int max(int input1,int input2,int  [] input3)
    {
        int M=input1;
        int N=input2;
        int arr[]=input3;

        int count=0;
        int sum=0;
        for(int i=1;i<=M;i++)
        {
            boolean isUni=true;
            for(int j=0;j<N;j++)
            {
                if(i==arr[j])
                   {
                       System.out.println("not found "+i);
                       isUni=false;

                   }

            }
            if(isUni && sum <= M)
            {
                System.out.println(" found "+i);
                count++;
                sum+=i;
            }
        }

        return count-1;
    }


}
