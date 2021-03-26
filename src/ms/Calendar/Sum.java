package ms.Calendar;

import java.util.Scanner;

public class Sum {
	public static int sumCal(int num1, int num2)
	{
		return num1 + num2;
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 수를 입력하세요. :");
		String inputVal = scanner.nextLine();
		String[] splitVal = inputVal.split(" ");
		
		int first = Integer.parseInt(splitVal[0]);
		int second = Integer.parseInt(splitVal[1]);
		
		System.out.println("두 수의 합은"+sumCal(first,second)+"입니다.");
		
	}
}
