public class SmallestNumber {
    public static void main(String[] args) {
        int arr[] = {4,56,3,56,2,12,30};
        int minNumber = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]<minNumber){
                minNumber = arr[i];
            }
        }
        System.out.println("The Smallest Number is : "+ minNumber);

    }
}
