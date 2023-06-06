public class InsertionSort {
    public static void PrintArraySort(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("\t");
    }
    public static void main(String args[]){
        int arr[] = {7,8,3,1,2};

        //Insertion sort
        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;          
        
            while(j >= 0 && temp < arr[j]){
            arr[j+1] = arr[j];
            j--;
            }
        
            //placement
            arr[j+1] = temp;
        }
        PrintArraySort(arr);
    }
}
