package scuba2;

public class singleinheritance {
	
		 void call(){System.out.println("calling...");}  
			}  
			class inherit extends singleinheritance{  
			void call1(){System.out.println("calling1...");}  
			}  
			class TestInheritance{  
			public static void main(String args[]){  
			inherit d=new inherit();  
			d.call();  
			d.call1();  
			}  
	}


