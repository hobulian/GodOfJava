package Thread.Race_Condition;

public class BankTest {
        public static void main(String[] args) {
            BankAccount account1 = new BankAccount();
            User u1 = new User(account1);
            User u2 = new User(account1);
            Thread t1 = new Thread(u1);
            Thread t2 = new Thread(u2);

            t1.start();
            t2.start();
        }
}
