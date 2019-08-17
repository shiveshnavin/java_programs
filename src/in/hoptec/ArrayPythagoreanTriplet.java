package in.hoptec;

public class ArrayPythagoreanTriplet {

    public static int partition(int arr[],int low,int high)
    {

        int i=low-1;

        for(int j=low;j<high;j++)
        {
            if(arr[high]>=arr[j])
            {
                i++;
                int tmp=arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
            }
        }

        int tmp=arr[high];
        arr[high]=arr[i+1];
        arr[i+1]=tmp;

        return i+1;
    }
    public static void quickSort(int arr[],int low,int high){

        if(low<high)
        {
            int p=partition(arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }

    }



    public static void main(String [] args)
    {
        int arr[]= {10, 4, 6, 12, 5};

        SortQuickSort sort=new SortQuickSort();
        sort.arr=arr;
        sort.sort();
        sort.print();


        for(int a=0;a<arr.length;a++)
        {
            for(int b=a+1;b<arr.length;b++)
            {
                for(int c=b+1;c<arr.length;c++)
                {
                    if(Math.pow(arr[a],2)+Math.pow(arr[b],2)==Math.pow(arr[c],2))
                    {
                        System.out.println(" yes yes yes "+arr[a]+" "+arr[b]+"="+arr[c]+" ");
                        break;
                    }
                }
            }
        }




    }
}
