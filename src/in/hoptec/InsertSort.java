package in.hoptec;

public class InsertSort extends Sort
{
    @Override
    void sort() {
        print();

        int pos=-1;
        int min=arr[0];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            for(j=0;j<i;j++)
            {

                if(arr[j]>arr[i])
                {
                    pos=j;
                    break;

                }


            }
            if(pos!=-1)
            {
                for(j=pos;j<i;j++)
                {
                    arr[j+1]=arr[j];


                }
                arr[pos]=arr[i];
                pos=-1;
            }
            print();
        }

        print();
    }
}
