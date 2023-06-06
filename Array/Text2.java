import java.util.Scanner;
public class Text2 {                                //linear search
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array.");
        int size = sc.nextInt();
        int number[] = new int[size];
        for(int i = 0;i<number.length;i++){
            number[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for(int i = 0; i<number.length; i++){
            if(number[i] == x){
                System.out.println("x is found of index is : "+i);
            }          
        }
    }
}
