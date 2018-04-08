package service;

public class BillingService {
    public String pay() {
        System.out.println("빌링 결제요청 api 호출");
        return "https://billing.com/set";
    }
}
