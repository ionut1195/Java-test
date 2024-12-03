package ex6;

public class CarThread extends Thread { // Corrected: Implementing Thread requires extending it, not implementing as an interface.
    final String brand;
    final String model;
    final double price;

    // fixed constructor to accept both brand and model
    public CarThread(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.price = 0; // initialize price as default since it's not passed
    }

    @Override
    public void run() { // overriding run() is essential because it defined what the thread will actually do
        // without it, the thread will execute an empty run() method from the Thread superclass
        while (true) {
            try {
                System.out.println("Hello, my name is " + this.brand); // fixed string interpolation
                Thread.sleep(300); // Fixed: Add try-catch to handle InterruptedException
            } catch (InterruptedException e) {
                System.out.println(this.brand + " thread interrupted.");
                break; // Exit the loop if interrupted
            }
        }
    }

    public static void main(String[] args) {
        CarThread audiThread = new CarThread("Audi", "A4"); // fixed constructor call not passing the required model parameter
        CarThread bmwThread = new CarThread("BMW", "X5"); // fixed constructor call not passing the required model parameter

        audiThread.start(); // Use start() instead of run() to run threads concurrently
        bmwThread.start();

        System.out.println("CarThreads are running...");
    }
}