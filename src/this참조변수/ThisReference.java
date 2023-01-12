package this참조변수;
// this : this 참조변수는 자기 자신의 객체를 참조하는 변수, 숨겨진 참조 변수
// this() : 클래스 내부에서는 기본적으로 여러개의 생성자를 만들 수 있다(생성자 오버로딩)
// 생성자 오버로딩 시 중복된 코드가 많이 발생하며 이를 개선하기 위해서 this() 메소드를 사용
// this() 메소드는 생성자 내부에서만 사용가능하며, 생성자 내부에서 다른 생성자를 호출 하는 기능
public class ThisReference {
    public static void main(String[] args) {
        Car santafe = new Car("Santafe", 2020, "White", 210 );
        santafe.viewCar();
        Car kona = new Car();
        kona.viewCar();
    }
}


class Car{
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    public Car(String modelName, int modelYear, String color, int maxSpeed){
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public Car(){
        this("G80", 2022, "white", 200);
    }
    public Car(String name){
        this(name, 2022, "white", 200);

    }

    void viewCar(){
        System.out.println("이름 : "+modelName);
        System.out.println("연식 : "+modelYear);
        System.out.println("색상 : "+color);
        System.out.println("최대속도 : "+maxSpeed);
    }
}