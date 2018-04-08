package order;

public interface OrderProcessService {

    /**
     * 주문하기
     */
    OrderResult order(Object orderRequest);

}
