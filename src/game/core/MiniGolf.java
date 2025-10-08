package game.core;
/*
CLASS: MiniGolf
DESCRIPTION: Extending Game, MiniGolf is all in the paint method.
NOTE: This class is the metaphorical "main method" of your program,
      it is your control center.

*/
import game.geometry.*;
import game.geometry.Point;

import java.awt.*;
import java.awt.event.*;

public class MiniGolf extends Game {
	private Rect testRect;
	static int counter = 0;

  public MiniGolf() {
    super("MiniGolf!",800,600);
    this.setFocusable(true);
	this.requestFocus();
	
	testRect = new Rect(new Point(0, 0), 500, 20);
  }
  
	public void paint(Graphics brush) {
		brush.setColor(Color.black);
	      brush.fillRect(0, 0, width, height);
	      // Get the points from the rectangle
	      Point[] points = testRect.getPoints();
	      int[] xPoints = new int[points.length];
	      int[] yPoints = new int[points.length];

	      for (int i = 0; i < points.length; i++) {
	          xPoints[i] = (int) points[i].x;
	          yPoints[i] = (int) points[i].y;
	      }
	      brush.setColor(Color.WHITE);
	      brush.fillPolygon(xPoints, yPoints, points.length);
  }
  
	public static void main (String[] args) {
   		MiniGolf a = new MiniGolf();
		a.repaint();
  }
}