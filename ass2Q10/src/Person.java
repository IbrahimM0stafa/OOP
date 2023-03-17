public class Person {
    private String name;
    private String address;
    private int phoneNo;
    private String emailAddress;

    public Person() {
    }

    public Person(String name, String address, int phoneNo, String emailAddress) {
        this.name =name;
        this.address=address;
        this.phoneNo=phoneNo;
        this.emailAddress=emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo=" + phoneNo +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
