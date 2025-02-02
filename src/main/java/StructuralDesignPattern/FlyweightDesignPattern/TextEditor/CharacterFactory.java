package StructuralDesignPattern.FlyweightDesignPattern.TextEditor;

import java.util.HashMap;
import java.util.Map;


public class CharacterFactory {
    private Map<java.lang.Character, Character> characterObjectCache = new HashMap<>();

    public Character getCharacter(char symbol){
        Character character = characterObjectCache.get(symbol); // serach in cache first
        if (character == null) { // if its Null then create a new object
            character = new CharacterImp(symbol);
            characterObjectCache.put(symbol, character);
        }
        return character;
    }

}
