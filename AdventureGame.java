import java.util.Scanner;

public class AdventureGame {

	static int hunger = 100;
	static float health = 10;
	static String playername = "";
	static int posX = 0;
	static int posY = 0;
	
	static int probability(){
		return (int) (Math.random()*100);
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to The Endless Journey!");
		System.out.print("What should we do? ");
		Scanner in = new Scanner(System.in);
		String command = " ";
		command = in.nextLine();
		
		while (!(command.equals("kill self") || health <= 0))
		{
			if(command.equalsIgnoreCase("N")){
				System.out.println("You start heading north");
				posY += 10;
				hunger -= 5;
			}
			else if(command.equalsIgnoreCase("S")){
				System.out.println("You start heading south");
				posY -= 10;
				hunger -= 5;
			}
			else if(command.equalsIgnoreCase("E")){
				System.out.println("You start heading east");
				posX += 10;
				hunger -= 5;
			}
			else if(command.equalsIgnoreCase("W")){
				System.out.println("You start heading west");
				posX -= 10;
				hunger -= 5;
			}
			else {
				System.out.println("That is not a viable command");
			}
			
			System.out.println("Your position is now ("+posX+","+posY+")");
			System.out.println("Your health is currently "+health+"");
			if(hunger <= 0 ){
				hunger = 0;
			}
				
			if(hunger <= 10){
				System.out.println("You are starving! You are now continously losing health");
				health -= .5;
			} else if(hunger <= 30){
				System.out.println("You are now hungry");
			}
			
			int interaction = probability();
			
			if(interaction <= 9){
				System.out.println("You encounter a monster! Will you attempt to fight it?");
				System.out.println("Reply with Y for yes and N for no");
				command = in.nextLine();
				if(command.equalsIgnoreCase("Y")){
					int fighting = probability();
					if(fighting <= 32){
						System.out.println("You manage to outwit the monster and defeat it with a quick blow to the head. You feel invigorated with new power");
						hunger += 30;
						health += 2;
					}
					else if(fighting <= 66){
						System.out.println("You manage to defeat the beast by being patient and tiring it out. However, in the process you also take a couple of hits from its claws");
						health -= 2;
					}
					else {
						System.out.println("Before you even have time to raise your sword, the beast has set its claws in you and makes quick work out of you by tearing your guts out");
						health -= 1000;
					}
				}
				else if(command.equalsIgnoreCase("N")){
					int running = probability();
					if(running <= 66){
						System.out.println("You start running and manage to outrun the beast. However, you also get tired out and lose some hunger");
						hunger -= 30;
					}
					else {
						System.out.println("You start running but soon realize that the monster is faster than you. It's not long before it catches up and sets its claws into you");
						health -= 1000;
					}
				}
				
			}
			else if(interaction <= 19){
				System.out.println("You spot a person in the distance! Will you approach them?");
				System.out.println("Reply with Y for yes and N for no");
				command = in.nextLine();
				
				if(command.equalsIgnoreCase("Y")){
					int person = probability();
					if(person <= 49){
						System.out.println("The person turns out to be a travelling priest and he hands you a piece of bread. You restore some hunger");
						hunger += 10;
					} 
					else if(person <= 89){
						System.out.println("The person is a rogue bandit who does not like people getting to close. He strikes you and you lose some health");
						health -= 1;
					}
					else {
						System.out.println("Before you can reach the person they are suddenly mauled by a bear. The bear then comes after you but you manage to escape by sprinting away. You lose some hunger");
						hunger -= 20;
					}
				}
				else if(command.equalsIgnoreCase("N")){
					System.out.println("You avoid the person and continue onwards on your journey");
				}
			}
			else if(interaction <= 29){
				System.out.println("You found a loaf of bread! Will you eat it?");
				System.out.println("Reply with Y for yes and N for no");
				command = in.nextLine();
				
				if(command.equalsIgnoreCase("Y")){
					int bread = probability();
					if(bread <= 69){
						System.out.println("The bread tastes fine and you restore some of your hunger");
						hunger += 20;
					} else {
						System.out.println("The bread was moldy and now you feel sick. You lose some of your health");
						health -= .5;
					}
				} 
				else if(command.equalsIgnoreCase("N")){
					System.out.println("You leave the loaf of bread and continue onwards on your journey");
				}
			}
			else if(interaction <= 39){
				int hole = probability();
				if(hole <= 32){
					System.out.println("You fell into a hole and broke your leg! Your health dropped severely");
					health -= 2.5;
				}
				else if(hole <= 66){
					System.out.println("You fell into a hole and sprained your ankle! Your health dropped somewhat");
					health -= .5;
				}
				else{
					System.out.println("You fell into a hole but managed to not hurt yourself at all");
				}
			}
			
			System.out.print("What should we do? ");
			command = in.nextLine();	
		}
		System.out.println("You died");
	}
}
