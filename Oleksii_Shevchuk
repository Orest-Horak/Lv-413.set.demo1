package demo1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class first_program {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		ArrayList<User> users = new ArrayList<User>();
		ArrayList<User> loadUsers = new ArrayList<User>();
		User newUser = new User();

		users.add(new User("Ivan", "Ivanov", 14256782));
		users.add(new User("Stepan", "Stepanov", 14256782));
		users.add(new User("Jyrij", "Pelikan", 14256782));

		int menuPosition;

		do {
			System.out.println("MENU\n 1. Add new user in system\n" + " 2. View all registration users\n"
					+ " 3. Search registered user\n" + " 0. Exit\n ____Make a choice____\n ");
			menuPosition = in.nextInt();
			switch (menuPosition) {
			case 1: {
				System.out.println("Add new user\n Add Name:\t");
				newUser.firstName = in.next();
				System.out.println("\n Add Last name:\t");
				newUser.lastName = in.next();
				System.out.println("\n Add phone number:\t");
				newUser.phoneNumber = in.nextInt();
				users.add(newUser);
				SerializableFile(users);
				System.out.println("\n");
				break;
			}

			case 2: {
				loadUsers = DeserializableFile(loadUsers);
				System.out.println("View all registration users");
				for (User u : loadUsers) {
					System.out.printf("Name: %s\tLast name: %s\tPhone Number: %d\n", u.getName(), u.getLastName(),
							u.getPhoneNumber());

				}
				System.out.println("\n");
				break;
			}

			case 3: {
				System.out.println("Search registered user\n");
				System.out.println("1. By name\n" + "2. By last name\n" + "0. Exit\n");
				menuPosition = in.nextInt();
				switch (menuPosition) {
				case 1: {
					System.out.println("Enter name:\n");
					String findeByName = in.next();
					loadUsers = DeserializableFile(loadUsers);
					for (User u : loadUsers) {
						if (u.getName() != null && u.getName().contains(findeByName)) {
							System.out.printf("Name: %s\tLast name: %s\tPhone Number: %d\n", u.getName(),
									u.getLastName(), u.getPhoneNumber());
							break;
						} else {
							System.out.printf("No user in system\n");
							break;
						}

					}
					System.out.println("\n");
					break;
				}

				case 2: {
					System.out.println("Last name:\n");
					String findeByLastname = in.next();
					loadUsers = DeserializableFile(loadUsers);
					for (User u : loadUsers) {
						if (u.getLastName() != null && u.getLastName().contains(findeByLastname)) {
							System.out.printf("Name: %s\tLast name: %s\tPhone Number: %d\n", u.getName(),
									u.getLastName(), u.getPhoneNumber());
							break;
						} else {
							System.out.printf("No user in system\n");
							break;
						}

					}
					System.out.println("\n");
					break;
				}

				case 0: {
					SerializableFile(users);
					System.out.println("Exit\n");
					break;
				}
				}
			}
			case 0: {
				SerializableFile(users);
				System.out.println("Exit\n");
				break;
			}

			}
		} while (menuPosition != 0);
	}

	public static ArrayList<User> DeserializableFile(ArrayList<User> loadUsers) {
		try (ObjectInputStream oi = new ObjectInputStream(
				new FileInputStream("C:\\Users\\User\\eclipse-workspace\\demo1\\users.dat"))) {
			loadUsers = ((ArrayList<User>) oi.readObject());
			// System.out.printf("Name: %s\tLast name: %s\tPhone Number:
			// %d\n",u2.getName(),u2.getLastName(),u2.getPhoneNumber());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return loadUsers;
	}

	public static void SerializableFile(ArrayList<User> users) {
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("users.dat"))) {
			os.writeObject(users);

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}

class User implements java.io.Serializable {
	String firstName;
	String lastName;
	int phoneNumber;

	User() {
		this.firstName = "First_Name";
		this.lastName = "Last_Name";
		this.phoneNumber = 12345678;
	}

	User(String fName, String lName, int pNumber) {
		this.firstName = fName;
		this.lastName = lName;
		this.phoneNumber = pNumber;
	}

	public void ShowUser() {
		System.out.printf("Name: %s\tSoname: %s\tPhone Number: %d\n", firstName, lastName, phoneNumber);
	}

	String getName() {
		return firstName;
	}

	String getLastName() {
		return lastName;
	}

	int getPhoneNumber() {
		return phoneNumber;
	}
}
