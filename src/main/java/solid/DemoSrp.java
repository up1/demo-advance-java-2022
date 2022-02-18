package solid;

public class DemoSrp {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService() {
            @Override
            public void doSth() {
                System.out.println("Not real, for testing");
            }
        };
        // Depednency Injection
        // 1. Constructor Injection
        OrderBusiness orderBusiness = new OrderBusiness(paymentService);
        // 2. Setter Injection
//        orderBusiness.setPaymentService(paymentService);
        // 3. Method Injection
//        orderBusiness.process(paymentService);
        // 4. Interface Injection
        orderBusiness.process();
    }
}

class OrderBusiness {
    private final PaymentService paymentService;

    public OrderBusiness(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    void process() {
        paymentService.doSth();
    }
}

class PaymentService {
    public void doSth() {
        throw new RuntimeException("Not done");
    }
}
