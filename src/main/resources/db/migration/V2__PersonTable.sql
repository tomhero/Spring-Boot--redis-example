insert into springboot_test.person(id, first_name, last_name, age)
    values
        (UUID_TO_BIN(uuid()), 'Chayut', 'Ruksomya', 20),
        (UUID_TO_BIN(uuid()), 'Grayut', 'RukTaam', 21),
        (UUID_TO_BIN(uuid()), 'Prayut', 'Chan-o-cha', 22);

-- For Select UUID value
-- select BIN_TO_UUID(id) id, first_name, age from person;