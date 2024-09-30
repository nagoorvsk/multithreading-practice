package multithread;

// We are going to implement the same Thread demo example with Java 8 features...
public class ThreadDemoJ8{

    public static void main(String[] args) throws InterruptedException {

        // Implementation for thread one...
        Runnable runnableOne = () -> {
            System.out.println("Thread One got invoked");
        };

        // Implementation for thread two...
        Runnable runnableTwo = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread two got invoked");
            }
        };

        Thread threadOne = new Thread(runnableOne);
        Thread threadTwo = new Thread(runnableTwo);

        threadOne.start();
        threadTwo.start();

        threadOne.join();
        threadTwo.join();

        System.out.println("Main thread got invoked");
    }
}
