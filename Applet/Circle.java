import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Circle extends Applet implements Runnable,ActionListener{
	Thread t;
	Button b1,b2,b3,b4;
	TextField tf1,tf2;
	level l1,l2;

	public void init(){
	l1 = new Label("Enter Speed in ms ");
	tf1 = new TextField(5);
	l2 = new Label("Diameter");
	tf2 = new TextField(5);

	b1 = new Button("Start");
	b2 = new Button("Stop");
	b3 = new Button("pause");
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

public void actionPerformed(ActionEvent ae){
	if((ae.getSource()==b1)&& (t==null)){
	t=new Thread(this);
	t.start();
	}
	else if((ae.getSource()==b2)&&(t!=null)){
	t.stop();
	}
	else if((ae.getSource()==b3)&&(t!=null)){
	t.suspend();
	}
	else if((ae.getSource()==b4)&&(t!=null)){
	t.resume();
	}
	
}
public void run(){ 
	whille(true){
	try{
	repaint();
	Thread.sleep(Integer.parseInt(tf1.getText()));
	}
	catch(Exception e){
		}
	}
}
public void paint(Graphics g){
	g.setColor(new Color(((int)(Math.random()*1000))%254,((int)(Math.random()*1000))%254,((int)(Math.random()*1000))%254));
	g.fillOver(400,300,Integer.parseInt(tf2.getText()));
	}
}
/*<applet code="circle" width=800
height=800>
</applet>*/