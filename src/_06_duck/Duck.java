package _06_duck;

public class Duck {
	int numberOfFriends;
	String favoriteFood;
	Duck(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
}
	void quack() {
	System.out.println("The duck quacked");	
	}
	void waddle() {
	System.out.println("The duck waddled away");
	}
	}
