package hierarchicalin;

public class Hierarchical {
		void call5()
		{System.out.println("calling...");
		}  
	}  
	class inherit5 extends Hierarchical
	{  
	void call6()
	{
		System.out.println("calling1...");
	} }
	class ma extends Hierarchical
	{
		void call7()
		{
			System.out.println("calling2...");
	}
	}  
	class TestInheritance2{  
	public static void main(String args[]){ 
		ma r=new ma();
	inherit5 g= new inherit5();
	r.call7();
	g.call6();
	r.call5();
	}  
	}


