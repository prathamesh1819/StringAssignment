// WAP to remove Duplicates from a String.(Take any String ex with duplicates character)

import java.lang.annotation.Target;
import java.util.*;

public class one {

        public static void main(String[] args) 
        {

                Scanner sc = new Scanner(System.in);
                
                //String input
                String s1 = new String();
                System.out.print("enter a string:- ");
                s1 = sc.nextLine();

                //creating newstring to store nonrepeated characters
                StringBuilder newstring = new StringBuilder();

                //logic
                for (int i = 0; i < s1.length(); i++) {
                        char ch = s1.charAt(i);
                        int index = s1.indexOf(ch, i + 1);
                        if (index == -1) {
                                newstring = newstring.append(ch);
                        }

                }

                System.out.println(newstring);

        }

}
