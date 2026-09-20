package robot_factory;

public class Main {

    public static void main(String[] args) {

        System.out.println("___PART A: Factory Method___");
        CoreCreator combatCoreCreator = new CombatCoreCreator();
        Core combatCore = combatCoreCreator.createCore();
        combatCore.process();

        CoreCreator domesticCoreCreator = new DomesticCoreCreator();
        Core domesticCore = domesticCoreCreator.createCore();
        domesticCore.process();


        System.out.println("\n___PART B: Abstract Factory___");
        System.out.println("--- Assembling Combat Robot ---");
        RobotFactory combatFactory = new CombatRobotFactory();
        RobotApplication combatApp = new RobotApplication(combatFactory);
        combatApp.testRobot();

        System.out.println("\n___Assembling Domestic Robot___");
        RobotFactory domesticFactory = new DomesticRobotFactory();
        RobotApplication domesticApp = new RobotApplication(domesticFactory);
        domesticApp.testRobot();
    }
}