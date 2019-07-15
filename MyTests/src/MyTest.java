import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

public class MyTest {

	public static void main(String[] args) {
		
		Ball b1 = new Ball (30, 10, 10, 230);
		
		System.out.println (b1.toString());
		
		b1.moveUp(10);
		System.out.println (b1.toString());
		
		
		
	}


	
	
}

