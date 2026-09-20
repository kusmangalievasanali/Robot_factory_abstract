package robot_factory;

public class TrackedChassis implements Chassis {
    @Override
    public void move() {
        System.out.println("Tracked Chassis: Moving on caterpillar tracks. All-terrain mode active.");
    }
}