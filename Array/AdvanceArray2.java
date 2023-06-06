import java.util.Scanner;
public class AdvanceArray2 {                        //Q.no -  Take a matrix as input from the user.Search
    public static void main(String args[]) {        //for a given number X and print the index?
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        //Array Declaration
        int num[][] = new int[r][c];

        //inner loops
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                num[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt(); 

        //outer loops
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(num[i][j] == x){
                    System.out.println("X found it location (" + i + " " + j + ")");
                }else{
                    System.out.println("X is not found in any number.");
                }
            }
        }
    }
}
