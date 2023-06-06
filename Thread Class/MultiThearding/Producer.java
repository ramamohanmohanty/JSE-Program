public class Producer implements Runnable {
	Stock ss;
	Thread tt;
	Producer(Stock ss){
		this.ss = ss;
		tt = new Thread(this);
		tt.start();
		}
@Override
public void run() {
	while(true){
		try{
		Thread.sleep(1000);
		}catch(InterruptedException ie) {
			}
		ss.addGoods((int)(Math.random()*1000));
		}
	}
public void kill() {
	tt.stop();
	tt = null;

	}
}