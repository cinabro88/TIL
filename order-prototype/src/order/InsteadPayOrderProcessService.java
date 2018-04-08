package order;

import domain.OrderTransaction;
import repository.OrderTransactionRepository;

public class InsteadPayOrderProcessService implements OrderProcessService {
    private OrderTransactionRepository orderTransactionRepository = new OrderTransactionRepository();

    @Override
    public OrderResult order(Object orderRequest) {
        OrderTransaction transaction = orderTransactionRepository.create();
        transaction.start(15);
        return new OrderResult("success", transaction.getId(), "https://order-gw.baemin.com/instead");
    }
}
