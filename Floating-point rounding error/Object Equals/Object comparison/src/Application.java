public class Application {
    public static void main(String[] args) {
        Employee emp1=new Employee(1,128,"Jone","Address 1");
        Employee emp2=new Employee(2,102,"Robert","Address 2");
        Employee emp3=new Employee(1,128,"Jone","Address 1");

        System.out.println(emp1.equals(emp2));
        System.out.println(emp1.equals(emp3));

    }
}
