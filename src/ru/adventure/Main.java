package ru.adventure;

/**
 * Created by TREED on 20.11.2015.
 */
public class Main {

    public static void main(String[] args){
        int fieldLength = 100, fieldHeight = 30;
        Field.makeField(fieldLength,fieldHeight);
        Animal cat = new Animal(0,0);
        while (cat.getHealth() > 0) {
            System.out.println(String.format("cat on (%d, %d) and health is %d", cat.getX(),
                    cat.getY(), cat.getHealth()));
            cat.makeTurn();
        }
    }
}
