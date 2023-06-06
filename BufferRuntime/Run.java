public class Run {
public static void main(String args[]){
    Runtime r1 = Runtime.getRuntime();
    Runtime r2 = Runtime.getRuntime();
    if(r1 == r2){
        System.out.println("It is singletone class. ");
    }else{
        System.out.println("It is not a Singletone class. ");
    }
    int arr[] = new int[10000];
    for(int i=0; i<arr.length; i++){
        int x = 1;
        arr[i] = x;
        x++;
    }
    System.out.println(r1.freeMemory());
    System.out.println(r1.totalMemory());
    r1.exit(0);//noraml termination process 
    System.out.println("hello");
    }
}
