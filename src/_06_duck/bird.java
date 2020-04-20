package _06_duck;

public class bird {
	int numberOfFriends;
	String favoriteFood;
	bird(String favoriteFood, int numberOfFriends){
		this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
	}
	void chirp(){
	System.out.println("The bird chirped a little tune");	
	}
	
	void fly() {
	System.out.println("The bird flew away majesticly");
	}
}

