package p88.mergeSortedArrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int[] store = new int[nums1.length+nums2.length];
        int p1 = 0, p2 = 0;
        for (int i = 0; i < store.length-1; i++){
            if (nums1[p1] < nums2[p2]){
                store[i] = nums1[p1];
                p1++;
            }
            else {
                store[i] = nums2[p2];
                p2++;
            }
        }
        nums1 = store;
    }
}
