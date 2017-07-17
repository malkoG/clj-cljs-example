CREATE SEQUENCE guestbook_id;
CREATE TABLE guestbook
(id INTEGER PRIMARY KEY NOT NULL DEFAULT nextval("guestbook_id"),
name VARCHAR(30),
message VARCHAR(200),
timestamp TIMESTAMP);