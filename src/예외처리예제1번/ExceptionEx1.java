package 예외처리예제1번;
// 자바는 어떻게 할 수 없는 에러와 대응가능한 예외로 나누어 진다.
// 대응가능한 예외는 예외처리 구문을 통해 해결 할 수 있다.
// 예외 이전에 프로그램에서 조건문 등을 통해 발생할 수 있는 문제는 사전에 차단해야된다.
// ArrayIndexOutOfBoundException : 할당되지 않은 배열의 인덱스를 접근할 때 발생하는 exception
public class ExceptionEx1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try{
            for(int i=0; i<=5; i++){ // 배열의 범위 초과
                arr[i]=i;
                System.out.println(arr[i]);
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("예외처리를 합니다.");
        }
        System.out.println("프로그램 정상 종료");
    }
}
