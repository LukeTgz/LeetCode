package p9.palindromeNumber;

public class Main {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println("121 " + sl.isPalindrome(121));   // expect true
        System.out.println("-121 " + sl.isPalindrome(-121)); // expect false
        System.out.println("10 " + sl.isPalindrome(10));     // expect false
    }
}
