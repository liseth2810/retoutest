package co.com.utest.automation.challenge.exceptions;

@SuppressWarnings("Failure")
public class AccountCreationFailed extends AssertionError {

        public AccountCreationFailed() {

            super("The account creation process failed");
        }
}
