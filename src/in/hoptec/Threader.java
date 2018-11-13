package in.hoptec;

import java.util.*;
import java.util.stream.Collectors;

public class Threader extends BaseClass{



    @FunctionalInterface
    static interface TestInterface{


        int x(int x);


    }





    public class Tommy extends Puppy
    {


        TestInterface xx=(x) -> x*x;



        int meals=0;
          int feds=0;
         void junmp()
        {
            l("Feeding "+name+" "+meals++);



        }
    }


    Tommy pup,dog,mammal;
    public Threader()
    {
        pup=new Tommy();

        Runnable r1=new Runnable() {
            @Override
            public void run() {


                for(int i=0;i<5;i++)
                try {
                    pup.name="Pup Voda Thread 1 "+i;
                 synchronized (pup)
                 {
                     pup.sound();
                     pup.meals=11;
                 }

                    l(" measl ="+pup.meals);
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        };


        Runnable r2=new Runnable() {
            @Override
            public void run() {


                for(int i=0;i<5;i++)
                    try {
                        pup.name="Pup Voda Thread 2 "+i;
                        pup.junmp();
                        Thread.sleep(1000);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


            }
        };

        Thread thread1=new Thread(r1);
        thread1.setPriority(3);
       // thread1.start();




        Thread thread2=new Thread(r2);
      //  thread2.start();


        StringBuffer s=new StringBuffer("");
        s.reverse();


        Thread tr33=new Thread(() -> System.out.println("RUnning"));
        tr33.start();

            /********TEMP CODE******/



    //    gtseries();

        Set<String> set=new HashSet();
        set.add("AA");
        set.add("A");


        List<String> strings=set.stream().distinct().collect(Collectors.toList());
        ArrayList<String> st=new ArrayList<>(strings);



    }

    void printf(String s,int c)
    {
        s=s.replace("%d",""+c);

        System.out.println(s);
    }

    void getSeries()
    {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> nos=new ArrayList<>();

        System.out.println("Enter Series , enter -1 to end series ");
        int ip=-1;
        while(true)
        {
            ip=s.nextInt();
            if(ip==-1)
                break;
            nos.add(ip);
        }

        int count=0;
        System.out.println("Series Is : ");
        for(int i=0;i<nos.size();i++)
        {

            System.out.print(" "+nos.get(i));
            count+=getLoops(nos.get(i));
        }
        System.out.println("\nNo Of Loops = "+count);
    }


    void gtseries()
    {

        int series[] ={1,2,3,4,5,8};
        int N=6;
        int i=0,count=0;

        for(i=0;i<6;i++)
        {
            count+=getLoops(series[i]);
        }

        printf("Loops : %d",count);


    }

    int getLoops(int n)
    {
        switch (n)
        {
            case 0:
                return 1;
            case 4:
                return 1;
            case 6:
                return 1;
            case 8:
                return 2;
            case 9:
                return 1;

        }
        return 0;
    }














}
