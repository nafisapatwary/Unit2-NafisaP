// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your first Coordinate Point: ");
        String c1 = s.nextLine();
        System.out.println("Enter your second Coordinate Point: ");
        String c2 = s.nextLine();
/////////////////////////////////////////////////////////////////////////////////////////////////
        int c1IndexComma = c1.indexOf(",");
        int c1IndexClosePar = c1.indexOf(")"); // find numbers in coord points

        String c1x_string = c1.substring(1, c1IndexComma); // 1 is the index of the parentheses, so we want to find what's in between the parentheses and the comma cause that's the number (x value)
        String c1y_string = c1.substring(c1IndexComma + 1, c1IndexClosePar); // we add 1 to the comma index to get the character after the comma, and then take the value between that and the closing parentheses
        int c1x = Integer.parseInt(c1x_string);
        int c1y = Integer.parseInt(c1y_string);

        int c2IndexComma = c2.indexOf(",");
        int c2IndexClosePar = c2.indexOf(")");

        String c2x_string = c2.substring(1, c2IndexComma);
        String c2y_string = c2.substring(c2IndexComma + 1, c2IndexClosePar);
        int c2x = Integer.parseInt(c2x_string);
        int c2y = Integer.parseInt(c2y_string);
/////////////////////////////////////////////////////////////////////////////////////////////////
        LinearEquation coords = new LinearEquation(c1x, c1y, c2x, c2y);
        String info = coords.toString();
        System.out.println(info);

        System.out.println("Enter a new x value: ");
        String newxString = s.nextLine();
        double newx = Double.parseDouble(newxString);
        String newPoint = coords.solveForPoint(newx);
        System.out.println(newPoint);

    }
}