
public class MovablePoint implements Movable {
	int x, y, xSpeed, ySpeed; // package access
	
	// TASK: Add the constructor below

public MovablePoint(int newx, newy, newxSpeed, newySpeed){
	x=newx;
	y=newy;
	xSpeed=newxSpeed; 
	ySpeed=newySpeed;

}

	// Implement abstract methods declared in the interface
	@Override
	public void moveUp() {
		y += ySpeed; // moves y point up by increment ySpeed
	}
public void moveDown(){
	y=y-ySpeed
}

public void moveLeft(){
	x=x-xSpeed;
}

public void moveRight(){
	x=x + xSpeed;
}
	// TASK: Code the other interface methods below


}
