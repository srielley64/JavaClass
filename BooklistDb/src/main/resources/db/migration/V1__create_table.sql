CREATE TABLE book (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL ,
    author VARCHAR(255) NOT NULL ,
    copyright DATE NOT NULL
)