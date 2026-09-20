package robot_factory;

public class CombatRobotFactory implements RobotFactory {
    @Override
    public Core createCore() {
        return new CombatCore();
    }

    @Override
    public Chassis createChassis() {
        return new TrackedChassis();
    }
}