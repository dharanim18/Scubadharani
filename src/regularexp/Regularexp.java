package regularexp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regularexp {
	
		  public static void main(String[] args) {
		    Pattern pattern = Pattern.compile("Dharani", Pattern.CASE_INSENSITIVE);
		    Matcher matcher = pattern.matcher("dharani Mahadevan");
		    boolean matchFound = matcher.find();
		    if(matchFound) {
		      System.out.println("Match found");
		    } else {
		      System.out.println("Match not found");
		    }
		  }
		

	}


