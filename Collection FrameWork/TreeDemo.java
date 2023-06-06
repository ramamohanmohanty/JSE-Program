import java.util.Iterator;
import java.util.TreeSet;
public class TreeDemo {
	public static void main(String args[]){
		TreeSet ts = new TreeSet();
		ts.add("Java");
		ts.add("Python");
		ts.add("Scala");
		ts.add("PHP");
		ts.add("Spring");
		System.out.println("\nSee the elements of  TreeSet object.\n");
		Iterator ii = ts.iterator();
		while(ii.hasNext()){
			String data = (String)ii.next();
			System.out.println(data);
			}
		}
	}