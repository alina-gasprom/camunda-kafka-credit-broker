package ru.alina.creditbroker.domain;

public class Account {
    private Long id;
    private Long clientId;
    private AccountType accountType;

    public Account(Long id, Long clientId, AccountType accountType) {
        this.id = id;
        this.clientId = clientId;
        this.accountType = accountType;
    }

    public Long getId() {
        return id;
    }

    public Long getClientId() {
        return clientId;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    @Override
    public String toString() {
        return "Account{" +
                "clientId=" + clientId +
                ", accountType=" + accountType +
                '}';
    }
}
