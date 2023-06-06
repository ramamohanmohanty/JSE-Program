import java.io.*;										//serialization
public class Stud implements Serializable {
		 public String name;
		 public int roll;								
		 public double fee;
		 public void setData(String name,int roll,double fee){
			this.name = name;
			this.roll = roll;
			this.fee = fee;
			}
		public Stud(){
			System.out.println("Stud object is constructed");
		}
	}