package innerclass;

public class Innerclass1 {
	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Innerclass1 ob=new Innerclass1();  
		ob.display();  
		}


	}


