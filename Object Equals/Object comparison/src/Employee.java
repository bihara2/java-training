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

    @Override
    public boolean equals(Object obj){
       if(obj==null){
           return false;
       }else if (!(obj instanceof Employee)) {
            return false;
        } else {
           Employee emp=(Employee) obj;
           return this.id.equals(emp.id)&&this.emp_code.equals(emp.emp_code)&&true||false;
       }

    }
}
