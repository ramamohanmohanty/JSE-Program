import java.util.function.*;
import java.util.*;
public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> x = a -> System.out.println(a);
        x.accept(10);
        Consumer<List<Integer>> modify = list -> {
                for(int i=0;i<list.size(); i++){
                    list.set(i, 2*list.get(i));
                    System.out.println("Value is : "+list.get(i));
                }
        };
        List<Integer> al = new ArrayList<Integer>();
        al.add(5);
        al.add(12);
        al.add(9);
        al.add(7);
        al.add(11);
        al.add(6);
        modify.accept(al);
    }
}
