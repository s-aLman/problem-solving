package practice.Recursion.easy.Adhoc;

public class CheckPalindrome {
    static boolean checkPalindromeUsingRecursion(String str) {
        int len = str.length();
        if (len == 1)
            return true;
        if(len == 2)
        {
            if(str.charAt(0) == str.charAt(len - 1))
                return true;
            else
                return false;
        }
        if (str.charAt(0) == str.charAt(len - 1)) {
            return checkPalindromeUsingRecursion(str.substring(1, len - 1));
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "aba";
        if (checkPalindromeUsingRecursion(str))
            System.out.println("String is Palindrome...");
        else
            System.out.println("Not a Palindrome");
    }
}
