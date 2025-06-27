package in.shivesh;

public class SortQuickSort extends Sort{
    @Override
    void sort() {

      //  print();
        doSort(arr,0,arr.length-1);
      //  print();

    }

    public void doSort(int arr[],int low,int high){


        if(low<high)
        {
            int pi=partition(arr,low,high);
            doSort(arr,low,pi-1);
            doSort(arr,pi+1,high);
        }


    }

    public int partition(int arr[],int low,int high)
    {

        int pv=arr[high];
        int i=low-1;

        for(int j=low;j<high;j++)
        {
            if(arr[j]<=pv)
            {

                i++;
                int tmp=arr[j];
                arr[j]=arr[i];
                arr[i]=tmp;
            }
        }

        int tmp=arr[high];
        arr[high]=arr[i+1];
        arr[i+1]=tmp;
       // print();
        return i+1;


    }

    public static void main(String [] args)
    {
        SortQuickSort s= new SortQuickSort();
        s.print();
        s.sort();
        s.print();
    }
}
