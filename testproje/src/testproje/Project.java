package testproje;
import java.util.*;







 class Project
{
	

	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	 public static void main(String[] args)
	    {
		 
		 Mainpageclass.booklist = new ArrayList<String>();
		 Mainpageclass.favouritelist=new ArrayList<String>();
		 Mainpageclass.magazinbooklist=new ArrayList<String>();
		 
		 
		 System.out.println("---------------------------------------");
		 System.out.println("------ Welcome to library system ------");
		 System.out.println("---------------------------------------");
		 System.out.println("                                            ");
		 System.out.println("                                            ");
		 
		 
		 
		 //sign in sign up codes
		 System.out.println("***** For sign up press 1 *****");
		 System.out.println("                                            ");
		 System.out.println("                                            ");
		 System.out.println("***** For sign in press 2  *****");
		 
		 Scanner takevalue=new Scanner(System.in);
		 int option1;
		 option1=takevalue.nextInt();
		 
		//onceden kayitli mi diye bakiyoruz
		 
		 
		 if(option1==1)
		 {
		
			Signupclass signupyönlendirme=new Signupclass();
			signupyönlendirme.signuppage();
			
			 
		 }
		 
		 //egerki önceden kayitliysa direkt giris yapıcak
		 else if(option1==2)
		 {
		   databasecheck();
			 
		 }
		 
		 
		 
		
		 Mainpageclass mainpagedirecting=new Mainpageclass();
		 mainpagedirecting.mainpage();
		 
		
		
	    }
	 
	 
	 
	 
	 
	 //önceden kayıtlı insanlar
	 
	 
	 static void databasecheck()
		{
			
			String user1username="mehmet";
			String user1password="mehmet1212";
			
			Scanner takevalue4=new Scanner(System.in);
			String usernamecheck;
			String passwordcheck;
			
			
			//giris istiyoruz tekrardan
			System.out.println("Please enter your username");
			usernamecheck=takevalue4.next();
			if(usernamecheck.equals(user1username))
			{
				
				System.out.println("Please enter your password: ");
				passwordcheck=takevalue4.next();
				
				
				if(passwordcheck.equals(user1password))
				{
					System.out.println("Welcome "+user1username+" you are directing to mainpage...");
				}
				else
				{
					System.out.println("Wrong password please try again");
					databasecheck();
				}
			}
			else
			{
				System.out.println("There is no user in this name in our database you are directing to sign up page...");
				
				Signupclass signupdirecting=new Signupclass();
				signupdirecting.signuppage();
				
				
				
			}
		}
		
		
		
		
	
	 
	 
	 
	
}