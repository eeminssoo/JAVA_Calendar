/*
 * 반복 입력이 가능하도록 변경
 */

package ms.Calendar;

import java.util.Scanner;

public class monthDay {
	private static final int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static int getdaysOfMonth(int month)
	{
		return days[month - 1];
	}
	
	public static void main(String[] args)
	{
		int inputVal = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(inputVal != -1)
		{
			System.out.println("월을 입력하세요. : ");
			System.out.print("> ");
			
			inputVal = scanner.nextInt();
			if(inputVal > 0 && inputVal <= 12)
				System.out.println(inputVal+"월은 "+getdaysOfMonth(inputVal)+"일까지 있습니다.");
			else 
				System.out.println("잘못된 월을 입력하였습니다.");
		}
		
		System.out.println("Have a nice day!");
		scanner.close();
	}
}
