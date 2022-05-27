package ru.gb.java2.lesson1;

public class Human implements Action {
   private int maxDistance;
   private int maxHeight;

    public Human(int maxDistance, int maxHeight) {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void run() {
        System.out.println("Run!!!");
    }
    public void jump() {
        System.out.println("Jump!!!");
    }
}
