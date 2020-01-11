import java.util.Scanner;
import java.util.Random;

class DemonSlayer {

	private String name;
	private int health;
	private int damage;
	
	public DemonSlayer (String name, int health, int damage) {
		this.name = name;
		this.health = health;
		this.damage = damage;
	
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public int getDamage() {
		return this.damage;
		
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
		
	public void setDamage(int damage) {
		this.damage = damage;
	}	
	
}
	
	class Test {
		public static void main(String[] args) {
			Random rand = new Random();
			
			DemonSlayer[] enemies = {
				new DemonSlayer("Muzan", 100, 70),
				new DemonSlayer("Rui", 100, 40),
				new DemonSlayer("daki", 100, 51),
				new DemonSlayer("Susamaru", 100, 32),
			};
			DemonSlayer enemy = new DemonSlayer("Muzan", 100, 70);
				new DemonSlayer("Rui", 100, 40);
				new DemonSlayer("daki", 100, 51);
				new DemonSlayer("Susamaru", 100, 32);
			DemonSlayer player = new DemonSlayer("Tanjirou", 100, 75);
			
			while(enemy.getHealth() > 0 && player.getHealth() > 0) {
				System.out.println(player.getName() + "'s Health:" + player.getHealth());
				System.out.println(enemy.getName() + "'s Health:" + enemy.getHealth());
				char command = getCommand();
				player.setDamage(computeDamage(command));
				enemy.setHealth(enemy.getHealth() - player.getDamage());
				
				System.out.println(enemy.getName() + " received " + player.getDamage() + " damage ");
				
				char e_command = "abcd".charAt(rand.nextInt(3));
				enemy.setDamage(computeDamage(e_command));
				player.setHealth(player.getHealth() - enemy.getDamage());
				System.out.println(player.getName() + " received " + enemy.getDamage() + " damage " );
				
			}
			
			String knockdown = player.getHealth() > 0 ? enemy.getName() : player.getName();
			System.out.println(knockdown + " has knockdown ");
			
			}
			
			public static char getCommand() {
				Scanner scan = new Scanner(System.in);
				System.out.println("Choose Move");
				System.out.println("A. Seventh Form");
				System.out.println("B. Tenth Form");
				System.out.println("C. First Form");
				System.out.println("D. Ninth Form");
				System.out.print("Choose: ");
				return scan.nextLine().charAt(0);
			}
			
			public static int computeDamage(char move) {
				switch(move) {
					case 'A': case 'a': return 25;
					case 'B': case 'b': return 59;
					case 'C': case 'c': return 70;
					case 'D': case 'd': return 15;
					default: return 0;
					
				}
			}
		}
	
		
