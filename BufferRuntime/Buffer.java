public class Buffer{
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("I Java");
        StringBuffer ss = sb.insert(2,"Like");
        System.out.println(ss +"\t"+ sb);
        if(ss == sb){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        sb.deleteCharAt(0);
        System.out.println(ss);
        sb.delete(0,6);
        System.out.println(ss);
        sb.reverse();
        System.out.println(ss);
        StringBuffer ss1 = new StringBuffer();
        System.out.println("Size is : "+ss1.length()+"\tCapacity  : "+ss1.capacity());
        ss.setLength(100);
        System.out.println(sb.length());
        ss.ensureCapacity(10000);
        System.out.println("sbb.capasity");
        StringBuffer a1 = new StringBuffer("Java");
        StringBuffer a2 = new StringBuffer("Technocrat");
        a1.append(a2);
        System.out.println(a1);
    }
}