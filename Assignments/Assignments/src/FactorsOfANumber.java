public class FactorsOfANumber {
    public static void main(String[] args) {
        int number = 36; // the number whose factors are to be calculated
        System.out.print("Factors of " + number + " are: ");

        // loop to iterate up to the square root of the given number
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.print(i + " ");

                // if i is not the square root of the number, print the other factor
                if (i != Math.sqrt(number)) {
                    System.out.print(number / i + " ");
                }
            }
        }
    }
}
