//WAP to count the number of consonants, vowels, special characters in a String.

import java.util.*;

public class four {
	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in); 

        //String input
        String str = new String();
        System.out.print("enter a string:- ");
        str = sc.nextLine();

        //Declaration of variables
        int vowels = 0;
        int constant = 0;
        int special = 0;

        for (int i = 0; i < str.length(); i++)

        {
                if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z' ) 
                {

                        if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'|| str.charAt(i) == 'O' || str.charAt(i) == 'U' ||
                            str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'|| str.charAt(i) == 'o' || str.charAt(i) == 'u') 
                        {
                                vowels++;
                        }
                        else
                        constant++;
                }
        
                else
                special++;

                

        }
                System.out.println("total numbers of vowels:- "+vowels);
                System.out.println("total numbers of constants:- "+constant);
                System.out.println("total numbers of special character:- "+special);
	}

}
