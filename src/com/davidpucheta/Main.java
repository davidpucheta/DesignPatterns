package com.davidpucheta;

public class Main {

    public static void main(String[] args) {
    	//Classes
	    User user = new User("David", 30);
		user.sayHello();

		//Interfaces
		TaxCalculator calculator = getCalculator();
		calculator.calculateTax();

		//Encapsulation
		var account = new Account();
		account.deposit(10);
		account.withdraw(5);
		System.out.println(account.getBalance());

		//Abstraction
		var mailService = new MailService();
		mailService.sendEmail();

		//Inheritance

    }

    public static TaxCalculator getCalculator() {
    	return new TaxCalculator2019();
	}
}
