//WAP to check if “2552” is palindrome or not.

public class three {

        public static void main(String[] args) {

                String str = "2552";
                String target = "";

                for (int i = str.length() - 1; i >= 0; i--) {
                        target += str.charAt(i);

                }

                if (str.equals(target)) {
                        System.out.println("palindrom");
                } else
                        System.out.println("not palindrom");

        }

}
