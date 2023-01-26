package 제네릭예제3;

public class Powder extends Material{
    @Override
    public void doPrinting(){
        System.out.println("Powder 재료로 출력 합니다.");
    }
    public String toString(){
        return "재료는 Powder 입니다.";
    }
}
