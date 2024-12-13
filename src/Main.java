public class Main {
    public static void main(String[] args) {
        int[] arr = {25,64,9,4,100};
        int k = 4;
        pickGifts picker = new pickGifts();
        long gifts = picker.gifts(arr, k);
        System.out.println(gifts);
    }
}