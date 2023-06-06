class Ex1 extends Exception {
	}
class Ex2 extends Ex1 {
	}
class Ex3 extends Ex2 {
	}
public class Data2 {
	public static void main(String args[]){
	int a,b,c,d,e,f;
	    a=b=c=d=e=f = 0;
	try{
	int x = 1;
		try{
		switch(x){
			case 1 :
			throw new Ex1();
			case 2 :
			throw new Ex2();
			case 3 :
			throw new Ex3();
			}
		a++;

		}catch(Ex2 ee2){
		b++;
			}
		finally{
		c++;
			}
		}catch(Ex1 ee1) {
		d++;
			}
		catch(Exception ee){
		e++;
		}
		finally {
		f++;
		}
		System.out.println(a+"\t"+c+"\t"+d+"\t"+e+"\t"+f); 
   }
}
