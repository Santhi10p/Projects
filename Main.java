package Project1;

import java.util.Scanner;

public class Main {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

		Bag bag=new Bag();
		Ball ball;
		int ch;
		do {
			System.out.println("\n\n\n");
		System.out.println("===============MENU==============");
		System.out.println("1. ADD BALL\n2. REMOVE BALL\n3. CHECK BAG IS EMPTY OR NOT\n4. SHOW GAMES THAT CAN BE PLAYED\n5. EXIT");
		System.out.println("Enter your chiose :");
		ch =sc.nextInt();
		
		switch(ch) {
		case 1:
			System.out.println("WHICH GAME YOU NEED TO ADD \n 1.BASKET BALL \n 2.TENNISE BALL");
			int ch1=sc.nextInt();
			if(ch1==1)
			{
				ball=new BB();
			}
			else {
				ball=new Tennis();
			}
			System.out.println("Enter the radius : ");
			double radius=sc.nextDouble();
			ball.setRadius(radius);
			bag.addBall(ball);
			break;
		
		case 2:
			bag.removeBall();
			break;
			
		case 3:
			if(bag.isBagEmpty())
				System.out.println("Bag is empty");
			else
				System.out.println("Bag is not empty ");
			break;
			
		case 4:
			bag.showGame();
			break;
			
		default :
			System.out.println("INVALID CHOICE");
			break;
		}	
		}while(ch !=5);
		
	}
}
