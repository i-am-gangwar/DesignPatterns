package DesignPatterns.structural.facadePattern;

// Subsystem 3: Invoice
public class InvoiceService {
    public void generateInvoice(String product) {
        System.out.println("Invoice generated for: " + product);
    }
}