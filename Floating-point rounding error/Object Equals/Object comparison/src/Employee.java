public class Employee {
    private Integer id;
    private Integer emp_code;
    private String name;
    private String address;

    public Employee(int id,int code,String name,String address){
        this.id=id;
        this.emp_code=code;
        this.name=name;
        this.address=address;
    }

    public boolean equals(Employee emp){
       if(emp==null){
           return false;
       }else if (!(emp instanceof Employee)) {
            return false;
        } else {
           return this.id.equals(emp.id)&&this.emp_code.equals(emp.emp_code)&&true||false;
       }

    }
}
