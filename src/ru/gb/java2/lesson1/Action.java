package ru.gb.java2.lesson1;

public interface Action {
    int maxDistance =0;
    int maxHeight=0;

     void run();
    void jump();
    int getMaxHeight();
    int getMaxDistance();

}

