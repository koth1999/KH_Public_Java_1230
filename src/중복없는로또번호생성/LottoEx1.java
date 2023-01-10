package 중복없는로또번호생성;
// 중복없는 로또 번호 생성 하기
// 1. 6개의 로또 번호 생성해서 출력하기(배열 사용)
// 2. 중복없는 로또 번호 생성 후 출력
// 3. ArrayList 사용해서 출력 (중복 없음)
// 4. Set을 이용해서 로또 번호 출력 (중복 없음)
import java.util.Arrays;
public class LottoEx1 {
    public static void main(String[] args) {
        int [] lotto = new int[6];
        int tmp, index=0;
        boolean isExist = false; // 로또배열에 지금 생성한 값과 동일한 값이 있는지 확인

        while(true){
            tmp=(int)((Math.random()*45)+1);

            for(int i=0; i<lotto.length; i++){
                if(lotto[i]==tmp) isExist=true;
            }
            if(isExist==false) lotto[index++]=tmp; // 해당 인덱스에 값을 반영하고 증가시킴
            if(index==6) break;
            isExist=false;
        }

     System.out.println(Arrays.toString(lotto));
    }

}
