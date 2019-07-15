import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;

public class Ball {

	
	
	int diameter;
	int xcoordCentre;
	int ycoordCentre;
	int color;
	public Ball(int user_diamter, int user_xcoordCentre, int user_ycoordCentre, int user_color) {
		
		diameter = user_diamter;
		xcoordCentre = user_xcoordCentre;
		ycoordCentre = user_ycoordCentre;
		color = user_color;
		
	}
	

	void moveUp (int amount) {
		ycoordCentre -=amount;
	}
	
	void moveDown (int amount) {
		ycoordCentre += amount;
	}
	
	void draw (Graphics canvas) {
		
		int xcoord = xcoordCentre - diameter/2;
		int ycoord = ycoordCentre - diameter/2;
		canvas.drawOval(xcoord, ycoord, diameter, diameter);
	}
	
	public String toString () {
		return "Location: (" + xcoordCentre + ", " + ycoordCentre + "). Size: " + diameter;
		
		
	}
	
}
