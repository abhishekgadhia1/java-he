package practice;

import java.util.Scanner;

public class PalindromicStringLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String rev = "";
        
        for(int i=0; i<s.length();i++)
        {
        	if(!Character.isLowerCase(s.charAt(i)))
        	{
        		System.out.println("Input string should have lowercase letters only");
        		System.exit(0);
        	}
        }

        for(int i=s.length()-1; i>=0; i--)
        {
            rev = rev + s.charAt(i);
        }

        if(s.equals(rev))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }

	}

}
