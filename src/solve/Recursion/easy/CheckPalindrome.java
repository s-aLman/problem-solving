package solve.Recursion.easy;

public class CheckPalindrome {
    static boolean checkPalindromeUsingRecursion(String str) {
        int len = str.length();
        if (len == 1)
            return true;
        if (str.charAt(0) == str.charAt(len - 1)) {
            return checkPalindromeUsingRecursion(str.substring(1, len - 1));
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "abacba";
        if (checkPalindromeUsingRecursion(str))
            System.out.println("String is Palindrome...");
        else
            System.out.println("Not a Palindrome");
    }
}
