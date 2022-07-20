public class Player {
    private String name;
    private String sport;
    private String status;

    public String getSport() {
        return sport;
    }

    public Player(String name, String sport){
        this.name=name;
        this.sport=sport;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
