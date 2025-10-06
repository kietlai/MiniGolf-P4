package game.obstacles;

/*
CLASS: Windmill
DESCRIPTION: rotating obstacles that can deflect or block the ball
             depending on their current position in the rotation cycle
*/

class Windmill extends Walls{
    public Windmill(int length, double x, double y, double theta) {
        super(length, x, y, theta);
    }
}