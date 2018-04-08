package orderreturn.approve;

public class ApproveApiFactory {
    public static ApproveApi getApproveApi(String key) {
        if ("sync".equals(key)) {
            return new ApproveV2Api();
        } else if ("async".equals(key)) {
            return new ApproveV3Api();
        }

        throw new IllegalArgumentException();
    }
}
