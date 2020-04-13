package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
public static void main(String[] args) {
	String flavor = JOptionPane.showInputDialog("What flavor of popcorn do you want?");
	String minutes = JOptionPane.showInputDialog("How many minutes do you want it to be cooked for?");
	Popcorn k = new Popcorn(flavor);
	Microwave K = new Microwave();
	int Minutes = Integer.parseInt(minutes);
	K.setTime(Minutes);
	K.putInMicrowave(k);
	K.startMicrowave();
}
}
