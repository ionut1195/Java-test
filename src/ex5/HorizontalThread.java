package ex5;

public class HorizontalThread extends Thread {
    @Override
    public void run() {
        String[] movements = {"left...", "right..."};
        for (int i = 0; i < 10; i++) {
            int index = (int) (Math.random() * movements.length); // randomly pick left or right
            System.out.println(movements[index]);
            try {
                Thread.sleep(500); // pause for 500ms to simulate movement
            } catch (InterruptedException e) {
                System.out.println("HorizontalThread interrupted");
            }
        }
    }
}

