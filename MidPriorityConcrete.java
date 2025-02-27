import java.time.LocalDate;

public class MidPriorityConcrete implements RequestProduct {

    private String priority;
    private String status;
    private String expireDate;

    public MidPriorityConcrete() {
        this.priority = "";
        this.status = "";
        this.expireDate = "";
    }

    @Override
    public void processRequest() {
        System.out.println("Request accept, estimated completion date is " + expireDate);
    }

    @Override
    public void setExpire(String expireDay) {
        this.expireDate = LocalDate.now().plusMonths(1).toString();
    }

    @Override
    public void setPriority(String priority) {
        this.priority = "Medium";
    }

    @Override
    public void setStatus(String status) {
        this.status = "Accepted";
    }

}
