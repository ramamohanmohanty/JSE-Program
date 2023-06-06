public class RemoveDuplicatesOfArray {
    public static void main(String args[]){
        int arr[] = {8,6,8,5,3,0,7,2,4,1};

        RemoveDuplicatesOfArray(arr);
    }

    public static void RemoveDuplicatesOfArray(int arr[]){

        for(int i=0; i<arr.length-1; i++){
            //check
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[j] = -1;
                }
            }
        }
        for(int i : arr){
            if(i != -1){
                System.out.println(i +"\t");
            }
        }
    }
}