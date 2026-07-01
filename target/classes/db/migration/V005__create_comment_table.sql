-- V005__create_comment_table.sql

CREATE SEQUENCE comment_seq START WITH 1 INCREMENT BY 1 CACHE 50;

CREATE TABLE COMMENT
(
    id         BIGINT DEFAULT nextval('comment_seq') PRIMARY KEY,
    user_id    BIGINT       NOT NULL,
    skill_id   BIGINT       NOT NULL,
    content    VARCHAR(1000) NOT NULL,
    created_at TIMESTAMP    NOT NULL DEFAULT NOW(),
    CONSTRAINT fk_comment_user FOREIGN KEY (user_id) REFERENCES "USER" (id),
    CONSTRAINT fk_comment_skill FOREIGN KEY (skill_id) REFERENCES SKILL (id)
);
