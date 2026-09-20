package robot_factory;

public class DomesticRobotFactory implements RobotFactory {
    @Override
    public Core createCore() {
        return new DomesticCore();
    }

    @Override
    public Chassis createChassis() {
        return new WheeledChassis();
    }
}