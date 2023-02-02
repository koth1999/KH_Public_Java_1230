package x보다작은수2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LessX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int N = sc.nextInt();
        int X = sc.nextInt();
        for(int i=0; i<N; i++){
            list.add(sc.nextInt());
            if(list.get(i)<X) System.out.print(list.get(i)+" ");
        }
    }
}
