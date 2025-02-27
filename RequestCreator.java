public abstract class RequestCreator {

    abstract RequestProduct createRequest();

    public void processRequest(String priority, String expireDay, String status) {
        RequestProduct request = createRequest();
        request.setPriority(priority);
        request.setStatus(status);
        request.setExpire(expireDay);

        request.processRequest();
    }

}
