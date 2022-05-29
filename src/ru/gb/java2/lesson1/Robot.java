package ru.gb.java2.lesson1;

public class Robot implements Action{
    private int maxDistance;
    private int maxHeight;

    public Robot(int maxDistance, int maxHeight) {
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
        System.out.println("robot Run!!!");
    }
    public void jump() {
        System.out.println("robot Jump!!!");
    }
}
