package Activity2;

public class Truck extends Vehicle {
    private int payloadCapacity;

    public Truck(String make, String model, int year, int payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void drive() {
        System.out.println("Driving truck...");
    }

    public int getPayloadCapacity() {
        return payloadCapacity;
    }
}
