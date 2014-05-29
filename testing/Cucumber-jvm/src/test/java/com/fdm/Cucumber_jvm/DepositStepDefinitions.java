package com.fdm.Cucumber_jvm;

import static org.junit.Assert.*;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class DepositStepDefinitions {
	
private Account account;

	@Given("^a User has no money in their account$")
	public void a_User_has_no_money_in_their_current_account(){
		User user = new User();
		account = new Account();
		user.setAccount(account);
		assertTrue(account.getBalance() == 0);
	}
	
	@When("^£(\\d+) is deposited in to the account$")
	public void £_is_deposited_in_to_the_account(int amount){
		account.setBalance(amount); // amount is taken from (\\d+), this is a regex
	}
	
	@Then("^the balance should be £(\\d+)$")
	public void the_balance_sould_be_£(int expectedBalance){
		assertTrue(account.getBalance() == expectedBalance);// expectedBalance is taken from (\\d+)
	}
}