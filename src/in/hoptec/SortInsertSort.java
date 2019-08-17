package in.hoptec;

public class SortInsertSort extends Sort
{
    @Override
    void sort() {
        print();


        for(int i=1;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j] > key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }

/* //method 1
        int pos=0;
        for(int i=0;i<arr.length;i++)
        {
            lg("Taking "+arr[i]);
            pos=-1;
            for(int j=0;j<i;j++)
            {

                if(arr[i]<arr[j])
                {

                    lg("Insert after "+arr[j]+" i= "+i+" j="+j);
                    pos=j;
                    break;

                }


            }

            int val=arr[i];
            if(pos!=-1)
            {
                for(int k=i;k>pos;k--)
                {
                    arr[k]=arr[k-1];
                }
                arr[pos]=val;
            }



            print();
        }*/

        print();
    }

    public static void main(String [] args)
    {
        SortInsertSort sort=new SortInsertSort();
        sort.sort();
    }
}
