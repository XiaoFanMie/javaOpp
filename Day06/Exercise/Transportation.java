package com.ff.javaopp.Day06.Exercise;

public abstract class Transportation {
    private int power;
    private int numberOfPeople;
    private int weight;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

   abstract void start();
    abstract void turnTo();
    abstract  void close();
}
