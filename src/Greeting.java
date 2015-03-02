
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Greeting {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String name=" ";
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name:");
		name=b.readLine();
		
		Date d = new Date();
		
		if(d.getHours()>6 && d.getHours()<12)
			System.out.println("good morning "+name+"!");
		else if(d.getHours()>12 && d.getHours()<16)
			System.out.println("good afternoon "+name+"!");
		else
			System.out.println("good evening "+name+"!");

	}

}
