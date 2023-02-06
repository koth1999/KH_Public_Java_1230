package 람다예제3번;
// 리턴값이 있는 람다식 : MyFuncInterface fi = (x,y) -> x < y ? x : y;
@FunctionalInterface
interface MyFuncInterface {
    public int min(int x, int y); // 메소드가 한개만 존재해야함
}

public class LambdaEx3 {
    public static void main(String[] args) {
        MyFuncInterface fi = (x, y) -> x < y ? x : y; // 중괄호가 없어야됨(?)
        System.out.println(fi.min(3,4));
    }
}
