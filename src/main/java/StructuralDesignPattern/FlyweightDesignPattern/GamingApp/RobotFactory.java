package StructuralDesignPattern.FlyweightDesignPattern.GamingApp;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {

    //Create a cache
    private static Map<String, IRobot> robotObjectCache = new HashMap<>();

    //Create a new object
    //Check if its not exisit in the cache
    public static IRobot createRobot(String robotType) {
        if (robotObjectCache.containsKey(robotType)) {
            return robotObjectCache.get(robotType);
        } else {
            if (robotType == "Human") {
                String character = "Human Form";
                IRobot humanObject = new HumanRobotic(robotType, character);
                robotObjectCache.put(robotType, humanObject);
                return humanObject;
            } else if (robotType == "Vehicle") {
                String character = "Vehicle Form";
                IRobot vehicleObject = new VechileRobotic(robotType, character);
                robotObjectCache.put(robotType, vehicleObject);
                return vehicleObject;
            }
        }

        return null;
    }
}
