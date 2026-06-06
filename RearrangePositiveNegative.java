import java.util.ArrayList;

public class RearrangePositiveNegative {

    public static void rearrange(int[] arr) {

        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        // Separate positive and negative numbers
        for (int num : arr) {
            if (num >= 0)
                positive.add(num);
            else
                negative.add(num);
        }

        int i = 0, p = 0, n = 0;

        // Merge alternately
        while (p < positive.size() && n < negative.size()) {
            arr[i++] = negative.get(n++);
            arr[i++] = positive.get(p++);
        }

        // Add remaining negative numbers
        while (n < negative.size()) {
            arr[i++] = negative.get(n++);
        }

        // Add remaining positive numbers
        while (p < positive.size()) {
            arr[i++] = positive.get(p++);
        }
    }

    public static void main(String[] args) {

        int[] arr = {-1, 2, -3, 4, 5, -6};

        rearrange(arr);

        System.out.print("Output: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}