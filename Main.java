class Car1 {
    private String name;
    private int mileage;
    private int cost;

    public Car1(String name, int mileage, int cost) {
        this.name = name;
        this.mileage = mileage;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getMileage() {
        return mileage;
    }

    public int getCost() {
        return cost;
    }
}

public class Main {
    public static void main(String[] args) {
        Car1 car = new Car1("BMW", 15, 7000000);
        System.out.println("Car Name: " + car.getName());
        System.out.println("Mileage: " + car.getMileage() + " km/l");
        System.out.println("Cost: ₹" + car.getCost());
    }
}
