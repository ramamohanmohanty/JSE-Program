import java.util.*;
import java.util.function.*;
public class FunctionDemo {
    public static void main(String[] args) {
        Function<String,Integer> f = x -> x.length();
        Integer size = f.apply("I love Java Technocrat.");
        System.out.println("Size of "+size);
    }
}
