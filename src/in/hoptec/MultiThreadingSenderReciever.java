package in.hoptec;

import java.util.Random;
import java.util.UUID;

public class MultiThreadingSenderReciever {


    public static void main(String[] args) {

        Node good = new Node();

        Thread producer = new Thread("producer") {
            @Override
            public void run() {


                while (true) {
                    try {

                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (good) {
                        good.setVal(UUID.randomUUID().hashCode());
                        System.out.println("\n\nProducer produced " + good.getVal());

                        good.notify();

                    }

                    synchronized (good) {
                        try {
                            good.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }

                }
            }
        };

        Thread consumer = new Thread("consumer") {
            @Override
            public void run() {


                while (true) {

                    synchronized (good) {
                        try {
                            good.wait();

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Consumer consuming " + good.getVal());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Consumer consumed " + good.getVal());


                    synchronized (good) {
                        good.notify();

                    }

                }
            }
        };

        producer.start();
        consumer.start();

    }
}
