package novipaket;

public class Uredjaj implements IChangeable {
	public boolean state=false;
	@Override
	public void changeState() {
		/*if(state) {state=false;}
		else state=true;*/
		
		state=!state;

	}

	@Override
	public void printState() {
		if(state)System.out.println("Ukljucen");
		else System.out.println("Iskljucen");
	}

}
