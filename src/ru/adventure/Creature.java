package ru.adventure;

/**
 * Created by TREED on 20.11.2015.
 */
public interface Creature {

    int getHealth();
    int getMana();
    void makeTurn();
    int getX();
    int getY();
}
