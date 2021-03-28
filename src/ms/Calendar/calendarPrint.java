package ms.Calendar;

import java.util.Scanner;

public class calendarPrint {
	
	public static void calprint()
	{
		int inputVal = 0;
		Scanner scanner = new Scanner(System.in);
		calendar cd = new calendar();
		
		while(inputVal != -1)
		{
			System.out.println("월을 입력하세요. : ");
			System.out.print("> ");
			
			inputVal = scanner.nextInt();
			cd.calprint(2021, inputVal);
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
