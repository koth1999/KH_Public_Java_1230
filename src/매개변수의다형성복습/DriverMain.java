package 매개변수의다형성복습;

import java.util.Scanner;

// 상속관계를 이용해 매개변수에 자식 타입의 객체를 사용 하는 것
public class DriverMain {
    public static void main(String[] args) {
        Driver driver = new Driver("남행선");
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        SportsCar sportsCar = new SportsCar();
        Scanner sc = new Scanner(System.in);
        System.out.print("운전하고 싶은 차를 선택 하세요 [1]버스, [2]택시, [3]스포츠카 : ");
        int sel = sc.nextInt();
        switch(sel){
            case 1 : driver.drive(bus); break;
            case 2 : driver.drive(taxi); break;
            case 3 : driver.drive(sportsCar); break;
        }
    }
}

class Vehicle {
    public void run(){
        System.out.println("차량이 달립니다.");
    }
}

class Bus extends Vehicle{
    @Override
    public void run(){
        System.out.println("버스가 달립니다.");
    }
}

class Taxi extends Vehicle{
    @Override
    public void run(){
        System.out.println("택시가 달립니다.");
    }
}

class SportsCar extends Vehicle{
    @Override
    public void run(){
        System.out.println("스포츠카가 달립니다.");
    }
}

class Driver {
    String name;
    public Driver(String name){
        this.name = name;
    }
//    public void drive(Vehicle vehicle){
//        System.out.print(name+"의 ");
//        vehicle.run();
//    }
    public void drive(Bus bus){

    }
    public void drive(Taxi taxi){

    }
    public void drive(SportsCar sportsCar){

    }
}