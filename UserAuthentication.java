package GullyGirl;

import java.util.Scanner;

public class UserAuthentication {
	public static void main(String[] args) {
		
		String correctusername = "user";
		String correctpassword = "password";
		
		Scanner sc = new Scanner(System.in);
		//String username = sc.nextLine();
		//String password = sc.nextLine();
		boolean forward = false;
		do {
			System.out.println("Enter Usersame: ");
			String username = sc.nextLine();
			
			System.out.println("Enter password: ");
			String password = sc.nextLine();
			
			if (username.equals(correctusername) && password.equals(correctpassword)) {
				System.out.println("Login succesful " + username + ".");
				forward = true;
				
			}
			else {
				System.out.println("Incorrect username or password");
			}
		}
		while (!forward);
			
		
		
	}
	

}
