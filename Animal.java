package Project2;

class Animal {

	private String name;
	private int age;
	Animal(){
		
	}
	Animal(String name,int age){
		this.name=name;
		this.age=age;
	}
		
	public void makeSound() {
		System.out.println("Animal sound");
	}
	public void displayinfo() {
		System.out.println("Name : "+ name +"\nAge : "+ age);
	}
}

class Mammal extends Animal{
	private boolean isDomestic;
	
	Mammal()
	{
		
	}
	Mammal(String name,int age,boolean isDomestic){
		super(name,age);
		this.isDomestic=isDomestic;
	}
	
	public void makeSound() {
		System.out.println("Mammal sound");
	}
	public void displayinfo() {
		super.displayinfo();
		System.out.println("isDomestic"+isDomestic);
	}
	
}
class Bird extends Animal{
	private boolean canFly;
	Bird(){}
	Bird(String name,int age,boolean canFly){
		super(name,age);
		this.canFly=canFly;
	}
	public void makeSound() {
		System.out.println("Bird sound");
	}
	public void displayinfo() {
		super.displayinfo();
		System.out.println("CanFly : "+canFly);
	}
	
}

class Dog extends Mammal{
	private String breed;
	Dog(){}
	Dog(String name,int age,boolean isDomestic,String breed){
		super(name,age,isDomestic);
		this.breed=breed;
	}
	public void makeSound() {
		System.out.println("Wow Wow....");
	}
	public void displayinfo() {
		super.displayinfo();
		System.out.println("Breed : "+breed);
	}
}
class Cat extends Mammal{
	private String color;
	Cat(){}
	Cat(String name,int age,boolean isDomestic,String color)
	{
		super(name,age,isDomestic);
		this.color=color;
	}
	public void makeSound() {
		System.out.println("Meaue....");
	}
	public void displayinfo() {
		super.displayinfo();
		System.out.println("Color : "+color);
	}
}

class Parrot extends Bird{
	private boolean talks;
	Parrot(){}
	Parrot(String name,int age,boolean canFly,boolean talks)
	{
		super(name,age,canFly);
		this.talks=talks;
	}
	public void makeSound() {
		System.out.println("Parrot sound....");
	}
	public void displayinfo() {
		super.displayinfo();
		System.out.println("Talks : "+talks);
	}
}


























