public class Consumer implements Runnable {
	Stock ss;
	Thread tt;
	Consumer(Stock ss){
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
		ss.getGoods((int)(Math.random()*1000));
		}
	}
public void kill() {
	tt.stop();
	tt = null;

	}
}