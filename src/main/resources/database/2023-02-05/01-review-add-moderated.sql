--liquibase formatted sql
--changeset jszulc:9
alter table review add moderated boolean default false;