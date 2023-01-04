package 변수의사용범위;
// 변수의 생존 범위는 { }의 범위에 따른다.
public class VarScope {
    public static void main(String[] args) {
        int value=10; // 지역 변수
        //int tmp=0;
        if(value==10){
           int tmp=20;
            tmp=tmp+value;
            System.out.println(tmp);
        }


    }
}
