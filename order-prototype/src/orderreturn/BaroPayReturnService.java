package orderreturn;

import orderreturn.approve.ApproveApiFactory;

public class BaroPayReturnService implements ReturnService {
    @Override
    public ReturnResult process(ReturnRequest request) {
        System.out.println("유효성체크");
        ApproveApiFactory.getApproveApi("async").execute();

        /**
         * 1. 유효성 체크 : ord / purch / 라이브 등등
         * 2. orderorderPayment 등록
         * 3. 결제승인요청
         *
         * 4. 결제승인 결과확인
         * 5. 주문완료처리
         * 6. 주문중개전달
         * 7. 주문후처리
         * */
        return null;
    }
}
