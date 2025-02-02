package StructuralDesignPattern.FlyweightDesignPattern.TextEditor;

public class Main {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        // Creating flyweights for characters
        Character a = factory.getCharacter('A');
        Character b = factory.getCharacter('B');
        Character c = factory.getCharacter('C');

        // Displaying characters with font styles
        a.display("Arial");
        b.display("Times New Roman");
        c.display("Courier New");

        // Reusing the same 'A' object
        Character anotherA = factory.getCharacter('A');
        anotherA.display("Helvetica");
    }
}
