public class SecondlargestNo {
    public static void main(String args[]){
        int temp,size;
        int arr[] = {45,75,23,78,12,96};
        size = arr.length;
    
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(" Second Largest No is : "+arr[size-2]);
    }
}
