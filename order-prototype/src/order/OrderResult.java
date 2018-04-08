package order;

public class OrderResult {
    private String result;
    private String transactionNo;
    private String nextUrl;

    public OrderResult(String result, String transactionNo, String nextUrl) {
        this.result = result;
        this.transactionNo = transactionNo;
        this.nextUrl = nextUrl;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getTransactionNo() {
        return transactionNo;
    }

    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
    }

    public String getNextUrl() {
        return nextUrl;
    }

    public void setNextUrl(String nextUrl) {
        this.nextUrl = nextUrl;
    }

    @Override
    public String toString() {
        return "OrderResult{" +
                "result='" + result + '\'' +
                ", transactionNo='" + transactionNo + '\'' +
                ", nextUrl='" + nextUrl + '\'' +
                '}';
    }
}
