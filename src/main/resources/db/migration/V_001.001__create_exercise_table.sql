CREATE TABLE exercise (
    exercise_id int not null generated always as identity (start with 1, increment by 1),
    name varchar (100) not null
);