import java.util.*;
public class ThreadSafe {
	public static void main(String args[])throws Exception {
	ArrayList<Integer> al = new ArrayList<Integer>();
	Thread t1 = new Thread(new Runnable() {
		@Override
		public void run() {
			for(int i=1; i<=10; i++ ){				//ArrayList
				try{
				al.add(i);
				Thread.sleep(10);
				}catch(InterruptedException ie){
					}
				}
			}
		});
	Thread t2 = new Thread(new Runnable() {
		@Override
		public void run() {
			for(int i=1; i<=10; i++ ){
				try{
				al.add(i);
				Thread.sleep(10);
				}catch(InterruptedException ie){
					}
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(a1);
	}
}
