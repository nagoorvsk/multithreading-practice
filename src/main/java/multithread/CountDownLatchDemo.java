package multithread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch countDownLatch = new CountDownLatch(2);

        Runnable runnable1 = new SubThread(countDownLatch,"A");
        Runnable runnable2 = new SubThread(countDownLatch,"B");

        Thread threadOne = new Thread(runnable1);
        Thread threadTwo = new Thread(runnable2);

        threadOne.start();
        threadTwo.start();

        countDownLatch.await();

        Runnable runnable = new MainThread();
        Thread threadMatser = new Thread(runnable);
        threadMatser.start();
    }
}

class MainThread implements Runnable{


    @Override
    public void run() {

        System.out.println("Master Thread started");

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

class SubThread implements Runnable{

    private final CountDownLatch countDownLatch;

    @Override
    public void run() {
        System.out.println("Worker" + Thread.currentThread().getName() + " started");

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Worker" + Thread.currentThread().getName() + " finished");
        countDownLatch.countDown();
    }

    public SubThread(CountDownLatch countDown, String name) {
        super();
        this.countDownLatch = countDown;
    }
}
