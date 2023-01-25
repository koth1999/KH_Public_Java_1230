package 로또번호만들기응용;
// 7자리의 로또 번호 만들기
// 첫번째 부터 여섯번째 숫자는 0과 50사이의 랜덤값
// 마지막 보너스 숫자는 50 ~ 100사이의 임의의 숫자
// 배열을 사용해서 값을 구하고 출력하기, 단 중복은 허용 함
import java.util.Arrays;
public class LottoApplyEx {
    public static void main(String[] args) {
        int[] lotto = new int[7];

        for(int i=0; i<6; i++){
            lotto[i]=(int)(Math.random()*51);

        }
        lotto[6]=(int)(Math.random()*51)+50;
        for(int e : lotto) System.out.print(e+" ");
    }
}
