package ms.Calendar;

import java.util.Scanner;

public class calendarPrint {
	
	public static void calprint()
	{
		int monthVal = 0;
		int yearVal = 0;
		Scanner scanner = new Scanner(System.in);
		calendar cd = new calendar();
		
		boolean isloop = true;
		
		cd.nowCal();
		System.out.println("+----------------------+");
		System.out.println("| 1. 일정 등록   ");
		System.out.println("| 2. 일정 검색");
		System.out.println("| 3. 일정 변경");
		System.out.println("| 4. 달력 보기");
		System.out.println("| h. 도움말 q. 종료");
		System.out.println("+----------------------+");
		
		while(isloop)
		{
			System.out.println("명령 (1, 2, 3, 4, h, q)");
			System.out.print("> ");
			
			String inputVal = scanner.nextLine();
			switch(inputVal)
			{
			case "1" :
				cmdadd(scanner, cd);
				break;
			case "2" :
				cmdsearch(scanner, cd);
				break;
			case "3" :
				cmdedit(scanner, cd);
				break;
			case "4" :
				cmdcalprint(scanner, cd);
				break;
			case "h" :
				break;
			case "q" :
				isloop = false;
				break;	
			}
		}
		System.out.println("Have a nice day!");
		scanner.close();
	}
	
	private static void cmdadd(Scanner s, calendar c)
	{
		System.out.println("[일정 등록] 날짜를 입력하세요.(YYYY-MM-DD)");
		System.out.print("> ");
		String dateVal = s.nextLine();
		System.out.println("일정을 입력하세요.");
		System.out.print("> ");
		String todoVal = s.nextLine();
		
		c.inputCal(dateVal, todoVal);
		System.out.println("일정이 등록되었습니다.");
	}
	
	private static void cmdsearch(Scanner s, calendar c)
	{
		System.out.println("[일정 검색] 날짜를 입력하세요. (YYYY-MM-DD)");
		System.out.print("> ");
		String dateVal = s.nextLine();
		
		c.getCal(dateVal);
	}
	
	private static void cmdedit(Scanner s, calendar c)
	{
		System.out.println("[일정 변경] 날짜를 입력하세요. (YYYY-MM-DD)");
		System.out.print("> ");
		String dateVal = s.nextLine();
		System.out.println("변경할 일정 번호를 입력하세요.");
		System.out.print("> ");
		String todoListVal = s.nextLine();
		System.out.println("일정을 입력하세요.");
		System.out.print("> ");
		String todoVal = s.nextLine();
		
		c.editCal(dateVal, todoListVal, todoVal);
		System.out.println("일정이 변경되었습니다.");
	}
	
	private static void cmdcalprint(Scanner s, calendar c)
	{
		System.out.println("[달력 보기] 날짜를 입력하세요. (YYYY-MM-DD)");
		System.out.print("> ");
		String dateVal = s.nextLine();
		
		c.hadCal(dateVal);
	}
	
	public static void main(String[] args)
	{
		calendarPrint cp = new calendarPrint();
		cp.calprint();
	}
}
