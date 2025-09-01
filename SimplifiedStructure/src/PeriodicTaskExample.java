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