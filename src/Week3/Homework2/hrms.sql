create table if not exists "user"
(
    id       serial      not null
        constraint user_pk
            primary key,
    email    varchar(50) not null,
    password varchar(50) not null
);

alter table "user"
    owner to postgres;

create unique index if not exists user_email_uindex
    on "user" (email);

create table if not exists personal
(
    "userId" integer     not null
        constraint personal_user_id_fk
            references "user",
    role     varchar(20) not null
);

alter table personal
    owner to postgres;

create unique index if not exists personal_id_uindex
    on personal ("userId");

create table if not exists job_seeker
(
    "userId"        integer     not null
        constraint job_seeker_user_id_fk
            references "user",
    "firstName"     varchar(50) not null,
    "lastName"      varchar(50) not null,
    "nationalityId" char(11)    not null,
    "birthDate"     date        not null
);

alter table job_seeker
    owner to postgres;

create unique index if not exists job_seeker_userid_uindex
    on job_seeker ("userId");

create unique index if not exists job_seeker_nationalityid_uindex
    on job_seeker ("nationalityId");

create table if not exists employer
(
    "userId"      integer     not null
        constraint employer_user_id_fk
            references "user",
    "companyName" varchar(50) not null,
    "webSite"     varchar(50) not null
);

alter table employer
    owner to postgres;

create unique index if not exists employer_userid_uindex
    on employer ("userId");

create unique index if not exists employer_website_uindex
    on employer ("webSite");

create table if not exists "jobPosition"
(
    id       serial      not null
        constraint jobposition_pk
            primary key,
    name     varchar(50) not null,
    "userId" integer     not null
        constraint jobposition_user_id_fk
            references "user"
);

alter table "jobPosition"
    owner to postgres;

create unique index if not exists jobposition_id_uindex
    on "jobPosition" (id);

create unique index if not exists jobposition_name_uindex
    on "jobPosition" (name);

create unique index if not exists jobposition_userid_uindex
    on "jobPosition" ("userId");


