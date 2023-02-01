package testproje;

import java.util.Scanner;

 class Signupclass {
	static void signuppage()
	{

		 Scanner takevalue2=new Scanner(System.in);
			String accountname;
		 
		 System.out.println("                            ");
		 System.out.println("                            ");
		 System.out.println("                            ");
		 System.out.println("Please choose a account name");
		 accountname=takevalue2.next();
		 
		 
		 System.out.println("****************************");
		 
		 System.out.println("                            ");
		 System.out.println("                            ");
		 System.out.println("                            ");
		
		 System.out.println("Choosen name: "+accountname);
		 
		 System.out.println("                            ");
		 System.out.println("                            ");
		 
		
		 String password;
			System.out.println("Please choose a password");
			System.out.println("                        ");
			System.out.println("!!!Warning please use at least 6 characters!!!");
			
			Scanner takepassword=new Scanner(System.in);
			password=takepassword.next();
			
			
			while(password.length()<6)
			{
				Scanner takepasswordloop=new Scanner(System.in);
				System.out.println("Please enter a valid password");
				System.out.println("                             ");
				
				System.out.println("Please choose a password");
				password=takepasswordloop.next();
				
				
				
			}
		 
		 
		 
		 System.out.println("Thanks for signed up");
		 
		 System.out.println("You are directing to the sign in page please waiting...");
		 
	    Signinclass signin1=new Signinclass();
	    signin1.signinpage(accountname, password);
	    
	}
	
}
