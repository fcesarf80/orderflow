create table instruments (
   id         bigserial primary key,
   ticker     varchar(20) not null unique,
   name       varchar(100) not null,
   is_active  boolean not null default true,
   created_at timestamp not null default current_timestamp
);