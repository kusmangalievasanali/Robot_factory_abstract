package robot_factory;

public interface RobotFactory {
    Core createCore();
    Chassis createChassis();
}