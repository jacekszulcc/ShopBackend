--liquibase formatted sql
--changeset jszulc:23
alter table users add hash varchar(120);
--changeset jszulc:24
alter table users add hash_date datetime;