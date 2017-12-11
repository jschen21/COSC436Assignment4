package com.cosc483.assignment4.UserInterface;

import com.cosc483.assignment4.Aggregations.Aggregator;
import com.cosc483.assignment4.Aggregations.Orders;
import com.cosc483.assignment4.SystemInterface.SystemInterface;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        boolean cont = true;

        while(cont){
            Scanner cin = new Scanner(System.in);
            String[] str;
            displayMenu();
            System.out.print("Select an option: ");
            int option = getMenuOption(cin);
            switch(option){
                case 1:
                    str = SystemInterface.getMenu();
                    displayOutput(str);
                    System.out.println();
                    break;
                case 2:
                    str = SystemInterface.getMenu();
                    displayOutput(str);
                    System.out.println();
                    boolean cont2 = true;
                    int[] arr = new int[100];
                    int temp = 0;
                    while(cont2){
                        System.out.print("Enter the item number of the item you want: ");
                        arr[temp] = getMenuItem(cin);
                        temp++;
                        System.out.print("Item added!\n Would you like to add more items? (y/n): ");
                        String more = cin.next();
                        if(more.equalsIgnoreCase("y")) continue;
                        else cont2 = false;
                    }
                    str = SystemInterface.submitOrder(arr);
                    displayOutput(str);
                    System.out.println();
                    break;
                case 3:
                    str = SystemInterface.getOrder();
                    displayOutput(str);
                    System.out.println("Total: $" + SystemInterface.getTotal());
                    System.out.println();
                    break;
                case 4:
                    cont = false;
                    System.exit(0);
            }
            System.out.print("Would you like to continue? (y/n): ");
            String temp = cin.next();
            if(temp.equalsIgnoreCase("y"))
                System.out.println();
            else cont = false;
        }
    }

    public static  void displayMenu(){
        System.out.println("OPTIONS:");
        System.out.println("1 - Display Menu");
        System.out.println("2 - Order Items");
        System.out.println("3 - Show Current Order");
        System.out.println("4 - Exit");
    }

    public static int getMenuOption(Scanner scan){
        int temp = scan.nextInt();
        while(temp > 4 || temp < 1){
            System.out.println();
            System.out.print("Please enter an option: ");
            temp = scan.nextInt();
        }
        return temp;
    }

    public static void displayOutput(String[] str){
        int x = 0;
        while(str[x] != null){
            System.out.println(str[x]);
            x++;
        }
    }

    public static int getMenuItem(Scanner scan){
        int temp = scan.nextInt();
        while(temp > 21 || temp < 1){
            System.out.println();
            System.out.print("Please enter an option: ");
            temp = scan.nextInt();
        }
        return temp;
    }
}
