package robot_factory;

public class DomesticCoreCreator extends CoreCreator {

    @Override
    public Core createCore() {
        return new DomesticCore();
    }
}