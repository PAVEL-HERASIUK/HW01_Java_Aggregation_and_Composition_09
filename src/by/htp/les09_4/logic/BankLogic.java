package by.htp.les09_4.logic;

import java.util.ArrayList;
import java.util.List;
import by.htp.les09_4.entity.Account;
import by.htp.les09_4.entity.Bank;
import by.htp.les09_4.entity.Client;

public class BankLogic {

	public void changeStatus(Bank bank, int id) {
		for (int i = 0; i < bank.getBank().size(); i++) {
			Client client = bank.getBank().get(i);
			for (int j = 0; j < client.getAccount().size(); j++) {
				Account account = client.getAccount().get(i);
				if (account.getId() == id) {
					if (account.isStatus()) {
						account.setStatus(false);
					} else {
						account.setStatus(true);
					}
				}
			}
		}
	}

	public List<Client> searchByAccountSurname(Bank bank, String surname) {
		List<Client> list = new ArrayList<Client>();
		for (int i = 0; i < bank.getBank().size(); i++) {
			Client client = bank.getBank().get(i);
			if (client.getSurname().compareTo(surname) == 0) {
				list.add(client);
			}
		}
		return list;
	}

	public Bank sortByAccountSurname(Bank bank) {
		int i = 0;
		while (i < bank.getBank().size() - 1) {
			Client client1 = bank.getBank().get(i);
			Client client2 = bank.getBank().get(i + 1);
			if (client1.getSurname().compareTo(client2.getSurname()) > 0) {
				Client tmp = client1;
				bank.getBank().set(i, client2);
				bank.getBank().set(i + 1, tmp);
				i = 0;
			} else {
				i++;
			}
		}
		return bank;
	}

	public double sumPositiveAccounts(Bank bank) {
		double sum = 0;
		for (int i = 0; i < bank.getBank().size(); i++) {
			Client client = bank.getBank().get(i);
			for (int j = 0; j < client.getAccount().size(); j++) {
				Account account = client.getAccount().get(i);
				if (account.getSum() > 0) {
					sum = sum + account.getSum();
				}
			}
		}
		return sum;
	}

	public double sumNegativeAccounts(Bank bank) {
		double sum = 0;
		for (int i = 0; i < bank.getBank().size(); i++) {
			Client client = bank.getBank().get(i);
			for (int j = 0; j < client.getAccount().size(); j++) {
				Account account = client.getAccount().get(i);
				if (account.getSum() < 0) {
					sum = sum + account.getSum();
				}
			}
		}
		return sum;
	}
}
