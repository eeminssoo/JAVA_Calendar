package ms.Calendar;

import java.util.Scanner;

public class calendarPrint {
	
	public static void calprint()
	{
		int monthVal = 0;
		int yearVal = 0;
		Scanner scanner = new Scanner(System.in);
		calendar cd = new calendar();
		
		while(true)
		{
			System.out.println("년, 월을 입력하세요. : ");
			System.out.print("> ");
			
			String inputVal = scanner.nextLine();
			if(inputVal.equals("-1"))
				break;
			
			String[] splitVal = inputVal.split(",");
			int year = Integer.parseInt(splitVal[0]);
			int month = Integer.parseInt(splitVal[1]);
			
			if(month > 12)
				continue;
			
			cd.calprint(year, month);
		}
		
		System.out.println("Have a nice day!");
		scanner.close();
	}
	
	public static void main(String[] args)
	{
		calendarPrint cp = new calendarPrint();
		cp.calprint();
	}
}
