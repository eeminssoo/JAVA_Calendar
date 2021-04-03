package ms.Calendar;

import java.util.ArrayList;
import java.util.HashMap;


public class calendar {
	
	private static int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static final String[] dayName = {"SU","MO","TU","WE","TH","FR","SA"};
	private static HashMap<String, ArrayList<String>> cld = new HashMap<String,ArrayList<String>>();
	
	public static boolean isleapYear(int year)
	{
		return year%100 != 0 && year % 4 ==0 || year % 400 ==0 ? true : false;
	}
	
	public static int getDay(int year, int month)
	{
		return isleapYear(year) && month ==2 ? 29 : days[month - 1];
	}
	
	
	public static String getweekDayName(int year, int month)
	{
		int count = 0;
		if(isleapYear(year))
			days[1] = 29;
		for(int i=1970; i<year; i++)
		{
			int delta = isleapYear(i)? 366 : 365;
			count += delta;
		}
		for(int i = 1; i<month ; i++)
		{
			count += days[i-1];
		}
		int answer_day = (4+count)%7;
		
		return dayName[answer_day];
		
		/*if(isleapYear(year))
			days[1] = 29;
		
		int total_day = 0;
		for(int i=1; i<month; i++)
		{
			total_day += days[i-1];
		}
		int answer_day = (5+total_day)%7;
		
		return dayName[answer_day];*/
	}
	
	public static int getWeekDay(String weekday)
	{
		if(weekday.equals("SU"))
			return 0;
		else if(weekday.equals("MO"))
			return 1;
		else if(weekday.equals("TU"))
			return 2;
		else if(weekday.equals("WE"))
			return 3;
		else if(weekday.equals("TH"))
			return 4;
		else if(weekday.equals("FR"))
			return 5;
		else if(weekday.equals("SA"))
			return 6;
		else 
			return 0;
	}
	
	public static void inputCal(String date, String todo)
	{
		ArrayList<String> putList = new ArrayList<String>();
		
		if(cld.containsKey(date))
		{
			putList = cld.get(date);
			putList.add(todo);
			cld.put(date, putList);
		}
		else
		{
			putList.add(todo);
			cld.put(date, putList);
		}
		
	}
	
	public static void getCal(String date)
	{
		ArrayList<String> getList = new ArrayList<String>();
		if(cld.containsKey(date))
		{
			getList = cld.get(date);
			
			for(int i=0; i<getList.size(); i++)
			{
				System.out.println((i+1)+"."+getList.get(i));
			}
		}
		else
		{
			System.out.println("일정이 없습니다.");
		}
		
	}
	
	public static void hadCal(String date)
	{
		String [] splitVal = date.split("-");
		
		int year = Integer.parseInt(splitVal[0]);
		int month = Integer.parseInt(splitVal[1]);
		int day = Integer.parseInt(splitVal[2]);
		if(cld.containsKey(date))
		{
			calprint(year, month, day);
		}
		else 
			calprint(year, month);
	}
	
	public static void editCal(String date, String todoNo, String todo)
	{
		ArrayList<String> editList = new ArrayList<String>();
		int todoNoint = Integer.parseInt(todoNo);
		
		if(cld.containsKey(date))
		{
			editList = cld.get(date);
			
			editList.remove(todoNoint-1);
			editList.add(todoNoint-1, todo);
			cld.put(date, editList);
		}
		else
		{
			System.out.println("일정이 없습니다.");
		}
		
	}

	public static void calprint(int year, int month, int day)
	{
		if(month != -1)
		{
			int count = 0;
			int monthdays = getDay(year, month);
			System.out.printf("<<%4d년 %2d월>>\n", year, month);
			System.out.println("  SU  MO  TU  WE  TH  FR  SA");
			System.out.println("  --------------------------");
			for(int i=0; i<getWeekDay(getweekDayName(year,month)); i++)
			{
				System.out.print("    ");
			}
			for(int i=1; i<=7-getWeekDay(getweekDayName(year,month)); i++)
			{
				if(day == i)
				{
					System.out.print(" ");
					System.out.print(" ");
					System.out.print(".");
					System.out.printf("%1d", i);
				}
				else
					System.out.printf("%4d", i);
			}
			System.out.println("");
			for(int i=7-getWeekDay(getweekDayName(year,month))+1; i<=monthdays; i++)
			{
				count++;
				if(day == i)
				{
					System.out.print(" ");
					System.out.print(".");
					System.out.printf("%2d", i);
				}
				else
					System.out.printf("%4d", i);
				
				if((count % 7)== 0 || i == monthdays)
					System.out.println("");
			}
			count = 0;
			/*System.out.println(" 1  2  3  4  5  6  7");
			System.out.println(" 8  9 10 11 12 13 14");
			System.out.println("15 16 17 18 19 20 21");
			System.out.println("22 23 24 25 26 27 28");*/
		}
		
	}
	
	public static void calprint(int year, int month)
	{
		if(month != -1)
		{
			int count = 0;
			int monthdays = getDay(year, month);
			System.out.printf("<<%4d년 %2d월>>\n", year, month);
			System.out.println(" SU MO TU WE TH FR SA");
			System.out.println(" --------------------");
			for(int i=0; i<getWeekDay(getweekDayName(year,month)); i++)
			{
				System.out.print("   ");
			}
			for(int i=1; i<=7-getWeekDay(getweekDayName(year,month)); i++)
			{
				System.out.printf("%3d", i);
			}
			System.out.println("");
			for(int i=7-getWeekDay(getweekDayName(year,month))+1; i<=monthdays; i++)
			{
				count++;
				System.out.printf("%3d", i);
				if((count % 7)== 0 || i == monthdays)
					System.out.println("");
			}
			count = 0;
			/*System.out.println(" 1  2  3  4  5  6  7");
			System.out.println(" 8  9 10 11 12 13 14");
			System.out.println("15 16 17 18 19 20 21");
			System.out.println("22 23 24 25 26 27 28");*/
		}
		
	}
}
