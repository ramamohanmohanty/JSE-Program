import java.util.*;
import java.util.stream.*;

public class StreamMapDemo1 {
	public static void main(String args[]) {
	List<Integer> num = Arrays.asList(5,3,9,6,7,8,2);
	List<Integer> square = num.stream().map(x -> (x*x)).collect(Collectors.toList());
	System.out.println(square);
}
	}