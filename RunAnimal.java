import java.util.Scanner;
public class RunAnimal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		Bird bd= new Bird();
		Cat ct= new Cat();
		Dog dg= new Dog();
		
		System.out.println("Choose an animal!: ");
		System.out.println("Press B for Bird, C for Cat, or D for Dog: ");
		String input = sc.nextLine();
		
		if (input.equalsIgnoreCase("b")){
			bd.eat();
			bd.sleep();
			bd.makeSound();	
		}
		if (input.equalsIgnoreCase("c")){
			ct.eat();
			ct.sleep();
			ct.makeSound();
		}
		if (input.equalsIgnoreCase("d")){
			dg.eat();
			dg.sleep();
			dg.makeSound();
		}
	}
}