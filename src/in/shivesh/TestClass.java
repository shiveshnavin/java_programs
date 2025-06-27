package in.shivesh;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

class TestClass {

    public static void lg(String s)
    {
        System.out.println(s);
    }


    public static void lgp(String s)
    {
      System.out.print(s);
    }

    public TestClass()
    {

    }

    public void initnVegs(int n)
    {
        N=n;
        bt =new int[N][2];
    }


    int revs=0;
    void isDivisible(int goTill)
    {

        int MAX=0;
        for(int i=0;i<N;i++)
        {
            int diff=bt[i][1]-bt[i][0];

            if(diff>MAX)
                MAX=diff;
        }
        revs=MAX;



    }


    public void start()
    {

        try{


            isDivisible(1) ;

        }catch(Exception e)
        {
            e.printStackTrace();
        }
            System.out.println(revs);

    }

    int N;
    public int [][] bt;


    public static void main(String args[] ) throws Exception {



        String text="3\n" +
                "1 1\n" +
                "3 7\n" +
                "5 4";

        ByteArrayInputStream bais = new ByteArrayInputStream(text.getBytes());
        InputStreamReader isr = new InputStreamReader(bais);

        final TestClass testClass=new TestClass();

        Scanner s=new Scanner(isr);
        testClass.initnVegs(s.nextInt());
        for (int i=0;i<testClass.N;i++)
        {
            testClass.bt[i][0]=s.nextInt();
            testClass.bt[i][1]=s.nextInt();
        }


        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                testClass.start();
            }
        });

        Thread wd=new Thread(new Runnable() {
            @Override
            public void run() {
              try{

                //  Thread.sleep(2000);
                //  t.stop();

              }catch(Exception e)
              {
                  e.printStackTrace();
              }
            }
        });


        t.start();
        wd.start();

    }




}

