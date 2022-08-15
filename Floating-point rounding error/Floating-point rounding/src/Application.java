

public class Application {
    public static void main(String[] args) {

        double salary = 100.00;
        double interest = 3.0;

        double Jan = salary / interest;
        double Feb = salary / interest;
        double March = salary / interest;

        double answer = (Jan + Feb + March);

        System.out.println("Salary of January month: " + Jan);
        System.out.println("Salary of February month: " + Feb);
        System.out.println("Salary of March month: " + March);
        System.out.println("Total: " + answer);

    }
}
