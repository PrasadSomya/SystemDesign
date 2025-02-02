package StructuralDesignPattern.FlyweightDesignPattern.GamingApp;

public class Main {
    public static void main(String[] args) {

        IRobot humanRobot1 = new HumanRobotic("Human", "Human Form");
        humanRobot1.coordinates(0,1);

        IRobot humanRobot2 = new HumanRobotic("Human", "Human Form");
        humanRobot2.coordinates(0,4);

        IRobot vechileRobot1 = new HumanRobotic("Vehicle", "Vehicle Form");
        vechileRobot1.coordinates(0,1);

        IRobot vechileRobot2 = new HumanRobotic("Vehicle", "Vehicle Form");
        vechileRobot2.coordinates(0,2);
    }
}
