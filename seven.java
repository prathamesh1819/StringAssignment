//WAP to find if String contains all unique characters.
import java.util.*;

public class seven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		String s1=new String();
		System.out.print("enter a string:- ");
		s1=sc.nextLine();

		int count=0; 
		char [] ch=s1.toCharArray();

		for (int i = 0; i <ch.length ; i++) 
		{
			
        for (int j = i+1; j < ch.length; j++) 
			{
				if (ch[i]==ch[j]) {
					count++;
				}
			}
		}

		if (count==0) {
			System.out.println("UNIQE STRING");
		}
		else
		System.out.println("NOTUNIQE STRING");
	}
}
