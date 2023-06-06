import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.net.*;

public class Demo1 extends Applet implements Runnable,ActionListener {
	Thread  t;
	Button b1,b2,b3,b4;
	int x,y;
	TextField t1,tf1;
	Label l;
	String s;
	public void init(){
	l = new Label("Enter Speed in ms");
	tf1 = new TextField(5);
	t1 = new TextField(20);
	b1 = new  Button("Start");
	b2 = new Button("Stop");
	b3 = new Button("Pause");
	b4 = new Button("Resume");
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);

	add(l);
	add(tf1);
	add(t1);
	add(b1);
	add(b2);
	add(b3);
	add(b4);
	
		}
public void actionPerformed(ActionEvent ae){
	if((ae.getSource()==b1)&&(t==null)){
	update(getGraphics());
	t=new Thread(this);
	t.start();

	}
	else if((ae.getSource()==b2)&&(t!=null)){
		t.stop();
		t=null;
		}
	else if((ae.getSource()==b3)&&(t!=null)){
		t.suspend();
		}
	else if ((ae.getSource()==b4)&&(t!=null)){
		t.resume();
		}
	}
public void run(){
	x=y=0;
	draw();

	} 
public void draw() {
	s=t1.getText();
	Graphics g = getGraphics();
	g.setFont(new Font("MonotypeCorsiva",Font.BOLD,50));
	for(int i=0 ; i< s.length(); i++){
	if(s.charAt(i)!=' '){
	try{
	getAudioClip(new URL(getCodeBase(),"sai.au")).play();
				}
			catch(Exception ee){}
	
				}

	g.setColor(new Color(((int)(Math.random()*1000))%254,((int)(Math.random()*1000))%254,((int)(Math.random()*1000))%	254));
	
	g.drawString(String.valueOf(s.charAt(i)),100+x,100+y);
	x+=25; 
     y+=25;
	
	try{Thread.sleep(Integer.parseInt(tf1.getText()));}
	catch(Exception e){
				}
			}
		}
	}
/*<applet code ="Demo1" width=400 height = 400>
</applet>*/
