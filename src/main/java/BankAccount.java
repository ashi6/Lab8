//import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /**
     * ???
     */
    public enum BankAccountType {
        /**?*/
        CHECKINGS,
        /**?*/
        SAVINGS,
        /**?*/
        STUDENT,
        /**?*/
        WORKPLACE
    }

    /**Nothing important.*/
    private int accountNumber;
    /**Nothing important.*/
    @SuppressWarnings("checkstyle:visibilitymodifier")
    public BankAccountType accountType;
    /**Nothing important.*/
    private double accountBalance;
    /**Nothing important.*/
    private String ownerName;
    /**Nothing important.*/
    @SuppressWarnings("checkstyle:visibilitymodifier")
    public double interestRate;
    /**Nothing important.*/
    private double interestEarned;

    /**
     * Something.
     * @param name a
     * @param accountCategory a
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
        Bank.totalAccounts++;
    }

    /**
     * something.
     * @return a
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * something.
     * @return a
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * something.
     * @return a
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * something.
     * @param a a
     */
    public void setAccountBalance(final double a) {
        accountBalance = a;
    }

    /**
     * something.
     * @return a
     */
    public double getInterestEarned() {
        return interestEarned;
    }
}
