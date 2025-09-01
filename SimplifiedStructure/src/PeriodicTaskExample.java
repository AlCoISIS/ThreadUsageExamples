// Using threads can simplify the design of programs that need to perform multiple tasks concurrently, such as performing 
// periodic tasks, handling asynchronous events, or managing multiple simultaneous operations.

// In this example, a periodic task is executed in a separate thread, simplifying the main program’s structure by 
// offloading the task management to the thread.

public class PeriodicTaskExample {
    public static void main(String[] args) {
        Runnable periodicTask = () -> {
            while (true) {
                try {
                    System.out.println("Periodic task execution");
                    Thread.sleep(2000); // Execute task every 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread taskThread = new Thread(periodicTask);
        taskThread.start();
    }
}