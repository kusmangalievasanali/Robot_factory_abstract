package robot_factory;

public class Main {

    public static void main(String[] args) {
        System.out.println("--- Assembling Combat Robot ---");
        RobotFactory combatFactory = new CombatRobotFactory();
        RobotApplication combatApp = new RobotApplication(combatFactory);
        combatApp.testRobot();

        System.out.println("\n--- Assembling Domestic Robot ---");
        RobotFactory domesticFactory = new DomesticRobotFactory();
        RobotApplication domesticApp = new RobotApplication(domesticFactory);
        domesticApp.testRobot();
    }
}