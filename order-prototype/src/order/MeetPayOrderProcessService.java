package order;

import domain.OrderTransaction;
import postorder.PostOrderService;
import repository.OrderTransactionRepository;

public class MeetPayOrderProcessService implements OrderProcessService {
    private OrderTransactionRepository orderTransactionRepository = new OrderTransactionRepository();
    private PostOrderService postOrderService = new PostOrderService();

    @Override
    public OrderResult order(Object orderRequest) {
        OrderTransaction transaction = orderTransactionRepository.create();
        transaction.start();

        postOrderService.process();

        return new OrderResult("sucess", transaction.getId(), "https://order-gw.baemin.com/finish");
    }
}
