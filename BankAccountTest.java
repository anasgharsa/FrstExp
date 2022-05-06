package testing.exp;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {

	@Test
	public void testIdIsAutomaticallyAssignedAsPositiveNumber() {
		 // setup
		 BankAccount bankAccount = new BankAccount();
		 // verify
		 assertTrue("Id should be positive", bankAccount.getId() > 0);
		 }
	
	@Test
	 public void testIdsAreIncremental() {
	 BankAccount firstAccount = new BankAccount();
	 BankAccount secondAccount = new BankAccount();
	 assertTrue("Ids should be incremental",
	 firstAccount.getId() < secondAccount.getId());
	 }
	
	
	@Test
	 public void testDepositWhenAmountIsCorrectShouldIncreaseBalance() {
	 // setup
	 BankAccount bankAccount = new BankAccount();
	 // exercise
	 bankAccount.deposit(10);
	 // verify
	 assertEquals(10, bankAccount.getBalance(), 0);
	 }

	
	
}
