import java.util.Scanner;

public class IBOX {

	private static Scanner in;
	private static float balance = 0;

	public static void main(String args[]) {
		in = new Scanner(System.in);
		transaction();
	}

	private static void transaction() {

		System.out.println("Please select an option");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Balance");

		int choice = in.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Please enter amount to withdraw: ");
			float amount = in.nextFloat();
			if (amount > balance || amount == 0) {
				System.out.println("You have insufficient funds");
				anotherTransaction();
			} else {
				balance = balance - amount;
				System.out.println("You have withdrawn " + amount + " and your new balance is " + balance);
				anotherTransaction();
			}
			break;
		case 2:
			System.out.println("Please enter amount you would wish to deposit: ");
			float deposit = in.nextFloat();
			if (deposit < 0) {
				System.out.println("Invalid option!\n");
				anotherTransaction();
			} else {
				balance = deposit + balance;
				System.out.println("You have deposited " + deposit + " new balance is " + balance);
				anotherTransaction();
			}
			break;
		case 3:
			System.out.println("Your balance is " + balance);
			anotherTransaction();
			break;
		default:
			System.out.println("Invalid option!");
			anotherTransaction();
			break;
		}
	}

	private static void anotherTransaction() {
		System.out.println("Do you want another transaction?\n\nPress 1 for another transaction\n2 To exit.");
		int anotherTransaction = in.nextInt();
		if (anotherTransaction == 1) {
			transaction();
		} else if (anotherTransaction == 2) {
			System.out.println("Thanks for choosing Yurii & Co. Good Bye!");
		} else {
			System.out.println("Invalid choice\n");
			anotherTransaction();
		}
	}
}
