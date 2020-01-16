import java.util.Scanner;
import java.util.Random;

class DemonSlayer{

private String name;
private int damage;
private int hp;

public DemonSlayer(String name, int hp, int damage)
{
this.name = name;
this.damage = damage;
this.hp = hp;
}
public String getName(){
return this.name;
}
public int getHp(){
return this.hp;
}
public int getDamage(){
return this.damage;
}
public void setHp(int hp){
this.hp = hp;
}
public void SetDamage(int damage){
this.damage = damage;
}
}

class Attacks{
private String attack1;
private String attack2;
private String attack3;
private String attack4;

public Attacks(String attack1, String attack2, String attack3, String attack4)
{
this.attack1 = attack1;
this.attack2 = attack2;
this.attack3 = attack3;
this.attack4 = attack4;
}
public String getAttack1(){
return this.attack1;
}
public String getAttack2(){
return this.attack2;
}
public String getAttack3(){
return this.attack3;
}
public String getAttack4(){
return this.attack4;
}
public void setAttack1(String attack1){
this.attack1 = attack1;
}
public void setAttack2(String attack2){
this.attack2 = attack2;
}
public void setAttack3(String attack3){
this.attack3 = attack3;
}
public void setAttack4(String attack4){
this.attack4 = attack4;
}
}

 class Game {
 
 public static void main(String[] args){
 
 Scanner scan = new Scanner(System.in);
 Random random = new Random();

 String [] random_enemy = {"Muzan","Rui","Daki","Susamaru","Gyokko"};
 int enemy_DemonSlayer = random.nextInt(random_enemy.length);
 String Enemy = random_enemy[enemy_DemonSlayer];
 System.out.println(" Demon " + Enemy + " appeared!");
 
 String [] random_player = {"Tanjirou","Zenitsu","Inosuke","Nezuko"};
 int player_DemonSlayer;
 int DemonSlayer_num = 1;
 for (String Demon : random_player)
 {
 System.out.println(DemonSlayer_num + ". " + Demon );
 DemonSlayer_num++;
 }
 
 System.out.println("Pick a Hero: ");
 switch (Integer.parseInt(scan.nextLine()))
 {
 case 1 : player_DemonSlayer = 0;
 break;
 
 case 2 : player_DemonSlayer = 1;
 break;
 
 case 3 : player_DemonSlayer = 2;
 break;
 
 case 4 : player_DemonSlayer = 3;
 break;
 
 default : player_DemonSlayer = 0;
 }

 String Player = random_player[player_DemonSlayer];
 System.out.println("You picked " + Player);

 DemonSlayer enemy = new DemonSlayer(Enemy, 100, 0);
 DemonSlayer player = new DemonSlayer(Player, 100, 0);
 Attacks player_Attacks = new Attacks("","","","");
 Attacks enemy_Attacks = new Attacks("","","","");
 

 while(enemy.getHp() > 0 && player.getHp() > 0){
 

 System.out.println(Enemy + " HP: " + enemy.getHp());
 System.out.println("_______________________");
 System.out.println("Your " + Player + " HP: " + player.getHp());

 
 Random player_random_damage = new Random();
 Random enemy_random_damage = new Random();

 int [] player_damage1 = {10,27,4,6,29};
 int [] player_damage2 = {5,15,5,20,21};
 int [] player_damage3 = {6,10,18,18,28};
 int [] player_damage4 = {6,9,15,11,30};
 
 int [] enemy_damage1 = {7,8,17,11,29};
 int [] enemy_damage2 = {3,4,11,19,25};
 int [] enemy_damage3 = {9,9,14,13,27};
 int [] enemy_damage4 = {4,6,11,14,22};
 

 int player_damage1_power = player_random_damage.nextInt(player_damage1.length);
 int player_damage1_result = player_damage1[player_damage1_power];
 
 int player_damage2_power = player_random_damage.nextInt(player_damage2.length);
 int player_damage2_result = player_damage2[player_damage2_power];
 
 int player_damage3_power = player_random_damage.nextInt(player_damage3.length);
 int player_damage3_result = player_damage3[player_damage3_power];
 
 int player_damage4_power = player_random_damage.nextInt(player_damage4.length);
 int player_damage4_result = player_damage4[player_damage4_power];
 
 int enemy_damage1_power = enemy_random_damage.nextInt(enemy_damage1.length);
 int enemy_damage1_result = enemy_damage1[enemy_damage1_power];
 
 int enemy_damage2_power = enemy_random_damage.nextInt(enemy_damage2.length);
 int enemy_damage2_result = enemy_damage2[enemy_damage2_power];
 
 int enemy_damage3_power = enemy_random_damage.nextInt(enemy_damage3.length);
 int enemy_damage3_result = enemy_damage3[enemy_damage3_power];
 
 int enemy_damage4_power = enemy_random_damage.nextInt(enemy_damage4.length);
 int enemy_damage4_result = enemy_damage4[enemy_damage4_power];
 
 if(Player.equals("Tanjirou"))
 {
 player_Attacks.setAttack1("Seventh Form");
 player_Attacks.setAttack2("Tenth Form");
 player_Attacks.setAttack3("First Form");
 player_Attacks.setAttack4("Ninth Form");
 }
 
 else if(Player.equals("Zenitsu"))
 {
 player_Attacks.setAttack1("Breath of Thunder");
 player_Attacks.setAttack2("Thunderclap and Flash");
 player_Attacks.setAttack3("Lightning Ball");
 player_Attacks.setAttack4("Flaming Thunder God");
 }
 
 else if(Player.equals("Inosuke"))
 {
 player_Attacks.setAttack1("Beast Breathing");
 player_Attacks.setAttack2("Fang One");
 player_Attacks.setAttack3("Fang Three");
 player_Attacks.setAttack4("Spatial Awareness");
 }
 
 else if(Player.equals("Nezuko"))
 {
 player_Attacks.setAttack1("Kekkijutsu");
 player_Attacks.setAttack2("Bakketsu");
 player_Attacks.setAttack3("Regenerate");
 player_Attacks.setAttack4("Hahahatdooog");
 }
 
 if(Enemy.equals("Muzan"))
 {
 enemy_Attacks.setAttack1("Demon Whip");
 enemy_Attacks.setAttack2("Spine Whips");
 enemy_Attacks.setAttack3("Demon Blood Nullifying");
 enemy_Attacks.setAttack4("Black Blood");
 }
 
 else if(Enemy.equals("Rui"))	
 {
 enemy_Attacks.setAttack1("Cage of Murdering Eyes");
 enemy_Attacks.setAttack2("Cell Manipulate");
 enemy_Attacks.setAttack3("Cruel String Prison");
 enemy_Attacks.setAttack4("Wheel of Chopping Threads");
 }
 
 else if(Enemy.equals("Daki"))
 {
 enemy_Attacks.setAttack1("Multilayeres Sash Slash");
 enemy_Attacks.setAttack2("Blood Demon Art");
 enemy_Attacks.setAttack3("Demon Psychic");
 enemy_Attacks.setAttack4("Demon Flesh");
 }
 
 else if(Enemy.equals("Susamaru"))
 {
 enemy_Attacks.setAttack1("Playing Temari");
 enemy_Attacks.setAttack2("Yahaba's Arrows");
 enemy_Attacks.setAttack3("Flash Temari");
 enemy_Attacks.setAttack4("Blood Demon Art Temari");
 }
 
 else if(Enemy.equals("Gyokko"))
 {
 enemy_Attacks.setAttack1("Fish Assassin:Thousand Needles!");
 enemy_Attacks.setAttack2("Octopus Pot of Hell!");
 enemy_Attacks.setAttack3("Ten Thousand Gliding Clay-fish!!");
 enemy_Attacks.setAttack4("Deadly Scales of War");
 }
 
 System.out.println("1. " + player_Attacks.getAttack1());
 System.out.println("2. " + player_Attacks.getAttack2());
 System.out.println("3. " + player_Attacks.getAttack3());
 System.out.println("4. " + player_Attacks.getAttack4());
 System.out.println("");
 System.out.println("Choose an attack");
 
 int player_attack;
 switch (scan.nextInt())
 {
 case 1 : player_attack = 0;
 break;
 case 2 : player_attack = 1;
 break;
 case 3 : player_attack = 2;
 break;
 case 4 : player_attack = 3;
 break;
 default : player_attack = 0;
 }

 if (player_attack == 0)
 {
 System.out.println(Player +" uses "+ player_Attacks.getAttack1());
 System.out.println(Enemy + " takes " + player_damage1_result +" damage!");
 enemy.setHp(enemy.getHp() - player_damage1_result);

 System.out.println(Enemy +" uses "+ enemy_Attacks.getAttack1());
 System.out.println("Your " + Player + " takes " + enemy_damage1_result +" damage!");
 player.setHp(player.getHp() - enemy_damage1_result);
 }
 else if (player_attack == 1)
 {
 System.out.println(Player +" uses "+ player_Attacks.getAttack2());
 System.out.println(Enemy + " takes " + player_damage2_result +" damage!");
 enemy.setHp(enemy.getHp() - player_damage2_result);

 System.out.println(Enemy +" uses "+ enemy_Attacks.getAttack2());
 System.out.println("Your " + Player + " takes " + enemy_damage2_result +" damage!");
 player.setHp(player.getHp() - enemy_damage2_result);
 }
 else if (player_attack == 2)
 {
 System.out.println(Player +" uses "+ player_Attacks.getAttack3());
 System.out.println(Enemy + " takes " + player_damage3_result +" damage!");
 enemy.setHp(enemy.getHp() - player_damage3_result);

 System.out.println(Enemy +" uses "+ enemy_Attacks.getAttack3());
 System.out.println("Your " + Player + " takes " + enemy_damage3_result +" damage!");
 player.setHp(player.getHp() - enemy_damage3_result);
 }
 else if (player_attack == 3)
 {
 System.out.println(Player +" uses "+ player_Attacks.getAttack4());
 System.out.println(Enemy + " takes " + player_damage4_result +" damage!");
 enemy.setHp(enemy.getHp() - player_damage4_result);

 System.out.println(Enemy +" uses "+ enemy_Attacks.getAttack4());
 System.out.println("Your " + Player + " takes " + enemy_damage4_result +" damage!");
 player.setHp(player.getHp() - enemy_damage4_result);
 }
 }

 if (enemy.getHp() <= 0)
 {
 System.out.println("");
 System.out.println(Enemy + " Knocked Down! ");
 System.out.println("Your " + Player + " Wins! ");
 }
 else if (player.getHp() <= 0)
 {
 System.out.println("");
 System.out.println("Your " + Player + " Knocked Down! ");
 System.out.println(Enemy + " Wins! ");
 }
 
 
 
 
 
 
 
 
 
 
 
}
 }

