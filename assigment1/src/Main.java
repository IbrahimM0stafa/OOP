public class Main {
    public static void main(String[] args) {
        Account user1 = new Account(1122,20000);
        user1.setAnnualInterestRate(0.045);
        user1.withdraw(2500);
        user1.deposit(3000);
        System.out.println(user1.getBalance());
        System.out.println(user1.getMonthlyInterest());
        System.out.println(user1.getDateCreated());
    }
}