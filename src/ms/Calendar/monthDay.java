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
		System.out.println("반복횟수를 입력하세요. : ");
		
		Scanner scanner = new Scanner(System.in);
		int inputVal = scanner.nextInt();
		/*
		int[] inputMonth = new int[inputVal];
		System.out.println("월을 입력하세요. : ");
		for(int i=0; i<inputVal; i++)
		{
			inputMonth[i] = scanner.nextInt();
		}
		for(int j=0; j<inputVal; j++)
		{
			if(inputMonth[j] > 0 && inputMonth[j] <= 12)
				System.out.println(inputMonth[j]+"월은 "+getdaysOfMonth(inputMonth[j])+"일까지 있습니다.");
			else 
				System.out.println("잘못된 월을 입력하였습니다.");
		}
		*/
		System.out.println("월을 입력하세요. : ");
		for(int i=0; i<inputVal; i++)
		{
			int inputMonth =  scanner.nextInt();
			if(inputMonth > 0 && inputMonth <= 12)
				System.out.println(inputMonth+"월은 "+getdaysOfMonth(inputMonth)+"일까지 있습니다.");
			else 
				System.out.println("잘못된 월을 입력하였습니다.");
		}
		System.out.println("the end");
		scanner.close();
	}
}
