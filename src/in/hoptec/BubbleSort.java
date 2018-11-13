package in.hoptec;

public class BubbleSort extends Sort {



    @Override
    void sort() {

        print();


        for(int i = 0; i< arr.length; i++)
        {
            boolean swap=false;
            for(int j=1;j<arr.length-i-1;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    swap=true;
                    int tmp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tmp;
                }
            }
            if(!swap)
                break;


        }


        print();
    }
}
