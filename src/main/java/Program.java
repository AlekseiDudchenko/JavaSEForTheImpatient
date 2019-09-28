import ch2.ex15.Invoice;

public class Program {

    public static void main(String[] args){

        Invoice invoice = new Invoice();
        invoice.addItem("Item 1", 2, 10);
        invoice.addItem("Item 2", 1, 50);
        invoice.print();

    }
}
