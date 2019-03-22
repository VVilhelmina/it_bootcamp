package novipaket;



public class Avion implements IMoveable{
public String sBroj;
public double altitude,longitude;
	@Override
	public void printLocation() {
		System.out.println(this.toString());

	}

	@Override
	public String toString() {
		return sBroj + "[" + altitude + "," + longitude + "]";
	}

	@Override
	public void moveUp(double value) {
		altitude+=value;

	}

	@Override
	public void moveDown(double value) {
		altitude-=value;

	}

	@Override
	public void moveLeft(double value) {
		longitude-=value;

	}

	@Override
	public void moveRight(double value) {
		longitude+=value;

	}

}
