package practice;

import java.util.Scanner;

public class Number42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner scanner = new Scanner(System.in);
//		
//		while(scanner.hasNext())
//		{
//			int num = scanner.nextInt();
//			if(num==42)
//			{
//				break;
//			}
//			System.out.println(num);
//		}
		
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			int num = scanner.nextInt();
			if(num!=42)
			{
				System.out.println(num);
			}
			else
			{
				break;
			}
		}
		
		scanner.close();
		

	}

}
