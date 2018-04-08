package orderreturn.approve;

public class ApproveV3Api implements ApproveApi {
    @Override
    public String execute() {
        System.out.println("비동기방식으로 approve 처리.");
        return "ok";
    }
}
