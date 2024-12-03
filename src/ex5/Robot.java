package ex5;
public class Robot {
    public void start() {
        // create and start both threads
        HorizontalThread horizontalThread = new HorizontalThread();
        VerticalThread verticalThread = new VerticalThread();

        horizontalThread.start();
        verticalThread.start();

        try {
            // Wait for both threads to finish
            horizontalThread.join();
            verticalThread.join();
        } catch (InterruptedException e) {
            System.out.println("Robot threads interrupted");
        }

        System.out.println("Robot has completed its movements.");
    }

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.start();
    }
}
