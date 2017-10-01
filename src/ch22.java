import java.util.Scanner;

public class ch22 {
    public static void main(String[] Args) {
        System.out.print("              8000000               10000000                12000000                14000000                16000000                18000000" + "\n");

        System.out.print("Listing 22.5  ");
        listing225(8000000 );
        System.out.print("       ");
        listing225(10000000 );
        System.out.print("         ");
        listing225(12000000 );
        System.out.print("       ");
        listing225(14000000 );
        System.out.print("       ");
        listing225(16000000 );
        System.out.print("       ");
        listing225(18000000 );
        System.out.print("\n");
        System.out.print("Listing 22.6  ");
        listing226(8000000 );
        System.out.print("       ");
        listing226(10000000 );
        System.out.print("           ");
        listing226(12000000 );
        System.out.print("       ");
        listing226(14000000 );
        System.out.print("       ");
        listing226(16000000 );
        System.out.print("       ");
        listing226(18000000 );
        System.out.print("\n");
        System.out.print("Listing 22.7  ");
        listing227(8000000 );
        System.out.print("        ");
        listing227(10000000 );
        System.out.print("             ");
        listing227(12000000 );
        System.out.print("        ");
        listing227(14000000 );
        System.out.print("        ");
        listing227(16000000 );
        System.out.print("        ");
        listing227(18000000 );
        System.out.print("\n");
    }

    public static void listing225(Integer n) {
        Scanner input = new Scanner(System.in);
        //System.out.print("Find all prime numbers <= n, enter n: ");

        long startTime = System.nanoTime();
        final int NUMBER_PER_LINE = 10; // Display 10 per line
        int count = 0; // Count the number of prime numbers
        int number = 2; // A number to be tested for primeness

        //System.out.println("The prime numbers are:");

        // Repeatedly find prime numbers
        while (number <= n) {
            // Assume the number is prime
            boolean isPrime = true; // Is the current number prime?

            // Test if number is prime
            for (int divisor = 2; divisor <= (int) (Math.sqrt(number));
                 divisor++) {
                if (number % divisor == 0) { // If true, number is not prime
                    isPrime = false; // Set isPrime to false
                    break; // Exit the for loop
                }
            }

            // Print the prime number and increase the count
            if (isPrime) {
                count++; // Increase the count

                if (count % NUMBER_PER_LINE == 0) {
                    // Print the number and advance to the new line
                    //System.out.printf("%7d\n", number);
                }
                //else
                    //System.out.printf("%7d", number);
            }

            // Check if the next number is prime
            number++;
        }

        //System.out.println("\n" + count +
                //" prime(s) less than or equal to " + n);
        long totalTime = System.nanoTime() - startTime;
        System.out.print(totalTime/1000000.0 + " ms ");
    }

    public static void listing226(Integer n) {
        Scanner input = new Scanner(System.in);
        //System.out.print("Find all prime numbers <= n, enter n: ");


        // A list to hold prime numbers
        long startTime = System.nanoTime();
        java.util.List<Integer> list =
                new java.util.ArrayList<>();

        final int NUMBER_PER_LINE = 10; // Display 10 per line
        int count = 0; // Count the number of prime numbers
        int number = 2; // A number to be tested for primeness
        int squareRoot = 1; // Check whether number <= squareRoot

        //System.out.println("The prime numbers are \n");

        // Repeatedly find prime numbers
        while (number <= n) {
            // Assume the number is prime
            boolean isPrime = true; // Is the current number prime?

            if (squareRoot * squareRoot < number) squareRoot++;
            // Test whether number is prime
            for (int k = 0; k < list.size()
                    && list.get(k) <= squareRoot; k++) {
                if (number % list.get(k) == 0) { // If true, not prime
                    isPrime = false; // Set isPrime to false
                    break; // Exit the for loop
                }
            }

            // Print the prime number and increase the count
            if (isPrime) {
                count++; // Increase the count
                list.add(number); // Add a new prime to the list
                if (count % NUMBER_PER_LINE == 0) {
                    // Print the number and advance to the new line
                    //System.out.println(number);
                }
                //else
                    //System.out.print(number + " ");
            }

            // Check whether the next number is prime
            number++;
        }

        //System.out.println("\n" + count +
                //" prime(s) less than or equal to " + n);
        long totalTime = System.nanoTime() - startTime;
        System.out.print(totalTime/1000000.0 + " ms ");

    }
    public static void listing227(Integer n) {
        //System.out.print("Find all prime numbers <= n, enter n: ");

        long startTime = System.nanoTime();
        boolean[] primes = new boolean[n + 1]; // Prime number sieve

        // Initialize primes[i] to true
        for (int i = 0; i < primes.length; i++) {
            primes[i] = true;
        }

        for (int k = 2; k <= n / k; k++) {
            if (primes[k]) {
                for (int i = k; i <= n / k; i++) {
                    primes[k * i] = false; // k * i is not prime
                }
            }
        }

        int count = 0; // Count the number of prime numbers found so far
        // Print prime numbers
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                count++;
                if (count % 10 == 0) {

                }
                //System.out.printf("%7d\n", i);
                //else
                //System.out.printf("%7d", i);
            }
        }

        //System.out.println("\n" + count +
        //" prime(s) less than or equal to " + n);
        long totalTime = System.nanoTime() - startTime;
        System.out.print(totalTime/1000000.0 + " ms ");
    }

}






