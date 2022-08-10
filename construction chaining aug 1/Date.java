class Date
{
    int day;
	int month;
	int year;
	String day2;
	Date()
	{
	this(5);	
	}
	Date(int day)
	{
		this(1,1);
	}
	Date(int day,int month)
	{
	this(1,1,1);
	this.day=day;
	this.month=month;
	}
	Date(int day1,int month1,int year1)
	{
	this(1,1,1,"tue");
		day=day1;
		month=month1;
		year=year1;
	}
	Date(int day,int month,int year,String day2)
	{
	this.day=day;
	this.month=month;
	this.year=year;
	this.day2=day2;
	}
}