import java.util.Random;
import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.JApplet;

public class Lines extends Applet
{ 
	public void paint(Graphics g)
	{
		//Set integer names, number of lines and ovals generated and random number generator for the set of integers
		int x1,y1,x2,y2;
		Color c;
		Random random;
		final int LINES = 98;
		final int OVAL = 100;
		int red,green,blue;
		random = new Random ( );
			
		//Code that will draw lines
		//Lines drawn Will vary in size, color and position
	
			for (int i = 0; i < LINES; i++) {
				red = random.nextInt(255);
				blue = random.nextInt(255);
				green = random.nextInt(255);
				c = new Color(red, green, blue);
				x1 = random.nextInt(1024);
				y1 = random.nextInt(768);
				x2 = random.nextInt(1024);
				y2 = random.nextInt(768);
				g.drawLine(x1,y1,x2,y2);
				g.setColor(c);
			}
		

		//Code that will draw ovals
		//Ovals drawn will vary in size, color and position
			for (int i = 0; i < OVAL; i++) {
				red = random.nextInt(255);
				blue = random.nextInt(255);
				green = random.nextInt(255);
				c = new Color(red, green, blue);
				x1 = random.nextInt(1024);
				y1 = random.nextInt(768);
				x2 = random.nextInt(1024);
				y2 = random.nextInt(768);
				g.drawOval(x1,y1,x2,y2);
				g.setColor(c);		
			}
		
	}
}