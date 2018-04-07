import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class AccountTest {

	public static void main(String[] args) throws NumberFormatException, IOException {

		String studId = "S32465";
		int sidInt[]= new int[studId.length()];
		char[] sidChar = studId.toCharArray();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int amount=0;
		double interest=0;
		double totalInterest = 0, highest = 0, lowest = 0, nointerest = 0;
		int type = 0;
		Account acc = new Account();

		for ( int i = 0 ; i < studId.length(); i++)	{
			sidInt[i] = Character.digit(sidChar[i], 10);

		}
		Arrays.sort(sidInt);
		int N = sidInt[sidInt.length-1];

		for (int i=0; i < N; i++){

			System.out.println("Enter Amount for account number : " +(i+1));
			amount = Integer.parseInt(br.readLine());
			interest = acc.interest(amount);
			System.out.println("Interest for account number : " +(i+1));
			System.out.print("  " +interest);

			switch(acc.interestType(interest))	{

			case 0:
				nointerest++;
				break ;
			case 1:
				lowest = interest;
				break ;
			case 2:
				highest = interest;
				break ;
			
			default :
				break ;
			}
			totalInterest=totalInterest + interest;


		}
		System.out.println("Total Interest : " +totalInterest);
		System.out.println("Highest Interest : " +highest);
		System.out.println("Lowest Interest : " +lowest);
		System.out.println("Average Interest : " +(totalInterest/N));
		System.out.println("Number of accounts with no interest : " +nointerest);
		




	}

}