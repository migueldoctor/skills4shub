-- V003__create_version_table.sql

CREATE SEQUENCE version_seq START WITH 1 INCREMENT BY 1 CACHE 50;

CREATE TABLE VERSION
(
    id         BIGINT DEFAULT nextval('version_seq') PRIMARY KEY,
    skill_id   BIGINT       NOT NULL,
    version    VARCHAR(50)  NOT NULL,
    file_path  VARCHAR(500) NOT NULL,
    notes      VARCHAR(1000),
    created_at TIMESTAMP    NOT NULL DEFAULT NOW(),
    CONSTRAINT fk_version_skill FOREIGN KEY (skill_id) REFERENCES SKILL (id)
);
