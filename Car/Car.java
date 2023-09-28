public class Car {

    private int currentGear;
    private int currentRpms;
    private int x;

    public int calculateSpeed() {
        return x = currentRpms * currentGear;
    }

    public static void main(String[] args) {
        Car car = new Car(); // Create an instance of the Car class
        car.currentGear = 12; // Set the currentGear for the car object
        car.currentRpms = 2;  // Set the currentRpms for the car object

        int speed = car.calculateSpeed(); // Calculate the speed

        System.out.println("The speed is " + speed); // Print the speed
    }
}
