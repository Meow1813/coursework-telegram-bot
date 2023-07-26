--liquibase formatted sql

--changeset meow:1
CREATE TABLE notification_task
(
    Id SERIAL PRIMARY KEY,
    chat_id INTEGER,
    text TEXT,
    date TIMESTAMP
)