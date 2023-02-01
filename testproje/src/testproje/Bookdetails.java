package testproje;



public class Bookdetails extends Abstractt {
	
	
	String bookname;
	private int page;
	Boolean isitavaible;
	String author;
	
	Bookdetails(String bookname,int page, boolean isitavaible,String author){
		this.bookname=bookname;
		//this.page=page;
		this.isitavaible =isitavaible;
		this.author = author;
		
		if(page<1)
		{
			this.page=0;
		}
		else {
			this.page=page;
		}
		
	}
	
	public int getpage()
	{
	    return(this.page);
	}
	
	
	
	@Override
	void returndate() {
		// TODO Auto-generated method stub
		super.returndate();
	}
	

}
