import java.util.*;
public class IteratorDemo{
	public static void main(String args[]){
	ArrayList aa = new ArrayList();
	aa.add("java");
	aa.add("Python");
	aa.add("PHP");
	aa.add("Java");
	aa.add("Spring Boot");
	aa.add("Hibernate");
	aa.add("Angular");
	aa.add("React JS");
	Iterator ii = aa.iterator();
	while(ii.hasNext()) {
	String data = (String)ii.next();
	System.out.println(data);
	ii.remove();
			}
	System.out.println("Size of ArrayList object is : "+aa.size());
		}
}