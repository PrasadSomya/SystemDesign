package StructuralDesignPattern.FlyweightDesignPattern.GamingApp;

public class VechileRobotic implements IRobot{
    private String type;
    private String character;

    public VechileRobotic(String type, String character) {
        this.type = type;
        this.character = character;
    }

    public String getType() {
        return type;
    }

    public String getCharacter() {
        return character;
    }

    @Override
    public void coordinates(int x, int y) {
        System.out.println("put on the coordinates x :" + x + " and Y : "+ y);
    }
}
