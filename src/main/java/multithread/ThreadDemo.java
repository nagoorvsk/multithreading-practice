package multithread;

public class ThreadDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is invoked");
    }

    public static void main(String[] args){

        Runnable myRunnable = new ThreadDemo();
        Thread threadOne = new Thread(myRunnable);
        threadOne.start();

        System.out.println("Invoked from main thread");
    }
}
