package game.geometry;

/*
CLASS: Rectangle
DESCRIPTION: represents rectangular boundaries and collision boxes for
             obstacles and level boundaries
*/

public class Rect extends Polygon {
	public Rect(Point p, int len, int height) {
		super(new Point[] {
			new Point(p.getX(), p.getY()),
			new Point(len, p.getY()),
			new Point(len, height),
			new Point(p.getX(), height)
		}, p, 0);
	}
	
}