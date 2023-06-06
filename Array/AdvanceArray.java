import java.util.Scanner;
public class AdvanceArray {                                   //2D Array
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int colums = sc.nextInt();

        int numbers[][] = new int [rows][colums];

        for(int i=0; i<rows; i++){
            for(int j=0; j<colums; j++){
                numbers[i][j]= sc.nextInt();
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<colums; j++){
                System.out.println(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
} 