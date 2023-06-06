import java.util.*;
import java.util.function.*;
public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> pp = x -> (x>10);
        System.out.println("Result is : "+pp.test(15));
    }
}
