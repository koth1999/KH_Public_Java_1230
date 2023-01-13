package 매개변수의다형성;

public class Driver {
    String name; // 운전자 이름

    public Driver(String name) {
        this.name = name;
    }
    // 운전
    public void drive(Vehicle vehicle){
        System.out.print(name + "의 ");
        vehicle.run();

    }
}
