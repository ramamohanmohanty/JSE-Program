import java.util.Scanner;
public class Text {
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Array Size.");
        int size = sc.nextInt();
        int marks[] = new int[size];
        for(int i=0; i<marks.length; i++){
            System.out.println("Enter your roll nummber");
            marks[i] = sc.nextInt();
            System.out.println("Ram roll number is : "+marks[i]);
            System.out.println("Rudra roll number is : "+marks[i]);
            
        }

    }
}