import java.util.*;
public class IteratorDemo1{
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
	ListIterator ii = aa.listIterator(); //before the first element
	System.out.println("\nSee the elements in forward direction.\n");
	
	while(ii.hasNext()) {
		String data = (String)ii.next();
		System.out.println(data);
	}

	ii.add("JPA"); //add the element in the List
	System.out.println("\nSee the elements of List object in backword direction.\n");
	while(ii.hasPrevious()){
		String x = (String) ii.previous();
		System.out.println(x);
		}
	}

}