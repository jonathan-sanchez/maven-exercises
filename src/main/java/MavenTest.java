
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter something: ");
        String str = sc.nextLine();

        System.out.println("You entered: " + StringUtils.isNumeric(str));
        System.out.println(str + " is a number = " + StringUtils.isNumeric(str));
        System.out.println(str + " Flipped case: " + StringUtils.swapCase(str));
        System.out.println("Reversed: " + StringUtils.reverse(str));
    }
}
