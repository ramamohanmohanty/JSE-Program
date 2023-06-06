enum Color {
    RED,GREEN,BLUE,PINK,YELLOW;                 //1st logic 
}
public class Demo{
    public static void main(String args[]){
        Color cc[]= Color.values();
        System.out.println("\nSee the enum element. \n") ;
        for(Color aa : cc){
            System.out.println(aa);
        }
    }
}