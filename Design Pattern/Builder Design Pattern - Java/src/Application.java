public class Application {
    public static void main(String[] args) {
        Traveler.Builder builder=new Traveler.Builder("Male");
        Traveler newTraveler=builder.isAForeigner(true).campDuration(5).build();
        System.out.println(newTraveler);
    }
}
