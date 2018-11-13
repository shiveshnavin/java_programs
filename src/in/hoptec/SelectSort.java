package in.hoptec;

public class SelectSort extends Sort
{
    @Override
    void sort() {
        print();

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int tmp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=tmp;
                }
            }
        }

        print();
    }
}
