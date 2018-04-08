package order;

import java.util.HashMap;
import java.util.Map;

public class OrderProcessFactory {
    private static Map<PaymentGroup, OrderProcessService> map = new HashMap<PaymentGroup, OrderProcessService>();

    static {
        map.put(PaymentGroup.BAROPAY, new BaroPayOrderProcessService());
        map.put(PaymentGroup.MEETPAY, new MeetPayOrderProcessService());
        map.put(PaymentGroup.INSTEADPAY, new InsteadPayOrderProcessService());
    }

    public OrderProcessService getOrderProcessService(PaymentGroup paymentGroup) {
        return map.get(paymentGroup);
    }
}
