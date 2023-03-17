public class Employee extends Person{
    private String office;
    private  double salary;
    private  String dateHired;

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public Employee() {
    }

    public Employee(String name, String address, int phoneNo, String emailAddress,String office, double salary, String dateHired) {
        super(name, address, phoneNo, emailAddress);
        this.dateHired=dateHired;
        this.office=office;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "office='" + office + '\'' +
                ", salary=" + salary +
                ", dateHired='" + dateHired + '\'' +
                '}';
    }
}
