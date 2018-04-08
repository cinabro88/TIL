package repository;

import domain.OrderTransaction;

public class OrderTransactionRepository {
    public OrderTransaction create() {
        System.out.println("create OrderTransaction");
        return new OrderTransaction();
    }
}
