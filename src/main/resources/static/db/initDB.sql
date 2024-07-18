DROP TABLE IF EXISTS accounts;
DROP TABLE IF EXISTS clients;

DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq AS BIGINT START WITH 1000;


CREATE TABLE clients
(
    id              BIGINT PRIMARY KEY DEFAULT nextval('global_seq'),
    first_name      VARCHAR(30)       NOT NULL UNIQUE,
    surname         VARCHAR(30)       NOT NULL,
    second_name     VARCHAR(30)       NOT NULL,
    passport_series VARCHAR(4) UNIQUE NOT NULL,
    passport_number VARCHAR(6) UNIQUE
);

CREATE TABLE accounts
(
    id           BIGINT PRIMARY KEY DEFAULT nextval('global_seq'),
    client_id    BIGINT      NOT NULL,
    account_type VARCHAR(10) NOT NULL,
    FOREIGN KEY (client_id) REFERENCES clients (id) ON UPDATE CASCADE

);



