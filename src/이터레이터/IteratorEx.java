package 이터레이터;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Iterator<E> 인터페이스 : 컬렉션 프레임워크에 저장된 요소를 읽어오는 방법을 Iterator로 표준화 함
// public interface Collection<E> extends Iterable<E> {}
// public interface List<E> extends Collection<E> {}
// public interface Set<E> extends Collection<E> {}
// boolean hasNext() : 다음의 요소가 있는지 확인, 있으면 true
// E next() : 요소를 반환
// remove() : next()로 읽어온 요소를 삭제
public class IteratorEx {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            if(iterator.next()==4) iterator.remove();
        }
        for(int e : list) System.out.print(e+" ");
    }
}
