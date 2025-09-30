package structural.facadePattern;


// Facade: Simplifies all subsystems
public class OrderFacade {
    private PaymentService paymentService;
    private ShippingService shippingService;
    private InvoiceService invoiceService;

    public OrderFacade() {
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
        this.invoiceService = new InvoiceService();
    }
    public void placeOrder(String account, String product, double amount) {
        System.out.println("Placing order for: " + product);
        paymentService.makePayment(account, amount);
        shippingService.shipProduct(product);
        invoiceService.generateInvoice(product);
        System.out.println("Order placed successfully!");
    }
}