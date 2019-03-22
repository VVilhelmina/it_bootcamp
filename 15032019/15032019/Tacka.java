package novipaket;

public class Tacka implements IMoveable{
public double x,y;
	
	@Override
	public void printLocation() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());
	}
	

	@Override
	public String toString() {
		return "T[" + x + ", " + y + "]";
	}


	@Override
	public void moveUp(double value) {
		y+=value;
		
	}

	@Override
	public void moveDown(double value) {
		y-=value;
		
	}

	@Override
	public void moveLeft(double value) {
		x-=value;
		
	}

	@Override
	public void moveRight(double value) {
		x+=value;
		
	}

}
