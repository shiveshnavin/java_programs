package in.shivesh;

import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

class TestClass3 {

    public static void lg(String s)
    {
         System.out.println(s);
    }
    public TestClass3()
    {

    }

    public void initnVegs(int n)
    {
        N=n;
        nVegs=new int[N];
    }

    public void initnQueries(int q)
    {
        Q=q;
        nQueries=new int[Q];
    }

    public void solveQuery(int q)
    {

        if(q>sum){
            lg(""+-1);
            return;
        }

        int avg=nVegs[N-1];
       // lg("Avg  : "+avg);
        int prev=0;
        int curr=sum;
        while (curr>q)
        {
            prev=curr;
            curr=0;
            for(int i=0;i<N;i++)
            {
                if(nVegs[i] >= avg )
                {
                    curr+=avg;
                }
                else
                    curr+=nVegs[i];
            }

             lg("Q : "+q+" Prev : "+prev+" , curr "+curr+" avg : "+avg);

            if(prev>q && curr<=q)
            {
                break;
            }
            avg--;
        }
        lg("Avg  : "+avg);

    }

    public void start()
    {
       // lg(Arrays.toString(nQueries )+"\n"+Arrays.toString(bt));

        Arrays.sort(nVegs);
        sum=0;
        for(int i=0;i<N;i++)
        {
            sum+=nVegs[i];
        }
        avg=sum/N;

        for(int i=0;i<Q;i++)
        {
            solveQuery(nQueries[i]);
        }
    }

    int sum;
    int avg;
    int N;
    int Q;
    public int [] nVegs;
    public int [] nQueries;


    public static void main(String args[] ) throws Exception {



        String text="5\n" +
                "3 8 4 1 7\n" +
                "5\n" +
                "13\n" +
                "19\n" +
                "3\n" +
                "25\n" +
                "22";

        ByteArrayInputStream bais = new ByteArrayInputStream(text.getBytes());
        InputStreamReader isr = new InputStreamReader(bais);

        final TestClass3 testClass=new TestClass3();

        Scanner s=new Scanner(isr);
        testClass.initnVegs(s.nextInt());
        for (int i=0;i<testClass.N;i++)
        {
            testClass.nVegs[i]=s.nextInt();
        }

        testClass.initnQueries(s.nextInt());
        for (int i=0;i<testClass.N;i++)
        {
            testClass.nQueries[i]=s.nextInt();
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

                  Thread.sleep(2000);
                  t.stop();

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

