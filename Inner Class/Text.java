public abstract class Text {

	public Text(){
		System.out.println("Object of abstract class");
		}
	void call(){
		System.out.println("I like java");
	}
	int data;

	public abstract void setData(int data);
	public abstract int getData();

public static void main(String args[]){
	Text tt = new Text(){
			@Override
			public void setData(int d) {
				data = d;
			}
			@Override
			public int getData(){
			return data;
			}
	};
	tt.call();
	tt.setData(109);
System.out.println("Data value is : "+tt.getData());
	}
}
	
	