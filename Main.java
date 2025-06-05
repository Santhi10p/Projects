package Project2;

public class Main {

	public static void main(String[] args) {
		Dog dog=new Dog("Buddy",3, true, "Golden Retriever");
		Cat cat=new Cat("Whiskers", 2, true, "Black");
		Parrot p=new Parrot("Polly", 1, true, true);
		
		System.out.println("DOG INFORMATION");
		dog.displayinfo();
		dog.makeSound();
		System.out.println();
		System.out.println();
		System.out.println("CAT INFORMATION");
		cat.displayinfo();
		cat.makeSound();
		System.out.println();
		System.out.println();
		System.out.println("PARROT INFORMATION");
		p.displayinfo();p.makeSound();
	}

}
