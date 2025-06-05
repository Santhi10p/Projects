package Project1;

class Ball {

	private double radius;
	Ball(){
		
	}
	Ball(double radius){
		this.radius=radius;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}

public  String getGame() {
		return null;
	}

}

class BB extends Ball{
	
	private String game="Basket Ball";
	BB(){
		
	}
	BB(double radius)
	{
		super(radius);
	}
	public String getGame()
	{
		return game;
	}
}
class Tennis extends Ball{
	
	private String game="Tennis";
	Tennis(){
		
	}
	Tennis(double radius){
		super(radius);
	}
	public String getGame() {
		return game;
	}
}