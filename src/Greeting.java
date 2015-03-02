
import java.util.*;

public class Greeting {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		
		if(d.getHours()>6 && d.getHours()<12)
			System.out.println("good morning!");
		else if(d.getHours()>12 && d.getHours()<16)
			System.out.println("good afternoon!");
		else
			System.out.println("good evening!");

	}

}
