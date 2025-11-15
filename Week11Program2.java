package week11;

// Claire Francis, Week11Program2, 11/14/2025

import java.util.Scanner;

public class Week11Program2 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = getValidNumber(input);   
        long result = doubleFactorial(n);

        System.out.println("\n" + n + "!! = " + result);
        input.close();
    }

    public static int getValidNumber(Scanner input) {
        int num = -1;

        System.out.print("Enter a positive integer less than 20: ");

        while (true) {
            if (input.hasNextInt()) {
                num = input.nextInt();

                if (num > 0 && num < 20) {
                    return num; 
                } else {
                    System.out.print("Error: Enter a positive integer < 20: ");
                }
            } else {
                System.out.print("Invalid input. Enter a positive integer < 20: ");
                input.next(); 
            }
        }
    }


    public static long doubleFactorial(int n) {
        if (n <= 1) {    
            return 1;
        }
        return n * doubleFactorial(n - 2);
    }

}
