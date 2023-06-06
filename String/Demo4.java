public class Demo4 {
    public static void main(String[] args) {
        String s1 = "this a demo of java program";
        int size = s1.length();//31
        System.out.println("Size of sting is :"+size);
        char ch  = s1.charAt(s1.indexOf('j'));//j
        //indexOf('j'); job is search the index positon of j
        //charAt() metthod paramrter is index position of j
        System.out.println("Extracted char is :"+ch);//j
        int start = s1.indexOf('j');//18
        int end = s1.length();//31
        char cc[] = new char[end - start]; // array size is 13
        s1.getChars(start,end,cc,0);
        System.out.println(cc);// java program
        String s2 = new String("java");
        String s3 = "java";
        if(s2 == s3){   //address  //false
                System.out.println("Equals.");
        }else{
            System.out.println("Not Equals.");
        }
        if(s2.equals(s3)){      //contents  //true
            System.out.println("Equals.");
    }else{
        System.out.println("Not Equals.");
    }
    String s4 = "JAVA";
    if(s3 == s4){       //false   //address
        System.out.println("Equals");
    }else{
        System.out.println("Not Equals");
    }
    if(s3.equals(s4)){  //contents by matching case sensitiveness   //false
        System.out.println("equals");
    }else{
        System.out.println("Not Equals.");
    }
    if(s3.equalsIgnoreCase(s4)){       //contents by matching case sensitiveness   //false
        System.out.println("Equals.");
    }else{
        System.out.println("Not equals");
    }
    String s5 = "ABCDEFH";
    byte bb[] =s5.getBytes();
    System.out.println("\nsee the array element");
    for(int i=0; i<bb.length; i++){
        System.out.println(bb[i]+"\t");
    }
    System.out.println("\n");
    char in[] = s5.toCharArray();
    System.out.println("\nSee the array element.\n");
    for(int i=0; i<in.length; i++){
            System.out.println(in[i]+"\t");
    }
    System.out.println("\n");
    String s6 ="I love java Technocrat";
    System.out.println("\nsee the array element.\n");
    String str[] = s6.split(" ");
    for(int i=0; i<str.length;i++){
        System.out.println(str[i]+"\t");

    }
    System.out.println("Contants of String object is : "+s6);// it implicitly call s1.toString();
    String s7 = "I am mentor of java technocrat";
    String s8 = s6.concat(s7);
    System.out.println(s6);
    System.out.println(s8);

    String s9 = "  java  ";
    String s10 = s9.trim();
    System.out.println("Size of s9 is : "+s9.length());
    System.out.println("Size of s10 is : "+s10.length());

    String s11 = s10.replace('a', 'k');
    System.out.println(s10 + "\t" +s11);

    String s12 = s1.toUpperCase();
    System.out.println(s12);

    String s13  = s12.toLowerCase();
    System.out.println(s13);
    if((s13.startsWith("this"))&&(s13.endsWith("program."))){
        System.out.println("i like java.");
    }else{
        System.out.println("i hate java.");
    }
    }
}
