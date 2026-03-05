class LifeCycleThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class ThreadLifeCycleDemo {
    public static void main(String[] args) throws InterruptedException {

        LifeCycleThread t = new LifeCycleThread();

        System.out.println("State after creation: " + t.getState());

        t.start();
        System.out.println("State after start: " + t.getState());

        t.join();
        System.out.println("State after completion: " + t.getState());
    }
}
