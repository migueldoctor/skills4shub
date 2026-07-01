-- V006__create_verification_table.sql

CREATE SEQUENCE verification_seq START WITH 1 INCREMENT BY 1 CACHE 50;

CREATE TABLE VERIFICATION
(
    id           BIGINT DEFAULT nextval('verification_seq') PRIMARY KEY,
    skill_id     BIGINT       NOT NULL,
    verifier_id  BIGINT       NOT NULL,
    status       VARCHAR(20)  NOT NULL CHECK (status IN ('PENDING', 'VERIFIED', 'REJECTED')),
    notes        VARCHAR(1000),
    verified_at  TIMESTAMP,
    created_at   TIMESTAMP    NOT NULL DEFAULT NOW(),
    CONSTRAINT fk_verification_skill FOREIGN KEY (skill_id) REFERENCES SKILL (id),
    CONSTRAINT fk_verification_verifier FOREIGN KEY (verifier_id) REFERENCES "USER" (id)
);
