package _05_vault;

public class Vault {

	int secretCode;
	Vault(int code){
		this.secretCode = code;
	}
	boolean tryCode( int num){
			if (secretCode == num) {
			return true;
			}
			else {
				return false;
			}
	}

}
