package 참조타입;



public class RefType {
    public static void main(String[] args) {
        String nameVal1 = "장욱";
        String nameVal2 = "장욱";
        String nameVal3 = new String("장욱");

        if(nameVal1==nameVal2){
            System.out.println("nameVal1과 nameVal3가 참조가 같음");
        } else{
            System.out.println("nameVal1과 nameVal3가 참조가 다름");
        }
        if(nameVal1.equals(nameVal3)){
            System.out.println("nameVal1과 nameVal3가 내용이 같음");
        }
    }
}
