package in.shivesh;

public class SortMergeSort2 extends Sort{

    public static void main(String [] args)
    {
        new ThreadSafeExec(1){
            @Override
            public void runThis() {
               new SortMergeSort2(). sort();
            }
        };


    }


    @Override
    void sort() {


        print();
        mergeSort(arr,0,arr.length-1);
        print();


    }


    public void mergeSort(int [] arr,int l,int r)
    {

        if(l<r)
        {
            int m=(l+r)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);

            merge(arr,l,r,m);
        }

    }

    public void merge(int [] arr,int l,int r,int m)
    {

        int n1=m+1-l;
        int n2=r-m;

        int L[]=new int[n1];
        int R[]=new int[n2];

        int i=0;
        int j=0;
        int k=0;

        for(i=0;i<n1;i++)   L[i]=arr[l+i];
        for(j=0;j<n2;j++)   R[j]=arr[m+j+1];

        i=0;j=0;k=l;
        while(i<n1 && j<n2)
        {
            if(L[i]<R[j])
            {
                arr[k]=L[i];
                i++;
            }
            else
            {
                arr[k]=R[j];
                j++;
            }
            k++;

        }


        while(i<n1)
        {
            arr[k++]=L[i++];
        }

        while(j<n2)
        {
            arr[k++]=R[j++];
        }



    }




}
