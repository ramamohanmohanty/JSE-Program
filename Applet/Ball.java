import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Ball extends Applet implements Runnable, ActionListener {
    Thread t;
    Button b1,b2,b3,b4;
    TextField tf1,tf2;
    Label l1,l2;
    @Override
    public void init(){
        setBackground(Color.blue);
        l1 = new Label("No of Balls");
        l2 = new Label("Speed");
        tf1 = new TextField(6);
        tf2 = new TextField(6);
        
        b1 = new Button("life");
        b2 = new Button("Kill");
        b3 = new Button("Pause");
        b4 = new Button("Resume");
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        //ActionEvent is a class
        //public Object getSource()//it return base address of the button which is presess
        Button xx = (Button)ae.getSource();
        if((xx == b1 )&& (t ==null)){
            t = new Thread(this);
            t.start();
        }
        else if((xx == b2)&&(t!=null)){
       t.stop();
       t = null;     
        }
        else if((xx == b3)&& (t!=null)){
            t.suspend();
        }
        else if((xx == b4)&&(t!=null)){
            t.resume();
        }
    }
    @Override
    public void run(){
        while(true){
            repaint();
            try{
                Thread.sleep(Long.parseLong(tf1.getText()));
            }catch(InterruptedException ie){

            }
        }
    }
    @Override
    public void paint(Graphics g){
        for(int i=1; i<=(Integer.parseInt(tf1.getText())); i++);
        int r1 = (int)((Math.random()*1000%254));
        int g1 = (int)((Math.random()*1000%254));
        int b1 = (int)((Math.random()*1000%254));
        Color cc = new Color(r1,g1,b1);
        g.setColor(cc);
        int x1 = (int)((Math.random()*1000%230));
        int y1 = (int)((Math.random()*1000%230));
        g.fillOval(x1,y1,50,50);
    }
}
/*<applet code="Ball"width = 600
 * height = 600>
 * </applet>*/
