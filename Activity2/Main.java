package Activity2;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 2023, 4);
        Vehicle truck = new Truck("Ford", "F-150", 2023, 2000);

        car.drive(); // Output : "Driving car..."
        truck.drive(); // Output : "Driving truck..."
    }
}
