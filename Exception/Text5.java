public class Text5 {
    public static void main(String[] args) {
        try{
            System.out.println(100/args.length);
            System.out.println("I am in outer try block.");
            try{
                System.out.println(args[1]);
                System.out.println("I am in the nested try block.");
            }catch(StringIndexOutOfBoundsException se){
                System.out.println("Caight");
            }
        }catch(RuntimeException re){
            re.printStackTrace();
        }
    }
}
