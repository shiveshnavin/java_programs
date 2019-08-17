package in.hoptec;

public class SelectSort extends Sort
{
    @Override
    void sort() {
        print();

        for(int i=0;i<arr.length;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                    /*int tmp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=tmp;*/
                }
            }
          /*  int tmp=arr[min];
            arr[min]=arr[i];
            arr[i]=tmp;
*/

            int b=arr[min],a=arr[i];
            b=a+b;
            a=b-a;
            b=b-a;

            arr[min]=b;
            arr[i]=a;
        }

        print();
    }


    public static void main(String [] ar)
    {
        SelectSort s=new SelectSort();
        s.sort();;

    }

}
