package demonstration;

public class Diffmethod_diffreturntype {
int m1()
{ 
 System.out.println("m1 method"); 

    return 20; 
} 
float m2() 
{ 
  System.out.println("m2 method"); 
    return 20.5f; 
} 
static char m3()
{ 
  System.out.println("m3 method"); 
   return 'd'; 
} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diffmethod_diffreturntype s=new Diffmethod_diffreturntype();
		 int x = s.m1(); 
		 System.out.println("Return value of m1()= " +x); 
		 float y = s.m2();
		    System.out.println("Return value of m2()= " +y); 
		    char ch = Diffmethod_diffreturntype.m3(); 
		    System.out.println("Return value of m3()= " +ch); 


	}

}
