@FunctionalInterface
interface A {
	public String sayMessage();
	}
public class Demo1 {
	public static void main(String args[]){
	A aa = () -> {return"Welcome to Jt.";};
	System.out.println("Message is : "+aa.sayMessage());
		}
	}