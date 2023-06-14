package first;



class Car {
    private String make;
    private String model;
    private int year;

    // Default constructor
    public Car() {
        make = "Unknown";
        model = "Unknown";
        year = 0;
    }

    // Parameterized constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.displayDetails();

        System.out.println();

        Car car2 = new Car("Toyota", "Camry", 2022);
        car2.displayDetails();
    }
}
