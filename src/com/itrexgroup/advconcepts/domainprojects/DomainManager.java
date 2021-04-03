package com.itrexgroup.advconcepts.domainprojects;

import java.util.*;
import java.util.stream.Collectors;

public class DomainManager {
    private static final Set<User> users = new HashSet<>();

    /*  You need to write a method findUserByLogin(String login) that returns an optional value of type Optional<User>.
    If the user exists in the users set you need to return non-empty optional wrapping the user inside, otherwise returned optional should be empty.    */

    public static Optional<User> findUserByLogin(String login) {
        return Optional.of(users.stream().filter(user -> user.getLogin().equals(login)).findFirst()).orElse(Optional.empty());
    }

    /*  Using the method you've written for finding an user by their login, write a new method printBalanceIfNotEmpty(String userLogin)that
    prints an account balance for an existing user if `balance > 0`. In this case, the result format should print the string:   */

    public static void printBalanceIfNotEmpty(String userLogin) {
        Optional<Long> usrBalance = findUserByLogin(userLogin)
                .map(User::getAccount)
                .map(Account::getBalance)
                .filter(balance -> balance > 0);

        usrBalance.ifPresent(balance -> System.out.println(userLogin + ": " + usrBalance.get()));

    }
}
