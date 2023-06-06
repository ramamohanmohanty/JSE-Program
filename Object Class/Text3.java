public class Text3 {
    int data;
    Text3(int data){
        this.data = data;
    }
    @Override
    public int hashCode(){
        return data;
    }
    @Override
    public boolean equals(Object obj){
        if(this.hashCode() == obj.hashCode()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Text3 t1 = new  Text3(109);
        Text3 t2 = new Text3(109);
        System.out.println(t1.hashCode()+"\t"+t2.hashCode());
        if(t1.equals(t2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
