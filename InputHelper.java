import java.util.Scanner;

public class InputHelper {

    private static Scanner sc = new Scanner(System.in);

    public static String getString(String prompt) {

        while (true) {

            System.out.print(prompt);
            String input = sc.nextLine();

            return input;

        }
        
    }

    public static String getString(String prompt, String pattern) {

        while (true) {

            System.out.print(prompt);
            String input = sc.nextLine();

           if (input.matches(pattern)) {
               return input;
            }
            
            
            System.out.println("Invalid input. Input must match: " + pattern);

        }
        
    }
        
    
    public static double getDouble(String prompt, double min, double max) {

        while (true) {

            System.out.print(prompt);
            String input = sc.nextLine();

            try {

                double doubleIn = Double.parseDouble(input);

                if (min <= doubleIn && doubleIn <= max)
                    return doubleIn;

                System.out.printf("Invalid Input, range is: %f - %f\n", min, max);

            } catch (NumberFormatException e) {
                System.out.println("Invalid input, enter a double");
            }

        }

    }

    public static double getDouble(String prompt) {

        while (true) {

            System.out.print(prompt);
            String input = sc.nextLine();

            try {

                double doubleIn = Double.parseDouble(input);

                return doubleIn;

            } catch (NumberFormatException e) {
                System.out.println("Invalid input, enter a double");
            }

        }

    }

        public static int getInt(String prompt, int min, int max) {

        while (true) {

            System.out.print(prompt);
            String input = sc.nextLine();

            try {

                int intIn = Integer.parseInt(input);

                if (min <= intIn && intIn <= max)
                    return intIn;

                System.out.printf("Invalid Input, range is: %d - %d\n", min, max);

            } catch (NumberFormatException e) {
                System.out.println("Invalid input, enter a double");
            }

        }

    }
    
}