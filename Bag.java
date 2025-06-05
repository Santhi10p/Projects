package Project1;
import java.util.Scanner;

class Bag {

Ball reff=null;
		
	
	public void addBall(Ball ball) {
		
		reff=ball;
		System.out.println("Ball is successfully added into the BAg");
	}
	public void removeBall() {

		if(reff==null)
			System.out.println("Bag is Empty!!!");
		else
			reff=null;
	}
	public boolean isBagEmpty() {
		
		return reff==null;
	}
	public void showGame() {
		
		if(reff!=null)
		{
			System.out.println("Games: "+reff.getGame());
		}
	}

}
