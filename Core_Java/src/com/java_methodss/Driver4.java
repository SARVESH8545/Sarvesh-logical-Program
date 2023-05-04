package com.java_methodss;
class Player{
	int id;
	String name;
	int age;
}
public class Driver4 {

	Player getPlayerData(int id) {
		Player player=new Player();
		if (id==7) {
			player.id=7;
			player.name="Dhoni";
			player.age=32;
		}else if (id==18) {
			player.id=18;
			player.name="Kholi";
			player.age=30;	
		}else if (id==45) {
			player.id=45;
			player.name="Rohit Sharma";
			player.age=35;	
		}
		return player;

	}
	public static void main(String[] args) {
     Driver4 driver4=new Driver4();
     Player p=driver4.getPlayerData(45);
     System.out.println(p.id+"  "+p.name+"   "+p.age);

	}

}
