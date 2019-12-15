package by.htp.les09_4.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.les09_4.entity.Account;
import by.htp.les09_4.entity.Bank;
import by.htp.les09_4.entity.Client;
import by.htp.les09_4.logic.BankLogic;
import by.htp.les09_4.view.BankView;

public class Main {

	public static void main(String[] args, BankView see, boolean result) {

		Account account1 = new Account(1, 234, true);
		Account account2 = new Account(2, 567, true);
		Account account3 = new Account(3, -5.27, false);
		Account account4 = new Account(4, 758.4, true);
		Account account5 = new Account(5, -234.00, true);

		List<Account> list1 = new ArrayList<Account>();
		list1.add(account1);
		list1.add(account4);
		List<Account> list2 = new ArrayList<Account>();
		list2.add(account2);
		list2.add(account3);
		List<Account> list3 = new ArrayList<Account>();
		list3.add(account5);

		Client client1 = new Client(" Pavel ", " Dybovski ", list1);
		Client client2 = new Client(" Oleg ", " Zartiv ", list2);
		Client client3 = new Client(" Alex ", " Smit ", list3);

		Bank bank = new Bank();
		bank.getBank().add(client1);
		bank.getBank().add(client2);
		bank.getBank().add(client3);

		BankLogic logic = new BankLogic();
		Bank view = new Bank();

		double sumPositiveAccounts = logic.sumPositiveAccounts(bank);
		see.viewSum(sumPositiveAccounts);

		double sumNegativeAccounts = logic.sumNegativeAccounts(bank);
		see.viewSum(sumNegativeAccounts);
		see.viewAllSum(sumPositiveAccounts + sumNegativeAccounts);

		// Change account status client
		int id = view.inputId();
		boolean resolution = view.viewAccount(bank, id);
		if (!result) {
			String str = view.changeStatus();
			if (str.compareTo(" + ") == 0) {
				logic.changeStatus(bank, id);
				see.viewAccount(bank, id);
			}
		}

		String surname = view.changeSurname();
		List<Client> list = logic.searchByAccountSurname(bank, surname);
		see.viewClient(list, surname);

		bank = logic.sortByAccountSurname(bank);
	}
}
