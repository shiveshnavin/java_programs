package in.shivesh;

public abstract class ThreadSafeExec  {

    abstract public void runThis();

    public ThreadSafeExec(){










    }
    public ThreadSafeExec(Object autorun){run();}

    Thread runner=new Thread(){
        @Override
        public void run() {

            runThis();

        }
    };


    Thread watchdog=new Thread(){
        @Override
        public void run() {

            try {

                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                System.out.println("Stopping Execution ");
                runner.stop();
            }

        }
    };

    public void run()
    {
        watchdog.run();
        runner.run();
    }


    public static void main(String [] args)
    {

        new ThreadSafeExec(1){
            @Override
            public void runThis() {
                new SelectSort().sort();
            }
        };

    }



}
