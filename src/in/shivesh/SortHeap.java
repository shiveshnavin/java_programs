package in.shivesh;

public class SortHeap extends Sort {
    @Override
    void sort() {

        heapSort();
    }





    public void heapify(int arr[],int n,int i)
    {
        int l=2*i+1;
        int r=2*i+2;
        int largest=i;

        if(l<n && arr[largest]<arr[l])
        {
            largest=l;
        }

        if(r<n && arr[largest]<arr[r])
        {
            largest=r;
        }

        if(largest!=i)
        {
            int tmp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=tmp;
            heapify(arr,n,i);
            System.out.printf("->");print();

        }

    }
    public void heapSort()
    {
        for(int i=n/2-1;i>=0;i--)
        {
            heapify(arr,n,i);
            print();
        }

        System.out.println("After heapificaiton ");
        print();

        for(int i=n-1;i>=0;i--)
        {
            int tmp=arr[0];
            arr[0]=arr[i];
            arr[i]=tmp;
            heapify(arr,i,0);
            print();
        }
    }

    public static void main(String[] args) {
        SortHeap s=new SortHeap();

        s.print();
        s.sort();
        s.print();;
    }
}
