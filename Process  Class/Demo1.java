public class Demo1 {
    public static void main(String args[]){
        System.out.println("OS name is : "+System.getProperty("os.name"));
        System.out.println("OS Version is : "+System.getProperty("os.version"));
        System.out.println("User name : "+System.getProperty("user.name"));
        System.out.println("Current working directory is : "+System.getProperty("user.dir"));
        System.out.println("JDK version : "+System.getProperty("java.version"));
        System.out.println("JVM version is :"+System.getProperty("java.vm.version"));
        System.out.println("Program Line Separator is : "+System.getProperty("path.separator"));
        System.out.println(0);  //process  is terminated
        System.out.println("Hello");
    }
}
