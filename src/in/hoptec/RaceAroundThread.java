package in.hoptec;

public class RaceAroundThread {


    public   int x=1;
    public   long time;
    public RaceAroundThread() {


        time=System.currentTimeMillis()+2000;



        Thread t=new Thread()
        {
            @Override
            public void run() {

                while (time!=System.currentTimeMillis());
                x=x+5;

            }
        };

        Thread t2=new Thread()
        {
            @Override
            public void run() {
                while (time!=System.currentTimeMillis());
                x=x*3;
            }
        };
        t.start();;
        t2.start();

        Thread t23=new Thread()
        {
            @Override
            public void run() {

                try {
                    Thread.sleep(4000);
                    System.out.printf(""+x);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        t23
                .start();;


    }
}
