package p2558.pickGifts;

public class Main {
    public static void main(String[] args) {
        int[] arr = {25,64,9,4,100};
        int k = 4;
        Solution picker = new Solution();
        long gifts = picker.gifts(arr, k);
        System.out.println(gifts);
    }
}