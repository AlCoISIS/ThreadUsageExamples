// Improved Application Performance
// Threads can significantly enhance the performance of an application by utilizing multiple CPU cores effectively. 
// By executing tasks in parallel, threads can reduce the overall processing time.

// In this example, two threads process an array in parallel, potentially reducing the overall processing time compared 
// to a single-threaded approach.

import java.util.Arrays;

public class ParallelProcessingExample {
    public static void main(String[] args) {
        int[] data = new int[1000000];
        Arrays.fill(data, 1);

        Thread t1 = new Thread(() -> {
            long sum = 0;
            for (int i = 0; i < data.length / 2; i++) {
                sum += data[i];
            }
            System.out.println("Sum of first half: " + sum);
        });

        Thread t2 = new Thread(() -> {
            long sum = 0;
            for (int i = data.length / 2; i < data.length; i++) {
                sum += data[i];
            }
            System.out.println("Sum of second half: " + sum);
        });

        t1.start();
        t2.start();
    }
}