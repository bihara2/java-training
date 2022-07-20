public class Traveler {
    private final Boolean isAForeigner;
    private final String gender;
    private final int campDuration;
    public Traveler(Builder builder) {
        this.isAForeigner=builder.isAForeigner;
        this.gender=builder.gender;
        this.campDuration=builder.campDuration;
    }
    static class Builder{
        private Boolean isAForeigner;
        private String gender;
        private int campDuration;
        public Builder(String gender){
            this.gender=gender;
        }
        public Traveler build(){
            return new Traveler(this);
        }
        public Builder isAForeigner(Boolean isAForeigner){
            this.isAForeigner=isAForeigner;
            return this;
        }
        public Builder campDuration(int campDuration){
            this.campDuration=campDuration;
            return this;
        }
    }
    public String toString(){
        return "Traveler isAForeigner: "+isAForeigner+"\n Gender: "+gender+"\n Camping Duration: "+campDuration;
    }
}
