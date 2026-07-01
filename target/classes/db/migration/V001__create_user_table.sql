-- V001__create_user_table.sql

CREATE SEQUENCE user_seq START WITH 1 INCREMENT BY 1 CACHE 50;

CREATE TABLE "USER"
(
    id         BIGINT DEFAULT nextval('user_seq') PRIMARY KEY,
    email      VARCHAR(255)    NOT NULL UNIQUE,
    password   VARCHAR(255)    NOT NULL,
    first_name VARCHAR(100)    NOT NULL,
    last_name  VARCHAR(100)    NOT NULL,
    role       VARCHAR(20)     NOT NULL CHECK (role IN ('MEMBER', 'VERIFIER', 'ADMIN')),
    created_at TIMESTAMP       NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMP       NOT NULL DEFAULT NOW()
);
