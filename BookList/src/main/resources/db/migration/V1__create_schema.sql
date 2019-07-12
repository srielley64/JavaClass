CREATE TABLE author
(
    id          SERIAL PRIMARY KEY,
    first_name  VARCHAR(20) NOT NULL,
    middle_name VARCHAR(20) NOT NULL,
    nick_name   VARCHAR(20) NOT NULL,
    last_name   VARCHAR(30) not null,
    born        DATE        NOT NULL,
    died        DATE
);

CREATE TABLE book
(
    id        SERIAL PRIMARY KEY,
    title     VARCHAR(255) NOT NULL,
    author    INTEGER REFERENCES author (id) ON DELETE CASCADE,
    copyright DATE         NOT NULL,
    mode      INTEGER NOT NULL,
    start     DATE,
    finish    DATE
);

