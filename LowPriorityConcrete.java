import java.time.LocalDate;

public class LowPriorityConcrete implements RequestProduct {

    private String priority;
    private String status;
    private String expireDate;

    public LowPriorityConcrete() {
        this.priority = "";
        this.status = "";
        this.expireDate = "";
    }

    @Override
    public void processRequest() {
        System.out.println("Request Denied");
    }

    @Override
    public void setExpire(String expireDay) {
        this.expireDate = LocalDate.now().toString();

    }

    @Override
    public void setPriority(String priority) {
        this.priority = "Ignore";

    }

    @Override
    public void setStatus(String status) {
        this.status = "Done";
    }

}
