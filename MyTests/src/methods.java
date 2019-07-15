import java.util.Scanner;

public class methods {

	public static char userinput () {
		System.out.println ("please enter data"); 
		Scanner user = new Scanner (System.in);
		String userin = user.nextLine ();
		char c = userin.charAt(0);	
		return c;
	}
	
	public static String code () {	
		char userin =  userinput ();	
		String gradedic = "";
		
		if (userin == 'A') {
			gradedic = "A is considered the a very good grade";
			//System.out.println ("the code is True");
		} 
		else if 
		(userin == 'B') {
			gradedic = "B is considered the a  good grade ";
		}
		else if
		(userin == 'C') {
			gradedic = "C is considered the an acceptable grade ";
		} else 
		
		gradedic = "wrong entery";
		System.out.println (gradedic);
		
		return "S";	
	}
	
}
