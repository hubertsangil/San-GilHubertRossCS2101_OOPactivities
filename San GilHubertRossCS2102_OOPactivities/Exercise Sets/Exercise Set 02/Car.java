public class Car {
    private String color;
    private double price;
    private char size;


    // Constructor
    public Car(String color, double price, char size) {
        this.color = color;
        this.price = price;
        this.size = Character.toUpperCase(size);
    }

    // Methods

    // Getter Methods
    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public char getSize() {
        return size;
    }

    // Setter Methods

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(char size) {
        this.size = Character.toUpperCase(size);
    }

    // toString() Method

    public String toString() {
        String sizeDescriptor = "";

        switch (size) {
            case 'S':
                sizeDescriptor = "small";
                break;
            case 'M':
                sizeDescriptor = "medium";
                break;
            case 'L':
                sizeDescriptor = "large";
                break;
        }

        return "Car (" + color + ") - P" + String.format("%.2f", price) + " - " + sizeDescriptor;

    }
}

