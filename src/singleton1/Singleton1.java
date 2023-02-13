package singleton1;

 class Singleton{
			
		   private static Singleton dbObject;

		   private Singleton() {      
		   }

		   public static Singleton getInstance() {

		      
		      if(dbObject == null) {
		         dbObject = new Singleton();
		      }
		       return dbObject;
		   }

		   public void getConnection() {
		       System.out.println("You are now connected to the database.");
		   }
		}

		class Main {
		   public static void main(String[] args) {
			   Singleton db1;

		      db1= Singleton.getInstance();
		      
		      db1.getConnection();
		   }
		
}
		


