package 추상클래스응용;

public class AbstractApply {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Galaxy S23");
        smartPhone.setPower(true);
        smartPhone.call();
        smartPhone.internet();

        Phone phone = new SmartPhone("Common SmartPhone");
        phone.setPower(true);
        phone.call();

    }
}
