package game.geometry;

/*
CLASS: Rectangle
DESCRIPTION: represents rectangular boundaries and collision boxes for
             obstacles and level boundaries
*/

public class Rect extends Polygon {
	public Rect(Point p, int len, int height) {
		super(new Point[] {
			new Point(0, 0),
			new Point(len, 0),
			new Point(len, height),
			new Point(0, height)
		}, p, 0);
	}
	
}