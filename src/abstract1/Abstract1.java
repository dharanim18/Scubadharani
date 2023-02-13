package abstract1;

abstract class Abstract1 {	    
			abstract int get();    
			}    
			class grocery extends Abstract1
			{    
			int get(){return 550;}    
			}    
			class fruit extends Abstract1
			{    
			int get(){return 603;}    
			}     
			class TestShop
			{    
			public static void main(String args[])
			{    
				Abstract1 c;  
			c=new grocery();  
			System.out.println("The amount is: "+c.get());    
			c=new fruit();  
			System.out.println("The amount is: "+c.get());    
			}   

	}


