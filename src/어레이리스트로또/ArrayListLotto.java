package 어레이리스트로또;
// ArrayList 활용해 중복제거
// Set 활용




import java.util.HashSet;


public class ArrayListLotto {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(); // 어레이리스트는 배열과 다르게 크기를 지정할 필요없다

        while(true){
            int tmp = (int)((Math.random()*45)+1);

            set.add(tmp);
            if(set.size()==6) break;
        }
        System.out.println(set);

    }
}
