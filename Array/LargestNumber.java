public class LargestNumber{
    public static void main(String[] args) {
        int arr[] = {4,56,12,43,6,7,68};

        int temp = arr[0];
        //check the largest number
        for(int i=0; i<arr.length; i++){
            if(arr[i]>temp){
                temp = arr[i];
            }
        }
        System.out.println("The Largest Number is : "+ temp);
    }
}