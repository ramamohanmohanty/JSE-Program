public class Data1 {
	static void call()throws Exception {
		if(true){
			throw new Error();
			} else {
			 throw new Exception();
				}
		}
public static void main(String args[]){
		try{
		call();
		}catch(Error ee){
			System.out.println("Hello");
		}
		catch(Exception ee1){
			System.out.println("Hi");
		}
	}
}