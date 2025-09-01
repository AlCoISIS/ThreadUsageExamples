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