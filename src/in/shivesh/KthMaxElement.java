package in.shivesh;

public class KthMaxElement extends Sort {
    @Override
    void sort() {

        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }

        int K=3;
        for(int i=1;i<=K;i++){
            swap(arr,n-i,0);
            heapify(arr,(n-1)-i,0);
        }

        System.out.println(arr[n-K]);
    }

    public void swap(int [] arr,int lx,int rx){
        int tmp=arr[lx];
        arr[lx]=arr[rx];
        arr[rx]=tmp;
    }
    public int right(int i){
        return 2*i + 2;
    }

    public int left(int i){
        return 2*i + 1;
    }
    public void heapify() {

        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n-1,i);
        }


    }
    public void heapify(int [] arr ,int lastIndex,int parent){

        int l=left(parent);
        int r=right(parent);
        int mi=parent;

        if(l>lastIndex || r>lastIndex)
            return;

        if(arr[l]>arr[mi])
        {
            mi=l;
        }
        if(arr[r]>arr[mi])
        {
            mi=r;
        }

        if(mi!=parent){
            swap(arr,mi,parent);
            heapify(arr,lastIndex,mi);
        }

    }

    public static void main(String[] args) {
        KthMaxElement sortHeap2=new KthMaxElement();
//        sortHeap2.print();
//        System.out.println("----------");
        sortHeap2.sort();

    }

}
