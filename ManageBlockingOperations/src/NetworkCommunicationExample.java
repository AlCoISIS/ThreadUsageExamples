// Threads are essential for managing blocking operations such as I/O tasks, network communication, 
// and waiting for external events without freezing the entire application.

// In this example, network communication is handled in a separate thread, preventing the main thread from being 
// blocked and allowing the application to remain responsive.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkCommunicationExample {
    public static void main(String[] args) {
        Thread networkThread = new Thread(() -> {
            try {
                URL url = new URL("https://www.example.com");
                BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    System.out.println(inputLine);
                }
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        networkThread.start();
        System.out.println("Main thread continues running...");
    }
}