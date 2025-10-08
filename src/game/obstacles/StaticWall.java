package game.obstacles;

/*
CLASS: StaticWall
DESCRIPTION: solid barriers that reflect the ball back when hit, forming
             the basic boundaries and maze elements of levels
*/

class StaticWall extends Walls {
    
    public StaticWall(int length, double x, double y, double theta) {
        super(length, x, y, theta);
    }
}