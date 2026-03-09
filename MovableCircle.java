
public class MovableCircle implements Movable { 
  private MovablePoint center;
  private int radius;
  
  // TASK: Add the constructor here
  public MovableCircle(int x, int y, int xSpeed, int ySpeed, int newradius){
MovablePoint center = new MovablePoint(x,y,xSpeed,ySpeed)

radius= newradius;

  }
  // TASK: Implement all abstract methods declared in the interface
  @Override
  public void moveUp() {
	 center.moveUp();// move the center up
  }
public void moveDown() {
	 center.moveDown();// move the center down
  }
public void moveRight() {
	 center.moveRight();// move the center right
  }

public void moveLeft() {
	 center.moveLeft();// move the center left
  }

}
