package orderreturn.approve;

public class ApproveV2Api implements ApproveApi {
    @Override
    public String execute() {
        System.out.println("동기방식으로 approve 처리.");
        return "ok";
    }
}
