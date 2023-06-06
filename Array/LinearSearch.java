import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the element of the array");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the elemet youwant to search");
        int target = sc.nextInt();
        System.out.println(linearSearch(arr,target));
    }
    private static boolean linearSearch(int arr[], int target){
        for(int i=0;i<arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
