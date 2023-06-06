 
public class SelectionSort {
    public static void main(String rags[]){
        int arr[] = {5, 8, 4, 2, 1};

         SelectionSort(arr);
    }

    private static void SelectionSort(int[] arr) {
        for(int i=0; i<arr.length - 1; i++){
           int minPos = i;
            //find out the smallest element
           for(int j=i+1; j<arr.length; j++){              
                if(arr[minPos] > arr[j]){ 
                    minPos = j;               
                }
           }
           //swaping the Number
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
        //Sorted the Array
        for(int i : arr){
            System.out.println(i +"\t");
        }
        
    }
    
}
