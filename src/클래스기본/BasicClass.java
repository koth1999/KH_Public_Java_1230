package 클래스기본;

// 클래스 이름은 대문자로 시작하는 것이 관례
public class BasicClass {
    public static void main(String[] args) {
       Car g80=new Car("g80");
       System.out.println(g80.carName);



       Car santafe = new Car("싼타페");
       System.out.println(santafe.carName);
       System.out.println(Car.Manufacturer);
    }
}
// 필드 : 클래스에 포함된 변수를 의미한다
// 클래스 변수
// 인스턴스 변수
// 지역 변수
class Car{
    static String Manufacturer = "현대자동차"; // 클래스 변수
    String carName; // 인스턴스 변수

    Car(String name){

        carName=name;
    }
    void carInfo(){

        int testVal = 10; // 지역변수
    }
}
