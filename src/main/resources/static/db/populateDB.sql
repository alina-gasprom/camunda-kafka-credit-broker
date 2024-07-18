DELETE
FROM clients;
DELETE
FROM accounts;

INSERT INTO clients(id, first_name, surname, second_name, passport_series, passport_number)
VALUES (1, 'Джексон', 'Майкл', 'Майколович', '1111', '666666'),
       (2, 'Хью', 'Джекман', 'Михайлович', '6754', '920089'),
       (3, 'Бритни', 'Спирс', 'Васильевна', '1101', '667766');

INSERT INTO accounts(id, client_id, account_type)
VALUES (100, 1, 'SALARY'),
       (200, 1, 'REGULAR'),
       (300, 3, 'CREDIT');