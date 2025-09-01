// Threads can optimize the utilization of system resources by running multiple operations concurrently, 
// especially on multi-core processors.

// This example demonstrates a simple multi-threaded server where each client request is handled in a separate thread, 
// allowing the server to handle multiple requests concurrently.

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadedServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Server started on port 8080");

        while (true) {
            Socket clientSocket = serverSocket.accept();
            Thread clientHandler = new Thread(() -> handleClient(clientSocket));
            clientHandler.start();
        }
    }

    private static void handleClient(Socket clientSocket) {
        try {
            // Handle client request
            System.out.println("Handling client: " + clientSocket.getInetAddress());
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}