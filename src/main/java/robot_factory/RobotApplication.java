package robot_factory;

public class RobotApplication {
    private final Core core;
    private final Chassis chassis;

    public RobotApplication(RobotFactory factory) {
        if (factory == null) {
            throw new IllegalArgumentException("RobotFactory cannot be null. Please provide a valid factory.");
        }
        this.core = factory.createCore();
        this.chassis = factory.createChassis();
    }

    public void testRobot() {
        core.process();
        chassis.move();
    }
}