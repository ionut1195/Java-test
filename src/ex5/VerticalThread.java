package ex5;

public class VerticalThread extends Thread {
    @Override
    public void run() {
        String[] movements = {"forward...", "backward..."};
        for (int i = 0; i < 10; i++) { // Simulate 10 random movements
            int index = (int) (Math.random() * movements.length); // Randomly pick forward or backward
            System.out.println(movements[index]);
            try {
                Thread.sleep(500); // Pause for 500ms to simulate movement
            } catch (InterruptedException e) {
                System.out.println("VerticalThread interrupted");
            }
        }
    }
}
