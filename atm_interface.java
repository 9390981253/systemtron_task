package codsoft;
import java.util.Scanner;

class user_balance{
	private double balance;
	
	
	public user_balance(double current_balance) {
		this.balance=current_balance;
	 }
	public double getBalance() {
		return balance;
	}
	public boolean withdraw(double amount) {
		if(amount<=balance) {
		balance-=amount;
		return true;
		}
		else {
			System.out.println("Insufficient balance!!");
			return false;