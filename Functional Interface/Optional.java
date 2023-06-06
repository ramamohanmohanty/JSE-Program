import java.util.*;
public class Optional {
	static String s = null;
	public static void main(String args[]){
		while(true){
		Optional<String> op = new Optional.ofNullable(s);
		if(op.isPresent()){
			System.out.println("Length of the String is : "+s.length());
			System.out.println("Contents of string is : "+s);
			break;
				}else{
				Scanner sc = new  Scanner(System.in);
				System.out.println("Enter the String. ");
				s.sc.nextLine();
				}
			}
		}
	}