package ch2.ex15;

import org.junit.jupiter.api.Test;

class InvoiceTest {

    @Test
    void addItemTest(){
        Invoice invoice = new Invoice();
        invoice.addItem("Item 1", 2,50);
        invoice.addItem("Item 2", 3,10);
        invoice.print();
    }

    @Test
    void printEmptyInvoice(){
        Invoice invoice = new Invoice();
        invoice.print();
    }

    @Test
    void moreThenOneInvoice(){
        Invoice firstInvoice = new Invoice(), secondInvoice = new Invoice();
        firstInvoice.addItem("Milch", 1, 0.89);
        firstInvoice.addItem("Brotchen", 12,0.45);
        secondInvoice.addItem("Wurst", 1 , 8.75);
        secondInvoice.addItem("Apfelwein", 2, 6.07);
        firstInvoice.print();
        secondInvoice.print();
    }

}