//uDemy, curso Java Completo, secao 9, aula 80
//codigo origme em https://github.com/acenelio/encapsulamento1-java
//codigo em https://github.com/marcmir70/uDemy_JavaCompleto_09_consThisSobrEncap
package entities;

public class Account {
	private int number;
	private String holder;
	private double balance;
	public static final double WithdrawTAX = 5.00;
	
	public Account() {
	}
	
// Source > Generate Constructor using Fields
	public Account(int number, String holder) {  // , double accBalance
		this.number = number;
		this.holder = holder;
		// this.accBalance = accBalance;  // já é 0 neste construtor por não ser informado nele
	}
// Source > Generate Constructor using Fields	
	public Account(int number, String holder, double initialDeposit) {
		super();
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
//  Source > Generate Getters and Setter
	public int getNumber() {
		return number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
		
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		balance = this.balance - amount -WithdrawTAX;
	}
	
	public String toString() { //sobreposicao
		return "Account " + number 
			+ ", Holder: " + holder
			+ ", Balance: $ " + String.format("%.2f", balance);
	}
}
