public class BubbleSort {
    public static void main(String args[]){
        int arr[] = {9,6,4,3,6,0};
        BubbleSort(arr);
    }
    private static void BubbleSort(int arr[]) {
        //BubbleSort
        for(int i=0; i<arr.length-1; i++){
            for(int j=0;i<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i : arr){
            System.out.println( i +"\t");
        }
    }
}