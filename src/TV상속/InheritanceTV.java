package TV상속;

public class InheritanceTV {
    public static void main(String[] args) {
        ProductTV lgTV = new ProductTV("우리집 TV");
        lgTV.setPower(true);
        lgTV.setVolume(50);
        lgTV.setChannel(1500, true);
        lgTV.viewTV();
    }
}
