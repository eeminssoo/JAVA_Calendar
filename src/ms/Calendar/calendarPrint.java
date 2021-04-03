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
			cd.nowCal();
			System.out.println("+----------------------+");
			System.out.println("| 1. 일정 등록   ");
			System.out.println("| 2. 일정 검색");
			System.out.println("| 3. 일정 변경");
			System.out.println("| 4. 달력 보기");
			System.out.println("| h. 도움말 q. 종료");
			System.out.println("+----------------------+");
			System.out.println("명령 (1, 2, 3, 4, h, q)");
			System.out.print("> ");
			
			String inputVal = scanner.nextLine();
			if(inputVal.equals("1"))
			{
				System.out.println("[일정 등록] 날짜를 입력하세요.");
				System.out.print("> ");
				String dateVal = scanner.nextLine();
				System.out.println("일정을 입력하세요.");
				System.out.print("> ");
				String todoVal = scanner.nextLine();
				
				cd.inputCal(dateVal, todoVal);
				System.out.println("일정이 등록되었습니다.");
				continue;
			}
			else if(inputVal.equals("2"))
			{
				System.out.println("[일정 검색] 날짜를 입력하세요.");
				System.out.print("> ");
				String dateVal = scanner.nextLine();
				
				cd.getCal(dateVal);
				continue;
			}
			else if(inputVal.equals("3"))
			{
				System.out.println("[일정 변경] 날짜를 입력하세요.");
				System.out.print("> ");
				String dateVal = scanner.nextLine();
				System.out.println("변경할 일정 번호를 입력하세요.");
				System.out.print("> ");
				String todoListVal = scanner.nextLine();
				System.out.println("일정을 입력하세요.");
				System.out.print("> ");
				String todoVal = scanner.nextLine();
				
				cd.editCal(dateVal, todoListVal, todoVal);
				System.out.println("일정이 변경되었습니다.");
				continue;
			}
			else if(inputVal.equals("4"))
			{
				System.out.println("[달력 보기] 날짜를 입력하세요.");
				System.out.print("> ");
				String dateVal = scanner.nextLine();
				
				cd.hadCal(dateVal);
				continue;
			}
			else if(inputVal.equals("h"))
				break;
			else
				break;
			
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
