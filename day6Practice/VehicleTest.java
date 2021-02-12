package com.ff.javaoop.day6Practice;

public class VehicleTest {
    public static void main(String[] args) {
        /*Ship ship = new Ship();
        System.out.println(ship.numberOfPeople);
        System.out.println(ship.ownWeight);
        System.out.println(ship.power);
        ship.close();
        ship.open();
        ship.turn();*/

        Vehicle car = new Car();
        Vehicle plane = new Plane();
        Vehicle ship = new Ship();
        Vehicle train = new Train();

        car.setPower(120);
        car.setOwnWeight(100);
        car.setNumberOfPeople(7);

        plane.setPower(120);
        plane.setOwnWeight(100);
        plane.setNumberOfPeople(7);

        ship.setPower(120);
        ship.setOwnWeight(100);
        ship.setNumberOfPeople(7);

       train.setPower(120);
        train.setOwnWeight(100);
        train.setNumberOfPeople(7);

        VehicleTest vehicleTest = new VehicleTest();
        vehicleTest.Vehicle(car);
        vehicleTest.Vehicle(plane);
        vehicleTest.Vehicle(ship);
        vehicleTest.Vehicle(train);

    }

        public void Vehicle(Vehicle vehicle ){
            if(vehicle instanceof  Car){
                Car car = (Car)vehicle;
                car.open();
                car.turn();
                car.close();
                System.out.println("汽车的功率为："+car.getPower());
                System.out.println("汽车的自重为："+car.getOwnWeight());
                System.out.println("汽车的载人数为："+car.getNumberOfPeople());
                System.out.println();
            }
            if(vehicle instanceof  Plane){
                Plane plane =(Plane)vehicle;
                plane.open();
                plane.turn();
                plane.close();
                System.out.println("飞机的功率为："+plane.getPower());
                System.out.println("飞机的自重为："+plane.getOwnWeight());
                System.out.println("飞机的载人数为："+plane.getNumberOfPeople());
                System.out.println();
            }

            if(vehicle instanceof  Ship){
                Ship ship =(Ship)vehicle;
                ship.open();
                ship.turn();
                ship.close();
                System.out.println("轮船的功率为："+ship.getPower());
                System.out.println("轮船的自重为："+ship.getOwnWeight());
                System.out.println("轮船的载人数为："+ship.getNumberOfPeople());
                System.out.println();
            }

            if(vehicle instanceof  Train){
                Train train =(Train)vehicle;
                train.open();
                train.turn();
                train.close();
                System.out.println("火车的功率为："+train.getPower());
                System.out.println("火车的自重为："+train.getOwnWeight());
                System.out.println("火车的载人数为："+train.getNumberOfPeople());
                System.out.println();
            }
        }
    }

