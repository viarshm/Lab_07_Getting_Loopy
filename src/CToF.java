import java.util.Scanner;

public class CToF {
    public static void main(Task01[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter your temperature in degrees celsius: ");
            double tempC = 0;
            if (input.hasNextDouble()) {
                tempC = input.nextDouble();
                double tempF = (tempC * 1.80) + 32;

                System.out.println("Your temperature in celsius is " + tempC);
                System.out.println("Your temperature in fahrenheit is " + tempF);
                break;
                // means the loop is done if valid

            } else {
                System.out.println("invalid input, please enter a valid temperature");
                input.nextLine();
            }
        } while (true);

        input.close();
    }
}