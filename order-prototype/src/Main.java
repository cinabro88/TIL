import order.OrderProcessFactory;
import order.OrderResult;
import order.PaymentGroup;

public class Main {

    private static OrderProcessFactory factory = new OrderProcessFactory();

    public static void main(String[] args) {
        System.out.println("\n\n>> 바로결제요청");
        OrderResult baroResult = factory.getOrderProcessService(PaymentGroup.BAROPAY).order(null);
        System.out.println("<< " + baroResult);


        System.out.println("\n\n>> 만나서결제요청");
        OrderResult meetResult = factory.getOrderProcessService(PaymentGroup.MEETPAY).order(null);
        System.out.println("<< " + meetResult);

        System.out.println("\n\n>> 대신결제요청");
        OrderResult insteadResult = factory.getOrderProcessService(PaymentGroup.INSTEADPAY).order(null);
        System.out.println("<< " + insteadResult);
    }
}
