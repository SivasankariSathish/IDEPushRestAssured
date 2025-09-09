package Day3;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ProgramPractice1 {
	
	//@Test
	void reverseStringTry()
	{
		System.out.println("Enter a variable to reverse");
	Scanner sc= new Scanner(System.in);
	String word=sc.nextLine();
	String reverse ="" ;
	for(int i=word.length()-1;i>=0;i--)
	{
		reverse = reverse + word.charAt(i);
	}
	System.out.println(reverse);
	}

	//@Test
	void palindromeTry()
	{
		System.out.println("Enter a string to check palindrome or not");
		Scanner sc= new Scanner(System.in);
		String word=sc.nextLine();
		String reverse ="" ;
		for(int i=word.length()-1;i>=0;i--)
		{
			reverse = reverse + word.charAt(i);
		}
		if(word.equals(reverse))
		{
			System.out.println("The given string is Palindrome");
		}
	   else
	   {
		   System.out.println("The given sting is not a Palindrome");
	   }
	
	}
	
	//@Test
	void vowelPresentCheck()
	{
		
		System.out.println("Enter a string to check vowel is present");
		Scanner sc= new Scanner(System.in);
		String word=sc.nextLine();
		int vowel=0;
		/*if(word.toLowerCase().matches(".*[aeiou].*"))
		{
			System.out.println("Vowel is present");
		}
		else
		{
			System.out.println("Vowel is not present");
		}*/
		for(int i=0;i<word.length();i++)
		{
			char c=word.charAt(i);
			if((c=='a')||(c=='A'))
			{
				vowel=1;
				break;
			}
			else if((c=='e')||(c=='E'))
			{
				vowel=1;
				break;
			}
			else if((c=='i')||(c=='I'))
			{
				vowel=1;
				break;
			}
			else if((c=='o')||(c=='O'))
			{
				vowel=1;
				break;
			}
			else if((c=='u')||(c=='U'))
			{
				vowel=1;
				break;
			}
		}
			if(vowel==1)
			{
				System.out.println("Vowel is present in given String");
			}

			else
			{
				System.out.println("Vowel is not present in given String");
			}
		
		
		
	}
	//@Test
	
	void primeNumberCheck()
	{
		System.out.println("Enter a value to check prime or not");
		Scanner sc= new Scanner(System.in);
		int value=sc.nextInt();
		boolean prime;
		if(value==0||value==1)
		{
			prime=false;
			
		}
		else if(value==2)
		{
			prime=true;
		}
		for(int i=2;i<=value-1;i++) {
			if(value%i==0)
			{
				prime=false;
			    break;
			}
		}
		if(prime=true)
			System.out.println("Its a prime number");
		else
			System.out.println("Not a prime number");
	}
	
		
	//@Test
	void fibonacceiSeries()
	{
		int a=0;
		int b=1;
		int c=1;
		System.out.println("Enter a finbonacci series sequence");
		Scanner sc= new Scanner(System.in);
		int fibo=sc.nextInt();
		for (int i=1;i<=fibo;i++)
		{
			System.out.println(a);
			a=b;
			b=c;
			c=a+b;
		}
		
	}
	//@Test
	void swapNumberCheck()
	{
		System.out.println("Enter a value a:");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();

		System.out.println("Enter a value b:");
		
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(" value of a:"+a);
		System.out.println(" value of a:"+b);
	}
}
