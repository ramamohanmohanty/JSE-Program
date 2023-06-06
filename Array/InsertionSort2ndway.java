public class InsertionSort2ndway {
    public static void main(String args[]){
        int arr[] = {8,5,7,3,5,9,2,0,4,1};

        InsertionSort2ndway(arr);
    }
    public static void InsertionSort2ndway(int arr[]){

        //outer loop for one one  element traverse
        for(int i=1; i<arr.length; i++){
            int temp = arr[i];

            for(int j=i-1; j>=0; i--){

                if(temp < arr[j]){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
                arr[j+1] = temp;
            }
        }
        for(int i : arr){
            System.out.println( i + "\t");
        }
    }
}
