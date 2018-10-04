import java.util.Scanner;
public class MainTutGe {

	public static void main(String[] args) {
	
	D d = new D();
	d.g();


	
	

	}

}
class D {
	void g() {
		
	Scanner s = new Scanner (System.in);
	System.out.println("Input");
	int i = s.nextInt();
	D1 d = new D1();
	try {d.g1(i);}
	//catch(Exception e){
		//System.err.println("f");
	//	}
	

	catch(Throwable t){
		System.err.println("Aurora!");
	}
	
	}
}
class D1{
	void g1(int i) throws Exception {
		if (i <= 0) {
			throw new Exception ();
		}
	}
}


abstract class J{
	public abstract int v();
	
}




