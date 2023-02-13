package interface1;


	interface Scuba{  
		void get();  
		}  
		 
		class deep implements Scuba{  
		public void get(){System.out.println("get deep");}  
		}  
		class dive implements Scuba{  
		public void get(){System.out.println("deep dive");}  
		}  
		  
		class TestInterface1{  
		public static void main(String args[]){  
		Scuba t=new deep();
		Scuba w=new dive();
		t.get(); 
		w.get();
		}}  


