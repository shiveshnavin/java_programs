package in.hoptec;

public abstract class Sort {


    public int arr[] = {7,2,5,6,8,9,3,4,1};//{12, 11, 13, 5, 6, 7}; ;
    public int n=arr.length;

    public Sort()
    {

    }
    public Sort(int arr[])
    {
        this.arr =arr;
    }
    public void lg(Object t)
    {
        if(t==null)
            t="null";
        System.out.println(""+t.toString());
    }
    void print(){

        int i=0;
        lg("\nArray Is : ");
        while(i< arr.length)
        {
            System.out.print(" "+ arr[i++]);
        }

        lg("");

    }

    abstract void sort();



}
