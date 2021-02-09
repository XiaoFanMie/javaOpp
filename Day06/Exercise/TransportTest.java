package com.ff.javaopp.Day06.Exercise;

public class TransportTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.setPower(100);
        car.setNumberOfPeople(12);
        car.setWeight(1000);
        System.out.println("汽车信息:功率:"+car.getPower()+"匹\t核载："+car.getNumberOfPeople()+"人\t"+"自重："+car.getWeight()+"kg");

        Plane plane = new Plane();
        car.setPower(10000);
        car.setNumberOfPeople(100);
        car.setWeight(100000);
        System.out.println("飞机信息:功率:"+car.getPower()+"匹\t核载："+car.getNumberOfPeople()+"人\t"+"自重："+car.getWeight()+"kg");

        Ship ship =new Ship();
        car.setPower(100000);
        car.setNumberOfPeople(5000);
        car.setWeight(100000);
        System.out.println("轮船信息:功率:"+car.getPower()+"匹\t核载："+car.getNumberOfPeople()+"人\t"+"自重："+car.getWeight()+"kg");

        Train train = new Train();
        car.setPower(100000);
        car.setNumberOfPeople(12000);
        car.setWeight(100000);
        System.out.println("火车信息:功率:"+car.getPower()+"匹\t核载："+car.getNumberOfPeople()+"人\t"+"自重："+car.getWeight()+"kg");

        TransportTest test =new TransportTest();
        test.starTransport(car);
        test.starTransport(plane);
        test.starTransport(ship);
        test.starTransport(train);
    }
    public void starTransport(Transportation transportation){
        if (transportation instanceof Car){
            Car car = (Car)transportation;
            car.WuLing();
        }
        if (transportation instanceof Plane){
            Plane plane = (Plane)transportation;
            plane.f20();
        }
        if (transportation instanceof Ship){
            Ship ship = (Ship)transportation;
            ship.pearl();
        }
        if (transportation instanceof Train){
            Train train = (Train)transportation;
            train.subWay();
        }
        transportation.setNumberOfPeople(12);
        transportation.start();
        transportation.turnTo();
        transportation.close();

    }
}
