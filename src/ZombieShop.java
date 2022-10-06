import com.sun.jdi.ShortType;

import java.util.Iterator;
import java.util.Scanner;

public class ZombieShop {
    private static String[] weapons = {"Shotgun", "AK-47", "Sniper"};
    private static int numbers[] = {1, 2, 3};
    private static String[] cart = new String[100];

    private static int quantity[] = new int[100];
    private static int subtotal[] = new int[100];
    private static int[] price = {1500, 2700, 4750};
    private static int index = 0;
    private static int cartIndex = 0;
    private static int grandTotal;
    private static char opWeap;


    private static char yesNo = 'y';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (yesNo == 'y') {
            System.out.println("Welcome to Zombie Killer Shop" + "\n");
            System.out.println("What do you want to buy? Please choose your weapon");
            index = 0;
            while (index < weapons.length) {
                displayItem(index);
                index++;
            }
            opWeap = scanner.next().charAt(0);
            System.out.println("How many would you like to order?");
            quantity[cartIndex] = scanner.nextInt();
            System.out.println("You entered " + quantity[cartIndex] + "." + "\n");

            if (opWeap == '1') {
                cart[cartIndex] = weapons[0];
                subtotal[cartIndex] = price[0] * quantity[cartIndex];
                System.out.println(weapons[0] + "- " + price[0]);
            } else if (opWeap == '2') {
                cart[cartIndex] = weapons[1];

                subtotal[cartIndex] = price[1] * quantity[cartIndex];
                System.out.println(weapons[1] + "- " + price[1]);
            } else if (opWeap == '3') {
                cart[cartIndex] = weapons[2];
                subtotal[cartIndex] = price[2] * quantity[cartIndex];
                System.out.println(weapons[2] + "- " + price[2]);
            }


            System.out.println("Would you like to order again? y/n?");
            yesNo = scanner.next().charAt(0);
            System.out.println();
            cartIndex++;
        }
        index = 0;
        while (index < cartIndex) {
            displayOrders();
            grandTotal += subtotal[index];

            index++;
        }
        System.out.println("Your Grand Total is: " + grandTotal);
    }


    public static void displayItem(int index) {
        System.out.println("ENTER " + numbers[index] + " for " + weapons[index] + " - " + price[index]);
    }

    public static void displayOrders() {
        System.out.println("You ordered " + cart[index] + " price is " + (subtotal[index] + "\n"));

    }
}
