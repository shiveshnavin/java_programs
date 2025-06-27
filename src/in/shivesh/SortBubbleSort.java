package in.shivesh;

public class SortBubbleSort extends Sort {

  /*  public class Person{

        String name
        char gender
        int age
    }

    public class BusTicket
    {
        int ticketNo
        float ticketPrice
        float totalAmount
        Person person
        public void calculateTotal()
        {
            //calculate totalAmount based on condidiotn here
        }
    }


    public static BusTicket getTicketDetails()
    {
        BusTicket bs=new BusTicket();
        Person p=new Person();
        //fill person details in p

        bs.setPerson(p);


        bs.setTickerNo(14324);
        //fill ticket  details in bs
        bs.calculateTotal();


        return bs;

    }*/

    @Override
    void sort() {

        print();
 /*       for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int tmp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=tmp;
                }
            }
        }

*/
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



    public static void main(String [] ar)
    {
        long start = System.nanoTime();
        SortBubbleSort s=new SortBubbleSort();
        s.sort();;
        long time = System.nanoTime() - start;
        System.out.println("Duration "+time);
    }
}
