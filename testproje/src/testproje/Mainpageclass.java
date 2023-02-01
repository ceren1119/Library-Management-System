package testproje;

import java.util.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Mainpageclass {

	public static List<String> booklist;

	public static List<String> favouritelist;

	public static List<String> magazinbooklist;

	///////////////////////////////////////////////////////////////////////////////
	static void mainpage() {

		System.out.println("MAİN PAGE");
		System.out.println("");

		System.out.println("GUIDELINES");
		System.out.println("You have to write the number and enter it for what page you want to go");

		System.out.println("          *1-)Book List");
		System.out.println("          *2-)My books");
		System.out.println("          *3-)Favourites");
		System.out.println("          *4-)Sign Out");
		

		Scanner takevalue5 = new Scanner(System.in);
		int pagevalue;
		pagevalue = takevalue5.nextInt();

		if (pagevalue == 1) {
			books();

		}

		if (pagevalue == 2) {
			mybooks();
		}
		if (pagevalue == 3) {
			favourites();
		}

		if (pagevalue == 4) {
			System.out.println("See you later");

			Project signoutdirecting = new Project();
			signoutdirecting.main(null);
		}

	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	static void books() {

		System.out.println("          *1-)Science");
		System.out.println("          *2-)Tech");
		System.out.println("          *3-)History");
		System.out.println("          *4-)Magazine");
		System.out.println("          *5-)Back main page");

		// degeralma mevzusu
		Scanner takevalue5 = new Scanner(System.in);
		int pagevalue;
		pagevalue = takevalue5.nextInt();

		/////////////////////////////////////////////////////////////
		// SCİENCE KİTAPLARI İÇİN
		//////////////////////////////////////////////////////////////
		if (pagevalue == 1) {

			System.out.println("GUIDELINE IF YOU WANT MORE INFO BOOK PLEASE ENTER NUMBER OF BOOK");

			System.out.println("          *1-)BIOGLY");
			System.out.println("          *2-)PHYSIC");
			System.out.println("          *3-)PLANTS");
			System.out.println("          *4-)NUCLEAR ");
			System.out.println("          *5-)Back to booklist");

			Scanner takevalue6 = new Scanner(System.in);
			int pagevalue2;
			pagevalue2 = takevalue6.nextInt();

			// biology kitabı için
			if (pagevalue2 == 1) {
				Bookdetails biologydetails = new Bookdetails("Biology", 359, true, "Darwin");

				System.out.println("NAME OF BOOK====>" + biologydetails.bookname);
				System.out.println("AUTHOR OF BOOK====>" + biologydetails.author);
				System.out.println("Page number====>" + biologydetails.getpage());
				System.out.println("Is it avaible: " + biologydetails.isitavaible);

				System.out.println("");
				System.out.println("");
				System.out.println("For choose this book please press 1");
				System.out.println("For add this book for your favourites please press 2");
				System.out.println("For turn back to science book list press 3");

				int choice;
				choice = takevalue5.nextInt();
				if (choice == 1) {

					booklist.add(biologydetails.bookname);
					biologydetails.isitavaible = false;
					books();
				} else if (choice == 3) {
					books();
				} else if (choice == 2) {
					favouritelist.add(biologydetails.bookname);

					books();
				}
			}

			// physic kitabı için
			if (pagevalue2 == 2) {

				
				Bookdetails physicdetails = new Bookdetails("Physic", 190, true, "Newton");
				
				

				System.out.println("NAME OF BOOK====>" + physicdetails.bookname);
				System.out.println("AUTHOR OF BOOK====>" + physicdetails.author);
				System.out.println("Page number====>" + physicdetails.getpage());
				System.out.println("Is it avaible: " + physicdetails.isitavaible);

				System.out.println("");
				System.out.println("");
				System.out.println("For choose this book please press 1");
				System.out.println("For add this book for your favourites please press 2");
				System.out.println("For turn back to science book list press 3");

				int choice;
				choice = takevalue5.nextInt();
				if (choice == 1) {
				physicdetails.isitavaible = false;

					booklist.add(physicdetails.bookname);

					books();
				} else if (choice == 3) {
					books();
				} else if (choice == 2) {
					favouritelist.add(physicdetails.bookname);

					books();
				}

			}

			if (pagevalue2 == 3) {

				Bookdetails plantsdetails = new Bookdetails("Plants", 209, true, "William");

			

				System.out.println("NAME OF BOOK====>" + plantsdetails.bookname);
				System.out.println("AUTHOR OF BOOK====>" + plantsdetails.author);
				System.out.println("Page number====>" + plantsdetails.getpage());
				System.out.println("Is it avaible: " + plantsdetails.isitavaible);

				System.out.println("");
				System.out.println("");
				System.out.println("For choose this book please press 1");
				System.out.println("For add this book for your favourites please press 2");
				System.out.println("For turn back to science book list press 3");

				int choice;
				choice = takevalue5.nextInt();
				if (choice == 1) {
					plantsdetails.isitavaible = false;
					booklist.add(plantsdetails.bookname);

					books();
				} else if (choice == 3) {
					books();
				}

				else if (choice == 2) {
					favouritelist.add(plantsdetails.bookname);

					books();
				}
			}

			if (pagevalue2 == 4) {
				Bookdetails nucleardetails = new Bookdetails("Nuclear", 1000, true, "Albert E.");

			

				System.out.println("NAME OF BOOK====>" + nucleardetails.bookname);
				System.out.println("AUTHOR OF BOOK====>" + nucleardetails.author);
				System.out.println("Page number====>" + nucleardetails.getpage());
				System.out.println("Is it avaible: " + nucleardetails.isitavaible);

				System.out.println("");
				System.out.println("");
				System.out.println("For choose this book please press 1");
				System.out.println("For add this book for your favourites please press 2");
				System.out.println("For turn back to science book list press 3");

				int choice;
				choice = takevalue5.nextInt();
				if (choice == 1) {
					nucleardetails.isitavaible = false;
					booklist.add(nucleardetails.bookname);

					books();
				} else if (choice == 3) {
					books();
				} else if (choice == 2) {
					favouritelist.add(nucleardetails.bookname);

					books();
				}

			}

		}

		/////////////////////////////////////////////////////////////
		// TECH KİTAPLARI İÇİN
		//////////////////////////////////////////////////////////////

		if (pagevalue == 2) {

			System.out.println("GUIDELINE IF YOU WANT MORE INFO BOOK PLEASE ENTER NUMBER OF BOOK");

			System.out.println("          *1-)C++");
			System.out.println("          *2-)PROCESSORS");
			System.out.println("          *3-)SSD AND HDD");
			System.out.println("          *4-)JAVA ");
			System.out.println("          *5-)Back to booklist");

			Scanner takevalue6 = new Scanner(System.in);
			int pagevalue2;
			pagevalue2 = takevalue6.nextInt();

			// c++ kitabı için
			if (pagevalue2 == 1) {

				Bookdetails cplusdetails = new Bookdetails("C++", 786, true, "Henry W.");
				

				boolean avaible0 = true;
				System.out.println("NAME OF BOOK====>" + cplusdetails.bookname);
				System.out.println("AUTHOR OF BOOK====>" + cplusdetails.author);
				System.out.println("Page number====>" + cplusdetails.getpage());
				System.out.println("Is it avaible: " + cplusdetails.isitavaible);

				System.out.println("");
				System.out.println("");
				System.out.println("For choose this book please press 1");
				System.out.println("For add this book for your favourites please press 2");
				System.out.println("For turn back to tech book list press 3");

				int choice;
				choice = takevalue5.nextInt();
				if (choice == 1) {
					booklist.add(cplusdetails.bookname);
					cplusdetails.isitavaible= false;
					books();
				} else if (choice == 3) {
					books();
				} else if (choice == 2) {
					favouritelist.add(cplusdetails.bookname);

					books();
				}
			}

			if (pagevalue2 == 2) {
				Bookdetails processorsdetails = new Bookdetails("Processors", 190, true, "Frank B.");
				

				boolean avaible1 = true;
				System.out.println("NAME OF BOOK====>" + processorsdetails.bookname);
				System.out.println("AUTHOR OF BOOK====>" + processorsdetails.author);
				System.out.println("Page number====>" + processorsdetails.getpage());
				System.out.println("Is it avaible: " + processorsdetails.isitavaible);

				System.out.println("");
				System.out.println("");
				System.out.println("For choose this book please press 1");
				System.out.println("For add this book for your favourites please press 2");
				System.out.println("For turn back to tech book list press 3");

				int choice;
				choice = takevalue5.nextInt();
				if (choice == 1) {
					booklist.add(processorsdetails.bookname);
					processorsdetails.isitavaible = false;

					books();
				} else if (choice == 3) {
					books();
				} else if (choice == 2) {
					favouritelist.add(processorsdetails.bookname);

					books();
				}

			}

			if (pagevalue2 == 3) {
				Bookdetails hddssddetails = new Bookdetails("HDD and SDD", 789, true, "Richards J.");
				
				
				System.out.println("NAME OF BOOK====>" + hddssddetails.bookname);
				System.out.println("AUTHOR OF BOOK====>" + hddssddetails.author);
				System.out.println("Page number====>" + hddssddetails.getpage());
				System.out.println("Is it avaible: " + hddssddetails.isitavaible);

				System.out.println("");
				System.out.println("");
				System.out.println("For choose this book please press 1");
				System.out.println("For add this book for your favourites please press 2");
				System.out.println("For turn back to tech book list press 3");

				int choice;
				choice = takevalue5.nextInt();
				if (choice == 1) {
					hddssddetails.isitavaible = false;
					booklist.add(hddssddetails.bookname);

					books();
				} else if (choice == 3) {
					books();
				} else if (choice == 2) {
					favouritelist.add(hddssddetails.bookname);

					books();
				}

			}

			if (pagevalue2 == 4) {

				Bookdetails javadetails = new Bookdetails("Java 101", 1900, true, "Joe C.");
				
				System.out.println("NAME OF BOOK====>" + javadetails.bookname);
				System.out.println("AUTHOR OF BOOK====>" + javadetails.author);
				System.out.println("Page number====>" + javadetails.getpage());
				System.out.println("Is it avaible: " + javadetails.isitavaible);

				System.out.println("");
				System.out.println("");
				System.out.println("For choose this book please press 1");
				System.out.println("For add this book for your favourites please press 2");
				System.out.println("For turn back to tech book list press 3");

				int choice;
				choice = takevalue5.nextInt();
				if (choice == 1) {
					booklist.add(javadetails.bookname);
					javadetails.isitavaible= false;
					books();
				} else if (choice == 3) {
					books();
				} else if (choice == 2) {
					favouritelist.add(javadetails.bookname);

					books();
				}

			}

		}

		///////////////////////////////////////
		///////// HISTORY///////////////
		////////////////////////////////

		if (pagevalue == 3) {

			System.out.println("GUIDELINE IF YOU WANT MORE INFO BOOK PLEASE ENTER NUMBER OF BOOK");

			System.out.println("          *1-)OTTOMANS");
			System.out.println("          *2-)MIDDLEEAST");
			System.out.println("          *3-)VIKINGS");
			System.out.println("          *4-)UK ");
			System.out.println("          *5-)Back to booklist");

			Scanner takevalue6 = new Scanner(System.in);
			int pagevalue2;
			pagevalue2 = takevalue6.nextInt();

			// biology kitabı için
			if (pagevalue2 == 1) {

				Bookdetails ottomandetails = new Bookdetails("Ottomans", 189, true, "Ilber Ortaylı");
				

				System.out.println("NAME OF BOOK====>" + ottomandetails.bookname);
				System.out.println("AUTHOR OF BOOK====>" + ottomandetails.author);
				System.out.println("Page number====>" + ottomandetails.getpage());
				System.out.println("Is it avaible: " + ottomandetails.isitavaible);

				System.out.println("");
				System.out.println("");
				System.out.println("For choose this book please press 1");
				System.out.println("For add this book for your favourites please press 2");
				System.out.println("For turn back to history book list press 3");

				int choice;
				choice = takevalue5.nextInt();
				if (choice == 1) {
					booklist.add(ottomandetails.bookname);
					ottomandetails.isitavaible = false;
					books();
				} else if (choice == 3) {
					books();
				} else if (choice == 2) {
					favouritelist.add(ottomandetails.bookname);

					books();
				}

			}

			if (pagevalue2 == 2) {

				Bookdetails middleeastdetails = new Bookdetails("MiddleEast History", 1900, true, "Bernard Lewis");
				
				System.out.println("NAME OF BOOK====>" + middleeastdetails.bookname);
				System.out.println("AUTHOR OF BOOK====>" + middleeastdetails.author);
				System.out.println("Page number====>" + middleeastdetails.getpage());
				System.out.println("Is it avaible: " + middleeastdetails.isitavaible);

				System.out.println("");
				System.out.println("");
				System.out.println("For choose this book please press 1");
				System.out.println("For add this book for your favourites please press 2");
				System.out.println("For turn back to history book list press 3");

				int choice;
				choice = takevalue5.nextInt();
				if (choice == 1) {
					booklist.add(middleeastdetails.bookname);
					middleeastdetails.isitavaible= false;
					books();
				} else if (choice == 3) {
					books();
				} else if (choice == 2) {
					favouritelist.add(middleeastdetails.bookname);

					books();
				}

			}

			if (pagevalue2 == 3) {

				Bookdetails vikingsdetails = new Bookdetails("Vikings", 374, true, "Carl K.");
				
				System.out.println("NAME OF BOOK====>" + vikingsdetails.bookname);
				System.out.println("AUTHOR OF BOOK====>" + vikingsdetails.author);
				System.out.println("Page number====>" + vikingsdetails.getpage());
				System.out.println("Is it avaible: " + vikingsdetails.isitavaible);

				System.out.println("");
				System.out.println("");
				System.out.println("For choose this book please press 1");
				System.out.println("For add this book for your favourites please press 2");
				System.out.println("For turn back to history book list press 3");

				int choice;
				choice = takevalue5.nextInt();
				if (choice == 1) {
					booklist.add(vikingsdetails.bookname);
					vikingsdetails.isitavaible= false;
					books();
				} else if (choice == 3) {
					books();
				} else if (choice == 2) {
					favouritelist.add(vikingsdetails.bookname);

					books();
				}

			}

			if (pagevalue2 == 4) {

				Bookdetails ukdetails = new Bookdetails("UK History", 1900, true, "Will F.");
			

				System.out.println("NAME OF BOOK====>" + ukdetails.bookname);
				System.out.println("AUTHOR OF BOOK====>" + ukdetails.author);
				System.out.println("Page number====>" + ukdetails.getpage());
				System.out.println("Is it avaible: " + ukdetails.isitavaible);

				System.out.println("");
				System.out.println("");
				System.out.println("For choose this book please press 1");
				System.out.println("For add this book for your favourites please press 2");
				System.out.println("For turn back to history book list press 3");

				int choice;
				choice = takevalue5.nextInt();
				if (choice == 1) {
					booklist.add(ukdetails.bookname);
					ukdetails.isitavaible= false;
					books();
				} else if (choice == 3) {
					books();
				} else if (choice == 2) {
					favouritelist.add(ukdetails.bookname);

					books();
				}

			}

		}

		///////////////////////////
		/////// MAGAZİNE///////////
		/////////////////////////

		if (pagevalue == 4) {

			System.out.println("GUIDELINE IF YOU WANT MORE INFO BOOK PLEASE ENTER NUMBER OF BOOK");

			System.out.println("          *1-)SCIENCE AND LOVE");
			System.out.println("          *2-)WEEKLY BIKE");
			System.out.println("          *3-)ECONOMY");
			System.out.println("          *4-)GENTLEMENS");
			System.out.println("          *5-)Back to booklist");

			Scanner takevalue6 = new Scanner(System.in);
			int pagevalue2;
			pagevalue2 = takevalue6.nextInt();

			if (pagevalue2 == 1) {
				
				
				Magazindetails sciencedetails=new Magazindetails("Science",true, "Henry Brothers",102 , "1900-today");
				
				

				boolean avaible0 = true;
				System.out.println("NAME OF BOOK====>" + sciencedetails.bookname);
				System.out.println("AUTHOR OF BOOK====>" + sciencedetails.author);
				System.out.println("Number of series====>" + sciencedetails.serieslenght);
				System.out.println("Years of publishing====>" + sciencedetails.yearsofmagazin);
				System.out.println("Is it avaible: " + sciencedetails.isitavaible);

				System.out.println("");
				System.out.println("");
				System.out.println("For choose this book please press 1");
				System.out.println("For add this book for your favourites please press 2");
				System.out.println("For turn back to magazine list press 3");

				int choice;
				choice = takevalue5.nextInt();
				if (choice == 1) {
					magazinbooklist.add(sciencedetails.bookname);
					
					sciencedetails.isitavaible = false;
					books();
				} else if (choice == 3) {
					books();
				} else if (choice == 2) {
					favouritelist.add(sciencedetails.bookname);

					books();
				}

			}

			if (pagevalue2 == 2) {

				Magazindetails weeklybikedetails=new Magazindetails("Weekly Bike",true, "Harley Davidson Publishing",140 , "1950-1980");
				

				System.out.println("NAME OF BOOK====>" + weeklybikedetails.bookname);
				System.out.println("AUTHOR OF BOOK====>" + weeklybikedetails.author);
				System.out.println("Number of series====>" + weeklybikedetails.serieslenght);
				System.out.println("Is it avaible: " + weeklybikedetails.isitavaible);
				System.out.print("Years of publishing====>" + weeklybikedetails.yearsofmagazin);

				System.out.println("");
				System.out.println("");
				System.out.println("For choose this book please press 1");
				System.out.println("For add this book for your favourites please press 2");
				System.out.println("For turn back to magazine list press 3");

				int choice;
				choice = takevalue5.nextInt();
				if (choice == 1) {
					magazinbooklist.add(weeklybikedetails.bookname);
					
					weeklybikedetails.isitavaible= false;
					books();
				} else if (choice == 3) {
					books();
				} else if (choice == 2) {
					favouritelist.add(weeklybikedetails.bookname);

					books();
				}

			}

			if (pagevalue2 == 3) {

				Magazindetails economydetails=new Magazindetails("Economy",true, "Wallstreet Publishing",45, "2000-Today");
			

				System.out.println("NAME OF BOOK====>" + economydetails.bookname);
				System.out.println("AUTHOR OF BOOK====>" + economydetails.author);
				System.out.println("Numebr of series====>" + economydetails.serieslenght);
				System.out.println("Is it avaible====>" + economydetails.isitavaible);
				System.out.println("Years of publishing====>" + economydetails.yearsofmagazin);

				System.out.println("");
				System.out.println("");
				System.out.println("For choose this book please press 1");
				System.out.println("For add this book for your favourites please press 2");
				System.out.println("For turn back to magazine list press 3");

				int choice;
				choice = takevalue5.nextInt();
				if (choice == 1) {
					magazinbooklist.add(economydetails.bookname);
					
					economydetails.isitavaible= false;
					books();
				} else if (choice == 3) {
					books();
				} else if (choice == 2) {
					favouritelist.add(economydetails.bookname);

					books();
				}

			}

			if (pagevalue2 == 4) {

				Magazindetails gentlemensdetails= new Magazindetails("Gentlemen",true, "Jack T.",876, "1920-Today");
				

				System.out.println("NAME OF BOOK====>" + gentlemensdetails.bookname);
				System.out.println("AUTHOR OF BOOK====>" + gentlemensdetails.author);
				System.out.println("Number of series====>" + gentlemensdetails.serieslenght);
				System.out.println("Year of publishing====>" + gentlemensdetails.yearsofmagazin);
				System.out.println("Is it avaible: " + gentlemensdetails.isitavaible);

				System.out.println("");
				System.out.println("");
				System.out.println("For choose this book please press 1");
				System.out.println("For add this book for your favourites please press 2");
				System.out.println("For turn back to magazine list press 3");

				int choice;
				choice = takevalue5.nextInt();
				if (choice == 1) {

					magazinbooklist.add(gentlemensdetails.bookname);
					// booklist.add(gentlemensdetay.kitapismi);
					gentlemensdetails.isitavaible= false;
					books();
				} else if (choice == 3) {
					books();
				}

				else if (choice == 2) {
					favouritelist.add(gentlemensdetails.bookname);

					books();
				}

			}

		}

		// ana ekrana geri dönüş
		if (pagevalue == 5) {
			mainpage();

		}

	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	static void mybooks() {
		Bookdetails object1 = new Bookdetails("",1,false,"");
		Magazindetails object2 = new Magazindetails("",false,"",0,"");
		
		for (int i = 0; i < booklist.size(); i++) {
			System.out.println("");
			System.out.println("");
			System.out.println("Name of the book:"+booklist.get(i));
			System.out.print("Days left for return:");
			object1.returndate();
			
			
			
			System.out.println("");

		}

		for (int i = 0; i < magazinbooklist.size(); i++) {
			System.out.println("");
			System.out.println("");
			System.out.println("Kitap adi:" + magazinbooklist.get(i));
			System.out.print("Days left for return:");
			object2.returndate();
			System.out.println("");

		}

		System.out.println("For turn back mainpage press 5");
		Scanner takevalue = new Scanner(System.in);
		int x;
		x = takevalue.nextInt();
		if (x == 5) {
			mainpage();
		}

	}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	static void favourites() {

		for (int i = 0; i < favouritelist.size(); i++) {
			System.out.println("Name of the book:"+favouritelist.get(i));
		}

		System.out.println("For turn back mainpage press 5");
		Scanner takevalue = new Scanner(System.in);
		int x;
		x = takevalue.nextInt();
		if (x == 5) {
			mainpage();
		}

	}

}
