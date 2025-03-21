package p9.palindromeNumber; /**
 * 9. Palindrome Number
 * https://leetcode.com/problems/palindrome-number/
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 */

import java.util.ArrayList;

public class Solution {
    public boolean isPalindrome(int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int init = x; // store initial value of x
        int reverse = 0;
        if (x < 0) {
            return false;
        }
        while (x > 0) {
            // take mod of x and then divide by ten - getting the digit at each spot, in reverse
            list.add(x % 10);
            x = x / 10;
        }
        for (Integer i : list) {
            // combine the reversed integers back into one number
            reverse = 10 * reverse + i;
        }
        return init == reverse;
    }
}
