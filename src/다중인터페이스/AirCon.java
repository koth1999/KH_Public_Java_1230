package 다중인터페이스;

public interface AirCon {
    int MAX_TEMP = 30; // public final static 숨겨져 있다
    int MIN_TEMP = 0;
    void airConON(); // 자동으로 public abstract가 추가 됨
    void airConOFF();
    void setAirConTemp(int tmp);
}
