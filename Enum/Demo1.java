enum Color {
    RED,GREEN,BLUE
}
public class Demo1 {
    Color cc;
    Demo1(Color cc){
        this.cc = cc;
    }
        void display(){
            switch(cc) {
                case RED :
                    System.out.println("I love this Color. ");
                        break;
                        case GREEN :
                            System.out.println("I Motivated by this Color. ");
                                break;
                                case BLUE :
                                    System.out.println("Symbal od champ. ");
                                        break;
                                    default :
                                        System.out.println("I don't like this Color. ");
                                            break;

            }
        }
    public static void main(String args[]){
        Demo1 dd = new Demo1(Color.GREEN);
        dd.display();
    } 
}
