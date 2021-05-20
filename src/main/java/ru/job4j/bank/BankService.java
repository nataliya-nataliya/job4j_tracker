package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банковской системы
 * @author Nataliya
 * @version 1.0
 */

public class BankService {

    /**
     * Хранение данных пользователя и его реквизитов осуществляется в коллекции типа HashMap
     */

    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет нового пользователя в систему
     * Если такой пользователь уже есть, то пользователь не добавляется
     * @param user пользователь, который добавляется в систему
     */

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод присваивает новый счет пользователю. Если такого счета нет, то счет добавляется
     * Поиск пользователя осуществляется по паспорту
     * @param passport паспорт пользователя
     * @param account счет пользователя
     */

    public void addAccount(String passport, Account account) {
        User searchUser = findByPassport(passport);
        if (searchUser != null) {
            List<Account> userAccount = users.get(searchUser);
            if (!userAccount.contains(account)) {
                userAccount.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта
     * @param passport паспорт пользователя
     * @return пользователя или null, если паспорт не найден
     */

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (passport.equals(user.getPassport())) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод ищет счет пользователя по реквизитам
     * @param passport паспорт пользователя
     * @param requisite реквизиты пользователя
     * @return счет пользователя или null, если реквизиты не найдены
     */

    public Account findByRequisite(String passport, String requisite) {

        User user = findByPassport(passport);
        if (user != null) {
            for (Account acc : users.get(user)) {
                if (requisite.equals(acc.getRequisite())) {
                    return acc;
                }
            }
        }
        return null;
    }

    /**
     * Метод для перевода денег с одного счёта на другой счёт
     * @param srcPassport паспорт пользователя, с которого переводят сумму
     * @param srcRequisite реквизиты пользователя, с которого переводят сумму
     * @param destPassport паспорт пользователя, которому переводят сумму
     * @param destRequisite реквизиты пользователя, которому переводят сумму
     * @param amount сумма, которую переводит пользователь
     * @return если перевод совершился, то "true"; если счет не найден или сумма для перевода
     * недостаточна, то "false"
     */

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);

            if (srcAccount != null && srcAccount.getBalance() >= amount && destAccount != null) {
                srcAccount.setBalance(srcAccount.getBalance() - amount);
                destAccount.setBalance(destAccount.getBalance() + amount);
                rsl = true;
            }
        return rsl;
    }

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        String requisite = "3fdsbb9";
        accounts.add(new Account("3fdsbb9", 140));
        int index = accounts.indexOf(new Account(requisite, -1));
        Account find = accounts.get(index);
        System.out.println(find.getRequisite() + " -> " + find.getBalance());
    }

}
