package in.shivesh;

public class TrapppingRainWater {


    public static void main(String [] args)
    {
        int arr[]={8 ,0 ,8 };

        int pMax=0;
        int total=0;


        for(int i=0;i<arr.length;i++)
        {


            int rightMax=arr[arr.length-1];

            for(int j=arr.length-1;j>i;j--)
            {
                if(arr[j]>rightMax)
                {
                    rightMax=arr[j];
                }
            }

            if(rightMax<arr[i])
            {
                int rPmax=arr.length-1;
                for(int j=arr.length-1;j>=i;j--)
                {
                    if(arr[j]>arr[rPmax])
                    {
                        int k=rPmax-1;
                        while(k>j)
                        {
                            total+=arr[rPmax]-arr[k];
                            k--;
                        }
                        rPmax=j;

                    }
                }
                break;
            }
            else if(arr[i]>=arr[pMax])
            {
                int j=i-1;
                while (j>pMax)
                {
                    total+=arr[pMax]-arr[j];
                    j--;
                }
                pMax=i;
            }
        }

        System.out.println( total);


    }


}
