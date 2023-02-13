package multilevelinheritance;



public class Multilevelinheritance 
{
	void call2(){System.out.println("calling...");
	}  
}  
class inherit extends Multilevelinheritance
{  
void call3()
{
	System.out.println("calling1...");
} 
class s extends inherit
{
	void call4(){System.out.println("calling2...");
}
}  
class TestInheritance1{  
public static void main(String args[]){ 
inherit  e=new inherit();
s t=e.new s();	
t.call4();
e.call3();
e.call2();
}  
}}

	 
	
