import java.awt.*;
import java.applet.Applet;
public class Smile extends Applet{
    public Smile(){
        //Applet container call non parameterized or default constructer of Applet class
        System.out.println("Applet object is constructed.");
        //in an applet class constructor class only
    }
    @Override
    public void init() {
        setBackground(Color.yellow);
        System.out.println("Applet object is initialize.");
        //This method call only once in the life cycle of Applet
    }
    @Override
    public void start(){
        System.out.println("Applet object is started.");
        //it is call multiple times.
    }
    @Override
    public void stop(){
        System.out.println("Applet object is paused.");
        //it is call multiple time.
    }
    @Override
    public void destroy(){
        System.out.println("Applet object is finalized.");
        //it is called only once
    }
    //Component class having a method
    //public void paint(Graphics g)
    //After start the method is called by applet container if I overide this method of 
    //component then applet container implisitly call it to draw Graphics in Applet
    @Override
    public void paint(Graphics kk){
        kk.setColor(Color.red);
        Font ff = new Font("Verdana",Font.BOLD,30);
        kk.setFont(ff);
        kk.drawString("I Love Java Technocrat",40,30);
        Font ff1 = new Font("Kokila",Font.BOLD,40);
        kk.setFont(ff1);
        String s1 = "\u091c" + "\u093e" + "\u092d" + "\u093e";
        kk.drawString(s1,500,40);
        kk.setColor(Color.black);
        kk.drawOval(60,60,200,200); //circle // head
        kk.fillOval(90,120,50,20);
        kk.fillOval(190,120,50,20);
        kk.drawLine(165,125,165,175);
        kk.drawLine(165,175,150,160);
        kk.drawArc(110,130,95,95,0,-100);

    }
}
/*67<applet code="Smile" width=500 height=500>
 </applet 
 */