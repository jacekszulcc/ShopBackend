--liquibase formatted sql
--changeset jszulc:15
alter table `order` add payment_id bigint;
update `order` set payment_id=1;
alter table `order` MODIFY payment_id bigint not null;