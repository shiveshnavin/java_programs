package in.hoptec;

public abstract class Sort {


    public int arr[] ={3,6,84,55,1,94,23,64};

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


    }

    abstract void sort();



}
