package 진수표현;

// 진법 표현 : 2진법, 8진법, 10진법, 16진법(0~9, a,b,c,d,e,f)
public class DecType {
    public static void main(String[] args) {
       int var1=0b1010; // 2진수
       int var2=0206; // 8진수
       int var3=365; // 10진수
       int var4=0xBA; // 16진수
        System.out.println("var1 : "+var1);
        System.out.println("var2 : "+var2);
        System.out.println("var3 : "+var3);
        System.out.println("var4 : "+var4);

    }
}
