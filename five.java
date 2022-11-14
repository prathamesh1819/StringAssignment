//WAP to implement Anagram Checking least inbuilt methods being used.

import java.util.*;

public class five {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                // Declaration of string variable
                String str1 = new String();
                String str2 = new String();

                // taking string input from user
                System.out.print("enter first string:- ");
                str1 = sc.nextLine();
                System.out.print("enter second string:- ");
                str2 = sc.nextLine();

                // conversion of string to char array
                char[] ch1 = str1.toCharArray();
                char[] ch2 = str2.toCharArray();

                // sorting array
                Arrays.sort(ch1);
                Arrays.sort(ch2);
                int count = 0;

                for (int i = 0; i < ch2.length; i++) {
                        if (ch1[i] == ch2[i]) {
                                count++;
                        }

                }
                if (count == ch1.length && count == ch2.length) {
                        System.out.println("ANGRAM");

                } else
                        System.out.println("NOT ANGRAM");

        }// end of main method

}
