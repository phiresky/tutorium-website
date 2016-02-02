public class BankAccount {
	static int counter = 0;

	int moneyAmount = 0;
	final int id;
	String name;

	BankAccount(String name) {
		this(name, 0);
	}

	BankAccount(String name, int amount) {
		id = counter;
		counter = counter + 1;
		moneyAmount = amount;
		this.name = name;
	}

	void transfer(BankAccount other,
			int amount) {
		withdraw(amount);
		other.deposit(amount);
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return this.name;
	}

	void deposit(int amount) {
		moneyAmount += amount;
	}

	void withdraw(int amount) {
		moneyAmount -= amount;
	}

	public String toString() {
		return name + ": " + "KontoNr: " + id + ", Betrag: " + moneyAmount;
	}

	public static void main(String[] args) {
		BankAccount giro = new BankAccount("Girokonto", 500);
		BankAccount depot = new BankAccount("Depo");
		System.out.println(giro);
		System.out.println(depot);
	}
}
