import java.util.*;
public class VectorDemo{
	public static void main(String args[]){
		Vector v = new Vector();
		System.out.println("Size : "+v.size()+" Capacity : "+v.capacity());
		v.add("Java");
		v.add("Servlet");
		v.add("JSP");
		v.add("JSF");
		v.add("Java Mail");
		v.add("JMS");
		v.add("RMI");
		v.add("EJB");
		System.out.println("Size : "+v.size()+" Capacity : "+v.capacity());
		ArrayList aa = new ArrayList();
		aa.add("Spring");
		aa.add("Spring Core");
		aa.add("Spring MVC");
		aa.add("Spring JPA");
		v.addAll(aa);
		System.out.println("Size : "+v.size()+" Capasity : "+v.capacity());
		System.out.println("\nSee the elements of Vector Object. \n");
		
		for(int i=0; i<v.size(); i++){
			String data = (String) v.get(i);
		System.out.println(data);
			}
		}
	}