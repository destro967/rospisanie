create table if   not exists cabinets(
    id serial     primary key,
    free          varchar(255) not null
);

create table if   not exists teachers(
    id serial     primary key,
    teacher_name  varchar(255) not null
);

create table if   not exists subjects(
    id serial     primary key,
    subjectscol   varchar(255) not null,
    subject_name  varchar (255) not null
);

create table if   not exists facultets(
    id serial     primary key,
    facultet_name varchar (255) not null
);

create table if   not exists groups(
    id serial     primary key,
    work_days     varchar (255) not null,
    facultet_id   int references facultets(id)
);

create table if   not exists students(
    id serial     primary key,
    group_id      int references groups(id),
    student_naem  varchar (255) not null
);

create table if   not exists teachers_has_subjects(
    teacher_id    int references teachers(id),
    subject_id    int references subjects(id)
);

create table if   not exists lessons_list(
    id serial     primary key,
    cabinet_id    int references cabinets(id),
    teacher_id    int references teachers(id),
    group_id      int references groups(id),
    subject_id    int references subjects(id)
);


