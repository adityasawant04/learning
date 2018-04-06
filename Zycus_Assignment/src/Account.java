
public class Account {
	int highest=0;
	int lowest =0;

	public double interest(int amount) 
	{ 
		if ( amount <= 1000 )	{
			double slab1 = 0;
			return amount*(slab1/100);
		}
		else if ( amount <= 5000 )	{
			double slab2 = 2.5;
			return amount*(slab2/100);
		}
		else if ( amount <= 10000 )	{
			double slab3 = 5;
			return amount*(slab3/100);
		}
		else {
			double slab4 = 8;
			return amount*(slab4/100);
		}

	}
	public int interestType(double interest) 
	{ 
		if ( interest <= 0 )	{
			return 0;
		}
		else if ( interest <= lowest )	{
			return 1;
		}
		else if ( interest >= highest ) {
			return 2;
		}
		return 3;
	} 


}
