public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(15000);

        try {
            while (true) {
                account.withdraw(6000);
            }
        } catch (LimitException e) {
            System.out.println("Исключение: " + e.getMessage() + ". Снято только " + e.getRemainingAmount() + " сом.");
        }
    }
}