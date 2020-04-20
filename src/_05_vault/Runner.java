package _05_vault;

public class Runner {
public static void main(String[] args) {
	JamesBond k = new JamesBond();
	Vault One = new Vault(86);
	System.out.println(k.findCode(One));
}
}
