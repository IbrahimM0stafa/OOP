public class Student extends Person {
    final String status;

    public Student(String name, String address, int phoneNo, String emailAddress, String status) {
        super(name, address, phoneNo, emailAddress);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "status='" + status + '\'' +
                '}';
    }
}
