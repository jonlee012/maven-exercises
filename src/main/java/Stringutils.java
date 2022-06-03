import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Stringutils {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);
        if (StringUtils.isNumeric(userInput)) {
            System.out.println("This is a number");
        } else {
            System.out.println("This is not a number");
        }
        if (StringUtils.isNumeric(userInput)) {
            System.out.println("Can not swap a case that is a numeric value");
        } else {
            String swappedUserInput = StringUtils.swapCase(userInput);
            System.out.println(swappedUserInput);
        }
        String reversedUserInput = StringUtils.reverse(userInput);
        System.out.println(reversedUserInput);
    }
}
