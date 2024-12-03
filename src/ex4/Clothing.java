package ex4;

public class Clothing extends Product {
    private int size;
    private String material;

    public Clothing(String name, String desc, double price, int size, String material) {
        //  since Clothing class inherits from Product, we need to provide the arguments
        //  required by the superclass constructor
        super(name, desc, price);

        this.size = size;
        this.material = material;
    }

    // override toString() method to include new attributes
    @Override
    public String toString() {
        return super.toString() + " _ Size: " + size + " _ Material: " + material;
    }
}
