public class Stock {
	int goods;
	public synchronized void addGoods(int x) {
		goods +=x;
		System.out.println("Added goods are : "+x);
		System.out.println("Total goods are : "+goods);
		notify();
		}
	public synchronized int getGoods(int x) {
		while(true) {
			if(goods >=x){
				goods -= x;
					System.out.println("Deducted goods are : "+x);
					System.out.println("Total goods are : "+goods);
					break;

					}else {
					System.out.println("!!!!Insifficient Goods.!!!");

					try{
					wait();
					}catch(Exception ee) {
					
					}
				}
			}
			return goods;
			}
			public static void main(String args[]) {
			Stock ss = new Stock();
			Producer p1 = new Producer(ss);
			Consumer c1 = new Consumer(ss);
			try{
			Thread.sleep(20000);
			}catch(InterruptedException ie){
				}
			p1.kill();
			c1.kill();
		}
	}