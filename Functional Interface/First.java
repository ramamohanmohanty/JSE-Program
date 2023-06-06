@FunctionalInterface
interface X {
	void showMessage(String s);
	private void call(){
		System.out.println("Hello Jtan's");
	}
	static void show(){
		System.out.println("I am a class method defined in SAM.");
	}
	default void display() {
		System.out.println("I am java Mentor.");
	}
}
public class First implements X {
	@Override
	public void showMessage(String message){
		System.out.println("Message is : "+message);
	}
	public static void main(String[] args) {
		First ff = new First();
		ff.showMessage("I like java Technocrat.");
		ff.display();
		X.show();
	}
}