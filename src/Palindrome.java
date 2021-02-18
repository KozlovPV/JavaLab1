import javax.print.attribute.standard.PresentationDirection;

public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPalindrome(s)) {
                System.out.println(s + " Слово является полиндромом!");
            } else {
                System.out.println(s + " Слово не явлеятся полиндромом!");
            }
        }
    }

    public static String reverseString(String s) {
        String str = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            str += s.charAt(i);
        }
        return str;
    }

    public static boolean isPalindrome(String s) {
        String s1=reverseString(s);
        return s1.equals(s);
    }
}