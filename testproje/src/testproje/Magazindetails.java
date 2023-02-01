package testproje;

public class Magazindetails extends Bookdetails{
	
	int serieslenght;
	String yearsofmagazin;
	

	Magazindetails(String nameofbook, boolean isitavaible,String author,int serieslenght,String yearsofmagazin)
	{
		
		super(nameofbook, serieslenght, isitavaible, author);
		this.serieslenght=serieslenght;
		this.yearsofmagazin=yearsofmagazin;
	    
	}
	
	
	@Override
	void returndate()
	{
		
	     int daysleftforreturn2=10;
		 System.out.print(daysleftforreturn2);
	}

}
