package Thread.Race_Condition;

public class BankAccount {
        private int balance;
        public void deposit(int amount) {
            balance += amount;
        }
        public void withdraw(int amount) {
            balance -= amount;
        }
        public int getBalance() {
            return balance;
        }
}

