create table empresa (

    id          varchar(36) not null,
    nit         varchar(12) not null,
    nombre      varchar(500) not null,
    created_at  timestamp,
    created_by  varchar(100),
    updated_at  timestamp,
    updated_by  varchar(100),
    primary key (id)

);