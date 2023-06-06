import java.util.Scanner;
public class PalindromeNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String. ");
        String x = sc.nextLine();
        StringBuffer sb = new StringBuffer(x);
        sb.reverse();
        String y = sb.toString();
        if(x.equals(y)) {
            System.out.println(x +" is a palindrome Number. ");
        }else{
            System.out.println(x +" not a palindrome Number. ");

        }
    }
}