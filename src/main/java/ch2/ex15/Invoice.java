package ch2.ex15;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Fully implement the Invoice class in Section 2.6.1, “Static Nested Classes”
 * (page 85). Provide a method that prints the invoice and a demo program
 * that constructs and prints a sample invoice.
 */

public class Invoice {

    private Date date;
    private int invoiceNumber;
    private int amountOfItems;
    static int totalNumber;
    private ArrayList<Item> items = new ArrayList<>();

    public Invoice(){
        date = new Date();
        totalNumber += 1;
        invoiceNumber  = totalNumber;
    }

    private static class Item {
        String description;
        int quantity;
        double unitPrice;
        int number;

        Item(String description, int quantity, double unitPrice){
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }

        String getNumber(){ return number + ". "; }

        double price() {
            return quantity * unitPrice;
        }

        @Override
        public String toString() {
            return  description + "  " + quantity + " x " + unitPrice + "$ = " + price() + "$";
        }
    }

    public void addItem(String description, int quantity, double unitPrice) {
        Item newItem = new Item(description, quantity, unitPrice);
        newItem.number = this.amountOfItems + 1;
        items.add(newItem);
        this.amountOfItems = newItem.number;
    }

    public void print() {
        if (items.isEmpty()) {
            System.out.println("Invoice Nr " + invoiceNumber + " is empty. Nothing to print");
        }
        else{
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            System.out.println("Invoice Nr " + invoiceNumber +" from " + format.format(date));
            double total = 0;
            for (Item item : items) {
                System.out.println(item.getNumber() + item.toString());
                total += item.price();
            }
            System.out.println("Total: " + total);
        }
    }
}
