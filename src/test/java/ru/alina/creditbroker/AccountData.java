package ru.alina.creditbroker;

import ru.alina.creditbroker.domain.Account;
import ru.alina.creditbroker.domain.AccountType;

public class AccountData {
    public final static Account ACCOUNT_SALARY_USER1 = new Account(100L, ClientData.CLIENT_ID_1, AccountType.SALARY);
    public final static Account ACCOUNT_REGULAR_USER1 = new Account(200L, ClientData.CLIENT_ID_1, AccountType.REGULAR);
    public final static Account ACCOUNT_CREDIT_USER3 = new Account(300L, ClientData.CLIENT_ID_3, AccountType.CREDIT);
}
