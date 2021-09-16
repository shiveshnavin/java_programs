package in.hoptec;

public  abstract class MultiThreadingDeadlock {

    static Node node1 = new Node();
    static Node node2 = new Node();

    public static void main(String[] args) {

        Thread m1 = new Thread("t1"){
            @Override
            public void run() {

                synchronized (node2){

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (node1){
                        System.out.println("ex "+getName());
                    }
                }

            }
        };
        Thread m2 = new Thread("t2"){
            @Override
            public void run() {

                synchronized (node1){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (node2){
                        System.out.println("ex "+getName());
                    }
                }

            }
        };
        m1.start();
        m2.start();

        Thread wd = new Thread(() -> {

            try {
                Thread.sleep(3000);
                m1.stop();
                m2.start();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        wd.start();

    }

}
