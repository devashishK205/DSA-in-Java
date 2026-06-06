public class StringCompression {

    public static String compress(String str) {
        String compressed = "";
        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            compressed = compressed + str.charAt(i) + count;
            count = 1;
        }

        return compressed;
    }

    public static void main(String[] args) {
        String input = "aaabbbcccc";

        String output = compress(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}
