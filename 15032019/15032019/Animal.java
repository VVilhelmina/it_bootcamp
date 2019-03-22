package novipaket;

public class Animal implements IChangeable {
	public boolean state = false;

	@Override
	public void changeState() {
		// TODO Auto-generated method stub
		state = !state;
	}

	@Override
	public void printState() {
		// TODO Auto-generated method stub
		if(state)System.out.println("Gladna");
		else System.out.println("nije gladna");
	}

}
