import javax.print.attribute.standard.PresentationDirection;

/**
 * TODO:  Комментарии с описанием класса
 */
public class Palindrome {
    /**
     * TODO:  Комментарии с описанием метода
     */
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            String s1=reverseString(s);
            boolean temp=true;
            temp=isPalindrome(s,s1);
            if(temp==true){
                System.out.println("Слово является полиндромом!");
            }
            else{
                System.out.println("Слово не явлеятся полиндромом!");
            }
            // TODO:  определить палиндром ли это и вывести на консоль
            // результат.  Поместите s в двойные кавычки при выводе
            // на консоль.
        }
    }

    public static String reverseString(String s) {
        String str = "";
        for (int i = s.length()-1; i >= 0; i--) {
            str += s.charAt(i);
        }
        System.out.println(str);
        return str;
    }

    public static boolean isPalindrome(String s, String s1) {
        boolean a = false;

        if (s1.equals(s) == true) {
            a = true;
        } else {
            a = false;
        }
        return a;
    }


}