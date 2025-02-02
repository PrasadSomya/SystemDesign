package StructuralDesignPattern.FlyweightDesignPattern.TextEditor;

public class CharacterImp implements  Character{
    private char alphabet;

    public CharacterImp(char alphabet) {
        this.alphabet = alphabet;
    }

    public char getAlphabet() {
        return alphabet;
    }

    @Override
    public void display(String fontStyle) {
        System.out.println("CHaracter :" + alphabet +"with fontStyle :"+ fontStyle);
    }
}
