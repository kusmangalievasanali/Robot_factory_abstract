package robot_factory;

public class CombatCoreCreator extends CoreCreator {

    @Override
    public Core createCore() {
        return new CombatCore();
    }
}