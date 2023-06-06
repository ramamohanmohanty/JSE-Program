import java.util.Scanner;
@FunctionalInterface

interface Cube {
	public void cube();
	}
public class CubeDemo {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		Cube cc = () -> {System.out.println("Cube of : "+num+" is : "+ (num*num*num));};
		cc.cube();
		}
	}