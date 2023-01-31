--liquibase formatted sql
--changeset jszulc:4
alter table product add full_description text default null after description;