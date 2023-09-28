package stepDefinitions;

import io.cucumber.java.Before;

public class Hooks {

	@Before("@NetBanking")
	public void netBankingSetup() {
		System.out.println("Setup the entries");
	}
	@Before("@Mortgage")
	public void mortgage() {
		System.out.println("setup the entries in Mortgage");
	}
}
