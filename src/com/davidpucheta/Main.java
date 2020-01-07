package com.davidpucheta;

public class Main {

    public static void main(String[] args) {
    	//Classes
	    User user = new User("David", 30);
		user.sayHello();

		//Interfaces
		TaxCalculator calculator = getCalculator();
		calculator.calculateTax();

		//Encapsulation 1st principle of OOP
		var account = new Account();
		account.deposit(10);
		account.withdraw(5);
		System.out.println(account.getBalance());

		//Abstraction 2nd principle of OOP
		var mailService = new MailService();
		mailService.sendEmail();

		//Inheritance 3rd principle of OOP
		var textBox = new TextBox();
		textBox.enable();

		//Polymorphism - 4th principle of OOP
		drawUIControl(new CheckBox());
		drawUIControl(new TextBox());
    }

    public static TaxCalculator getCalculator() {
    	return new TaxCalculator2019();
	}

	public static void drawUIControl(UIControl control){
		control.draw();
	}
}
