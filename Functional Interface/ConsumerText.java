import java.util.function.*;
import java.util.*;
public class ConsumerText {
    public static void main(String[] args) {
        Consumer<List<Integer>> modify = list -> {
                for(int i=0;i<list.size(); i++){
                    list.set(i, 3*list.get(i));
                }
        };
        Consumer<List<Integer>> dis = list -> list.stream().forEach(a -> System.out.println(a));
        List<Integer> al = new ArrayList<Integer>();
        al.add(5);
        al.add(6);
        al.add(3);
        al.add(7);
        al.add(4);
        al.add(6);
        modify.andThen(dis).accept(al);
    }
}
