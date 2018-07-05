package demofor;

import java.util.Scanner;

class into
{
	Scanner ss=new Scanner(System.in);
	void lower()
	{
		String s="THIS IS STRING";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>65 && c<90)
			{
				c=(char)(c+32);
			}
			System.out.print(c);
		}
		System.out.println();
	}	
}
public class Info {
	public static void main(String[] args) {
		into in=new into();
		in.lower();
	}
}