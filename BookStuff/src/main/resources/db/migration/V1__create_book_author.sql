CREATE TABLE author (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(20) not null,
    middle_name VARCHAR(20),
    last_name VARCHAR(20) not null ,
    date_birth TIMESTAMP not null,
    date_death TIMESTAMP
);

CREATE TABLE book (
    id SERIAL PRIMARY KEY,
    title VARCHAR(100) not null,
    author_Id BIGINT NOT NULL REFERENCES author(id),
    isbn VARCHAR(13) not null,
    copyright_date TIMESTAMP not null
);