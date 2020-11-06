package in.hoptec;

public class SortHeapMin extends SortHeap{

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

    public void heapify(int arr[],int lastIndex,int parent){

        int li=left(parent);
        int ri=right(parent);
        int mi=parent;

        if(li>lastIndex || ri>lastIndex)
            return;

        if(arr[li]<arr[mi])
            mi=li;

        if(arr[ri]<arr[mi])
            mi=ri;


        if(mi!=parent){
            swap(arr,parent,mi);
            heapify(arr,lastIndex,mi);
        }

    }

    @Override
    void sort() {

        for(int i=n/2-1;i>=0;i--)
            heapify(arr,n-1,i);



    }

    public static void main(String[] args) {
        SortHeapMin s=new SortHeapMin();
        s.sort();
        s.print();
    }
}
