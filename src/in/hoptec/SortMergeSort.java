package in.hoptec;

public class SortMergeSort extends Sort {


    public void merge  (int arr[],int l,int r,int m)
    {
        int ll=m-l+1;
        int rl=r-m;
        int [] L=new int[ll];
        int [] R=new int[rl];


        for(int i=0;i<ll;++i)
        {
            L[i]=arr[l+i];
        }

        for(int i=0;i<rl;++i)
        {
            R[i]=arr[m+i+1];

        }

        int i=0,j=0,k=l;

        while (i<ll&&j<rl)
        {
            if(L[i]<=R[j])
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
        while(i<ll  ) {
            arr[k] = L[i];
            k++;i++;
        }
        while(j<rl )
        {
            arr[k]=R[j];
            k++;j++;
        }



    }

    public void doSort(int arr[],int l,int r)
    {
        if(l<r)
        {
            int m=(l+r)/2;

            doSort(arr,l,m);
            doSort(arr,m+1,r);


            merge(arr,l,r,m);

        }
    }


    @Override
    void sort() {


        print();
        doSort(arr,0, arr.length-1);
        print();




    }
}
