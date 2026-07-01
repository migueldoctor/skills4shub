-- V002__create_skill_table.sql

CREATE SEQUENCE skill_seq START WITH 1 INCREMENT BY 1 CACHE 50;

CREATE TABLE SKILL
(
    id                  BIGINT DEFAULT nextval('skill_seq') PRIMARY KEY,
    title               VARCHAR(255)    NOT NULL,
    description         VARCHAR(2000)   NOT NULL,
    author_id           BIGINT          NOT NULL,
    file_path           VARCHAR(500)    NOT NULL UNIQUE,
    verification_status VARCHAR(20)     NOT NULL CHECK (verification_status IN ('PENDING', 'VERIFIED', 'REJECTED')),
    created_at          TIMESTAMP       NOT NULL DEFAULT NOW(),
    updated_at          TIMESTAMP       NOT NULL DEFAULT NOW(),
    CONSTRAINT fk_skill_author FOREIGN KEY (author_id) REFERENCES "USER" (id)
);
