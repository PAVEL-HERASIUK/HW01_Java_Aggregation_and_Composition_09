package by.htp.les09_4.view;

import java.util.List;
import java.util.Scanner;

import by.htp.les09_4.entity.Account;
import by.htp.les09_4.entity.Bank;
import by.htp.les09_4.entity.Client;

public class BankView {

	public boolean viewAccount(Bank bank, int id) {
		boolean result = true;
		for (int i = 0; i < bank.getBank().size(); i++) {
			Client client = bank.getBank().get(i);
			for (int j = 0; j < client.getAccount().size(); j++) {
				Account account = client.getAccount().get(i);
				if (account.getId() == id) {
					System.out.println(" \n ID счета : " + account.getId());
					System.out.println(" Сумма на счетe: " + account.getSum());
					String str;
					if (account.isStatus()) {
						str = " действующий ";
					} else {
						str = " заблокирован ";
					}
					System.out.println(" Статус: " + str);
					System.out.println(" Владелец счета: " + client.getSurname() + "  " + client.getName());
					result = false;
				}
			}
		}
		if (result) {
			System.out.println(" Счет с ID " + id + " не найден ");
		}
		return result;
	}

	public void viewClient(List<Client> list, String surname) {
		if (list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(" \n Клиент: " + list.get(i).getSurname() + "  " + list.get(i).getName());
				System.out.println(" Счет (счета) клиента: ");
				for (int j = 0; j < list.get(i).getAccount().size(); j++) {
					Account account = list.get(i).getAccount().get(i);
					System.out.println(" \n ID счета : " + account.getId());
					System.out.println(" Сумма на счет: " + account.getSum());
					String str;
					if (account.isStatus()) {
						str = " действующий ";
					} else {
						str = " заблокирован ";
					}
					System.out.println(" Статус: " + str);
				}
			}
		} else {
			System.out.println(" Клиент с фамилией " + surname + " не найден ");
		}
	}

	public void viewBankAccount(Bank bank) {
		for (int i = 0; i < bank.getBank().size(); i++) {
			Client client = bank.getBank().get(i);
			System.out.println(" \n Клиент: " + client.getSurname() + "  " + client.getName());
			for (int j = 0; j < client.getAccount().size(); j++) {
				Account account = client.getAccount().get(i);
				System.out.println(" ID счета : " + account.getId());
				System.out.println(" Сумма на счет: " + account.getSum());
				String str;
				if (account.isStatus()) {
					str = " действующий ";
				} else {
					str = " заблокирован ";
				}
				System.out.println(" Статус: " + str);
			}
		}
	}

	@SuppressWarnings("resource")
	public int inputUserId() {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Введите ID счета: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(" Введите ID счета: ");
		}
		int id = sc.nextInt();
		while (id <= 0) {
			System.out.print(" Введите ID счета: ");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.print(" Введите ID счета: ");
			}
			id = sc.nextInt();
		}
		return id;
	}

	@SuppressWarnings("resource")
	public String searchSurname() {
		Scanner sc = new Scanner(System.in);
		System.out.print(" \n Введите фамилию клиента: ");
		String result = sc.next();
		return result;
	}

	public void viewSum(double sum) {
		if (sum > 0) {
			System.out.println(" Сумма всех положительных счетов равна " + sum);
		} else {
			System.out.println(" Сумма всех отрицательных счетов равна " + sum);
		}
	}

	public void viewAllSum(double sum) {
		System.out.println(" Сумма всех средств в банке равна " + sum);
	}
}
