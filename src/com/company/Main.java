package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(totalDistance());
    }

    public static double totalDistance() {
        double stairHeight = 0.2;
        double length = 0.4;
        double towerHeight = 100;
        double steps = towerHeight / stairHeight * (stairHeight + length);
        return steps;
    }
}
