// Write A function to generate a list of prime numberswithin a given range.

public class List_of_primeno {

    public static void generatePrimes(int start, int end) {

        System.out.print("Prime Numbers: ");

        for (int num = start; num <= end; num++) {

            if (num > 1) {
                boolean isPrime = true;

                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.print(num + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        generatePrimes(1, 20);
    }
}