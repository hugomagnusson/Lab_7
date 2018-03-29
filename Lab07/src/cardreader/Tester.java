package cardreader;

import java.util.Scanner;

public class Tester {
	
	UserTable table;
	User u;
	User user;

	public static void main (String []args){
		
		Tester tester = new Tester();
		
		tester.looper();
		
	}
	
	public void looper(){
		
		Scanner scan = new Scanner(System.in);
		table = new UserTable();
		
		
		u = table.find(24073);
		System.out.println(u);
		u = table.find(24074);
		System.out.println(u);
		u = table.findByName("Jens Holmgren");
		System.out.println(u);
		/**
		
		user = new User(12345, "Lol");
		
		//table.add(user);
		
		//table.print();
		
		//table.getNbrUsers();
		**/
		System.out.println(table.testFind());
		
	}
	
}
