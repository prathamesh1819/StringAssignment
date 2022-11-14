//WAP to print Duplicates characters from the String.

import java.util.*;

public class two {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                // string input
                String str = new String();
                System.out.print("enter a string:- ");
                str = sc.nextLine();

                // conversion of string to charrArray
                char[] ch = str.toCharArray();

                // String to store duplicate characters
                String target = "";

                // logic
                for (int i = 0; i < ch.length; i++) {
                        for (int j = i + 1; j < ch.length; j++) {
                                if (ch[i] == ch[j]) {
                                        target += ch[i];
                                }
                        }

                }

                System.out.println(target);

        }
}
