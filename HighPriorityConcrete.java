import java.time.LocalDate;

public class HighPriorityConcrete implements RequestProduct {

    private String priority;
    private String status;
    private String expireDate;

    public HighPriorityConcrete() {
        this.priority = "";
        this.status = "";
        this.expireDate = "";
    }

    @Override
    public void processRequest() {
        System.out.println("Emergency request, our Administer will contact you immediately !");
    }

    @Override
    public void setExpire(String expireDay) {
        this.expireDate = LocalDate.now().toString();

    }

    @Override
    public void setPriority(String priority) {
        this.priority = "Emergency";

    }

    @Override
    public void setStatus(String status) {
        this.status = "Accept";
    }

}
