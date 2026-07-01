-- V004__create_download_table.sql

CREATE SEQUENCE download_seq START WITH 1 INCREMENT BY 1 CACHE 50;

CREATE TABLE DOWNLOAD
(
    id            BIGINT DEFAULT nextval('download_seq') PRIMARY KEY,
    user_id       BIGINT,
    skill_id      BIGINT       NOT NULL,
    downloaded_at TIMESTAMP    NOT NULL DEFAULT NOW(),
    ip_address    VARCHAR(45),
    session_id    VARCHAR(255),
    CONSTRAINT fk_download_user FOREIGN KEY (user_id) REFERENCES "USER" (id),
    CONSTRAINT fk_download_skill FOREIGN KEY (skill_id) REFERENCES SKILL (id)
);
