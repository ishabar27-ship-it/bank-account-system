public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("1001", "Isha Bar", 5000);
        BankAccount acc2 = new BankAccount("1002", "Payal Bar", 3000);

        System.out.println("--- Account 1 Operations ---");
        acc1.deposit(2000);
        acc1.withdraw(1500);

        System.out.println("\n--- Account 2 Operations ---");
        acc2.deposit(1000);
        acc2.withdraw(5000); // insufficient balance

        System.out.println("\n--- Final Details ---");
        acc1.displayDetails();
        System.out.println();
        acc2.displayDetails();
    }
}