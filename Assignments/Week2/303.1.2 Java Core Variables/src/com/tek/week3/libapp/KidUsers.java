package com.tek.week3.libapp;

public class KidUsers implements LibraryUser {

	

	
	
	@Override
	public void registerAccount(int age) {
		// TODO Auto-generated method stub
		
		if (age <= 11) { 
			System.out.println("You have successfully registered under a Kids Account");
		}
		
		else { 
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
			
		}
		
		
	}

	@Override
	public void requestBook(String bookType) {
		// TODO Auto-generated method stub
		
		if (bookType == "Kids") { 
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		
		else { 
			System.out.println("Oops, you are allowed to take only kids books");
		}
		
	}
	
	

}
