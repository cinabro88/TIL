package order;

import domain.OrderTransaction;
import repository.OrderTransactionRepository;
import service.BillingService;

public class BaroPayOrderProcessService implements OrderProcessService {
    private BillingService billingService = new BillingService();
    private OrderTransactionRepository orderTransactionRepository = new OrderTransactionRepository();

    @Override
    public OrderResult order(Object orderRequest) {
        OrderTransaction transaction = orderTransactionRepository.create();
        transaction.start();
        String nextUrl = billingService.pay();
        return new OrderResult("success", transaction.getId(), nextUrl);
    }
}
