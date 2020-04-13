package _02_cat;

public class CatRunner {
public static void main(String[] args) {
	Cat k = new Cat("AAA");
	k.meow();
	k.printName();
	for (int i = 0; i < 20; i++) {
		k.kill();	
	}
}
}
