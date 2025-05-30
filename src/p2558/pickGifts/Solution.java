package p2558.pickGifts; /**
 * 2558. Take Gifts From the Richest Pile
 * You are given an integer array gifts denoting the number of gifts in various piles. Every second, you do the following:
 * :)
 *     Choose the pile with the maximum number of gifts.
 *     If there is more than one pile with the maximum number of gifts, choose any.
 *     Leave behind the floor of the square root of the number of gifts in the pile. Take the rest of the gifts.
 * :)
 * Return the number of gifts remaining after k seconds.
 */


import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public long gifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long remainingGifts = 0;
        for (int i : gifts){
            pq.add(i);
        }
        for (int i = 0; i<k;i++){
            //noinspection DataFlowIssue
            pq.add((int) Math.sqrt(pq.poll()));
        }
        for (int i : pq){
            remainingGifts+=i;
        }
        return remainingGifts;
    }
}
