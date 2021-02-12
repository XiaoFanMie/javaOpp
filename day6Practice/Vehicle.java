package com.ff.javaoop.day6Practice;

    public abstract class Vehicle {
        private int power;
        private int numberOfPeople;
        private double ownWeight;

        public abstract void open();
        public abstract  void turn();
        public abstract  void close();

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

        public double getOwnWeight() {
            return ownWeight;
        }

        public void setOwnWeight(double ownWeight) {
            this.ownWeight = ownWeight;
        }
    }


