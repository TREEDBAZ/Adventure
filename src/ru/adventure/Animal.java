package ru.adventure;

/**
 * Created by TREED on 07.12.2015.
 */
public class Animal implements Creature {
    private int health = 50;
    private int mana = 2;
    private int x = 2;
    private int y = 2;

    public Animal(int x,int y){
        this.x = x;
        this.y = y;
        Field.getField()[x][y] = this;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public void makeTurn() {
        if (x < Field.getField().length) {
            x = x + 1;
            health -= 1;
        }
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }
}
