import javax.swing.*;

public class ResponsiveUIExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Responsive UI Example");
        JButton button = new JButton("Start Task");

        button.addActionListener(e -> {
            Thread taskThread = new Thread(() -> {
                try {
                    Thread.sleep(5000); // Simulate a long-running task
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                System.out.println("Task completed!");
            });
            taskThread.start();
        });

        frame.add(button);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}