//write a program to count max occurring character in string

import java.util.*;

public class eight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//declaration of string variable and taking input
		String s1 = new String();
		System.out.print("enter a string:- ");
		s1 = sc.nextLine();
		
//conversion of string to char array		
		char[] ch = s1.toCharArray();

//initialization of variables 
		int count = 0;
		int maxcount = 0;
        char maxchar='\0'; 

		for (int i = 0; i < ch.length; i++) 
		{
			count = 0;
			for (int j = i + 1; j < ch.length; j++) 
			{
				if (ch[i] == ch[j]) 
			    {
					count++;
				}
			}

			if (maxcount < count) 
			{
				maxcount = count;
				maxchar = ch[i];
			}
		}
		System.out.println("max repeated character is " + maxchar);
		System.out.println("and it has occured for "+ (maxcount+1) );
	}

}
