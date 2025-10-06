package game.obstacles;

/*
CLASS: SandTrap
DESCRIPTION: Creates walls super class
*/

class Walls {

  private int length;
  private double x;
  private double y;
  private double theta;

    /**
     * Constructor for the Walls class
     * @param length Length of the wall
     * @param x X Coordinate of the wall
     * @param y Y Coordinate of the wall
     * @param theta Angle at which the walls placed
     */
  public Walls(int length, double x, double y, double theta) {
    this.length = length;
    this.x = x;
    this.y = y;
    this.theta = theta;
  }
}
