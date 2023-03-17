public class Faculty extends Employee{
    private int officeHours;
    private int rank;

    public Faculty(String name, String address, int phoneNo, String emailAddress, String office, double salary, String dateHired, int officeHours,int rank) {
        super(name, address, phoneNo, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank=rank;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "officeHours=" + officeHours +
                ", rank=" + rank +
                '}';
    }
}
