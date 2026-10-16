/*
Create a Java application named sandwich-shop. This will be a point-of-sale (POS)
application to calculate the cost of a sandwich.
Remember: When creating a new Java project, create a new git repository and commit
your changes often! Don’t forget to push to github.com. Always share your IntelliJ
project to GitHub
Step 1
Prompt the user for the size of the sandwich (1 or 2):
a. 1: Regular: base price $5.45
b. 2: Large: base price $8.95
Prompt the user for their age:
a. Student (17 years old or younger) – receive a 10% discount
b. Seniors (65 years old or older) – receive a 20% discount
c. Everyone else won't receive a discount
Display the cost of the sandwich to the screen
Step 2
1. Ensure all your changes are committed and pushed to GitHub
2. Send your repository URL to your Instruct
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Asking user which size?
        System.out.println("Welcome to the sandwich shop!!\n"
            + "what size would you like to get?\n"
            + "1: Regular: base price $5.45\n"
            + "2: Large: base price $8.95");
        String sandwichSize = scanner.nextLine();

        //figuring out what size, and price user choose
        // is regular or large, What price it is??
        final double sandwichPrice;
        if(sandwichSize.equalsIgnoreCase("Regular")){
            sandwichPrice = 5.45;
        } else if(sandwichSize.equalsIgnoreCase("Large")){
            sandwichPrice = 8.95;
        } else {
            System.out.println("Invalid sandwich size");
            return;
        }

        //What age does the user have?
        System.out.println("How old are you? \n"
                + "Student (17 years old or younger) – receive a 10% discount\n"
                + "Seniors (65 years old or older) – receive a 20% discount \n"
                + "Everyone else won't receive a discount");
        int age = Integer.parseInt(scanner.nextLine());

       //Trying to apply abstraction here
        double discount = Discount(age);

        //Last calculation and output
        double finalPrice = sandwichPrice * (1 - discount);

        System.out.printf("Your final price is $%.2f%n", finalPrice);
    }

    //Making a discount method probablu could have some improvement...
    public static double Discount (int age){
        double discount;
        if(age >= 65) {
            discount = 0.20;
            return discount;
        }

        if (age <= 17) {
            discount = 0.10;
            return discount;

        }
        return 0.0;

    }
}
