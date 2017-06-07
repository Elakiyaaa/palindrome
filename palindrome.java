package jack;

import java.util.Scanner;

public class palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("ENTER THE NUMBER:" );
		Scanner s=new Scanner(System.in); 
		int a=s.nextInt();
		int rev,d=0,temp;
		temp=a;
		while(a>0){
			rev=a%10;
			d=(d*10)+rev;
			a=a/10;
		}
		if(d==temp)
			System.out.print("PALINDROME");
		else
			System.out.print("NOT A PALINDROME");
	}

	}

