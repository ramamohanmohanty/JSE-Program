import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Demo {
	static ArrayList al = new ArrayList();
	static BufferedReader br = null;
	public static void main(String args[]){
		try{
		br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			System.out.println("Check the option.");
			System.out.println("1>Insert an element.");
			System.out.println("2>Retrive the element.");
			System.out.println("3>Remove an element.");
			System.out.println("4>Quit");
			System.out.println("Enter your choice.");
			int ch = Integer.parseInt(br.readLine());

			switch(ch){
				case 1 :
					insertData();
					break;
				case 2 :
					retriveData();
					break;
				case 3 :
					removeData();
					break;
				case 4 :
					System.out.println("Thank you for using my application.");
					System.exit(0);
				default :
					System.out.println("Invalid option.");
				}
			}
		}catch(Exception ee){
			}
	}
static void insertData()throws IOException {
	System.out.println("Enter the element to insert.");
	String data = br.readLine();
	al.add(data);
	}
static void retriveData(){
	int size = al.size();
	for( int i = 0; i<size; i++){
		String name = (String)al.get(i);
		System.out.println(name);
		}
	}
static void removeData()throws IOException {
	System.out.println("Enter the name whom u removed.");
	String name = br.readLine();
	for(int i = 0; i<al.size(); i++){
		String ss = (String)al.get(i);
		if(ss.equals(name)){
			al.remove(ss);
		System.out.println("Element is removed.");
			}
		}
		
	}
}