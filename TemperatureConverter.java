import java.util.Scanner;

/**
 * TemperatureConverter from Celcius to Fahrenheit and Kelvin
 * Fahrenheit = (Celcius * 9/5) + 32
 * Kelvin = Celcius + 273.15
 * 
 * @author KincaidBD
 * @version 1.0.0
 * @since 26/10/05
 */

public class TemperatureConverter {

    private static void main(String[] args) {
        // initialize scanner to read input from user
        Scanner scanner = new Scanner(System.in);
        int celcius;
        // prompt user for temperature in Celcius
        System.out.print("Enter temperature in Celcius: ");
        // try and catch statement in case the input is not a int
        try {
            celcius = scanner.nextInt();
        } catch (Exception e) {
            // ends program if error occurs and prints error message
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.close();
            return;
        }
        // math for converting Celcius to Fahrenheit and Kelvin
        double fahrenheit = (celcius * 9.0 / 5.0) + 32;
        double kelvin = celcius + 273.15;
        // print the results to the console
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        System.out.println("Temperature in Kelvin: " + kelvin);
        // to stop resource leak close scanner
        scanner.close();
    }
}