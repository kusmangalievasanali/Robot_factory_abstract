package robot_factory;

public class WheeledChassis implements Chassis {
    @Override
    public void move() {
        System.out.println("Wheeled Chassis: Rolling silently on wheels. Avoiding obstacles.");
    }
}