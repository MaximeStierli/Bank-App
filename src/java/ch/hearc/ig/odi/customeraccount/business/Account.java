package ch.hearc.ig.odi.customeraccount.business;

public class Account {

	private Customer customer;
	private String number;
	private String name;
	private double balance = 0;
	private double rate = 0.001;

	/**
	 * 
	 * @param number
	 * @param name
	 * @param rate
	 * @param customer
	 */
	public Account(String number, String name, double rate, Customer customer) {
		this.number = number;
                this.name = name;
                this.rate = rate;
                this.customer = customer;
	}

	/**
	 * 
	 * @param amount
	 */
	public void credit(double amount) {
		this.balance += amount;
	}

	/**
	 * 
	 * @param amount
	 */
	public void debit(double amount) {
		if(this.balance > amount){
                    this.balance -= amount;
                } else{
                    throw new IllegalArgumentException("Vous n'avez pas assez d'argent sur ce compte !");
                }
	}

	/**
	 * 
	 * @param amount
	 * @param source
	 * @param target
	 */
	public static void transfer(double amount, Account source, Account target) {
		if(source.getBalance() > amount){
                    source.debit(amount);
                    target.credit(amount);
                }else{
                    throw new IllegalArgumentException("Vous n'avez pas assez d'argent pour ce transfert !");
                }
	}

	public double getBalance() {
		return this.balance;
	}

	public String getNumber() {
		return this.number;
	}
}