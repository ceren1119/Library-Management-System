package testproje;

import java.util.Scanner;

class Signinclass {
	
	
	
	
	
	
	
	static void signinpage(String x, String y)
	{
		boolean k=false;
		
		
		while(k==false)
		{
		Scanner takevalue3=new Scanner(System.in);
		 String usernamecheck;
		 
		 
		 System.out.println("---------------------------------------");
		 System.out.println("------ Welcome to library system ------");
		 System.out.println("---------------------------------------");
         System.out.println("Please enter your username:");
         usernamecheck=takevalue3.next();
		
         if(x.equals(usernamecheck))
         {
        	 System.out.println("Please enter your password you have 3 chances");
        	 String passwordcheck=takevalue3.next();
        	
        	 if(y.equals(passwordcheck))
        	 {
        		 System.out.println("welco1me " +x+"you are directing to main page ");
        		 k=true;
        		 
        		 //mainpageclasstaki mainpage fonksiyonuna gönderiyoruz kullanıcıyı
        		 
        		 Mainpageclass directingmainpage=new Mainpageclass();
        		 directingmainpage.mainpage();
        		 
           	 }
        	 
        	 else
        	 {
        		 System.out.println("Wrong password please try again to sign in your account");
         		  passwordcheck=takevalue3.next();
         		 if(y.equals(passwordcheck))
            	 {
            		 System.out.println("welco1me " +x+"you are directing to main page ");
            		 k=true;
            		 
            		 //mainpageclasstaki mainpage fonksiyonuna gönderiyoruz kullanıcıyı
            		 
            		 Mainpageclass directingmainpage2=new Mainpageclass();
            		 directingmainpage2.mainpage();
            		 
               	 }
         		 else
         		 {
         			System.out.println("Wrong password please try again to sign in your account");
           		  passwordcheck=takevalue3.next();
           		 if(y.equals(passwordcheck))
              	 {
              		 System.out.println("welco1me " +x+"you are directing to main page ");
              		 k=true;
              		 
              		 //mainpageclasstaki mainpage fonksiyonuna gönderiyoruz kullanıcıyı
              		 
              		 Mainpageclass directingmainpage3=new Mainpageclass();
              		 directingmainpage3.mainpage();
              		 
              		 
         		 }
           		 else
           		 {
           			 System.out.println("you are directing to main page");
           			 Project directingstartfunc=new Project();
           			 directingstartfunc.main(null);
           		 }
        	 }
        	 
        	 
        	 
        	 
        	 
        	 
         }
        
         
		}
         else
         {
        	 System.out.println("There is no user in this name you are directing to sign up page");
         
        	 Signupclass yönlendirme2=new Signupclass();
        	 yönlendirme2.signuppage();
        	 
        	 
        	 
         }
		
	}
	

}
}
