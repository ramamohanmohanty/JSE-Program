import java.util.Iterator;
import java.util.Comparator;
import java.util.TreeSet;
class MyComparator  implements Comparator {
	@Override
	public int compare(Object obj1,Object obj2){
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		if((s1.compareTo(s2)) < 0 ) {
			return 1;
			
			}
			else if((s1.compareTo(s2)) > 0 ) {
				return -1;
			}else{									//set interface
			return 0;
			}
		}
	}
public class TreeDemo1 {
	public static void main(String args[]){
		TreeSet ts = new TreeSet(new MyComparator());
			ts.add("java");
			ts.add("Python");
			ts.add("Scala");
			ts.add("PHP");
			ts.add("Spring");
		System.out.println("\nSee the elements of TreeSet object.\n");
			Iterator ii = ts.iterator();
			while(ii.hasNext()){
				String data = (String)ii.next();
				System.out.println(data);
			}
		}
	}