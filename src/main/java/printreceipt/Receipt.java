package printreceipt;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Scanner;

public class Receipt {

    public static void printReceipt(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Item name: ");
        String item = scanner.nextLine();

        System.out.print("Quantity purchased: ");
        int qty = scanner.nextInt();

        System.out.print("Price per item: ");
        double price = scanner.nextDouble();

        double total = qty * price;

        Date date = new Date();



        System.out.println("--------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s%n","Name", "Qty", "Price", "Total");
        System.out.printf("%-10s %-10s %-10s %-10s%n", "----", "---", "-----", "-----");
        System.out.printf("%-10s %-10d $%-9.2f $%-9.2f \n", Character.toUpperCase(item.charAt(0)) + item.substring(1), qty, price, total);
        System.out.println(" ");
        System.out.printf("\t\tThank you. Come again! \n");
        System.out.printf("");
        System.out.println();
        System.out.print("Purchased on: ");
        System.out.printf("%tA, %tB %td, %tY" ,date, date, date, date);
        System.out.println("\n--------------------------------------------");



    }

    public static void main(String[] args) {
        printReceipt();
    }
}
