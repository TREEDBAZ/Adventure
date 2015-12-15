package ru.adventure;


/**
 * Created by TREED on 20.11.2015.
 */
public class Field {
    private static Creature[][] field;

    public static void makeField(int fieldLength, int fieldHeight){
        field = new Creature[fieldLength][fieldHeight];
    }

    public static Creature[][] getField() {
        if (field == null)
            field = new Creature[50][50]; // TODO:throw exception instead of creature new field

        return field;
    }


}
