create table if not exists cabinets(
    id serial primary key,
    free varchar(255) not null
);

create table if not exists  teachers(
    id serial primary key
);

create table if not exists subjects(
    id serial primary key,
    subjectscol varchar(255) not null
);

create table if not exists facultets(
    id serial primary key
);

create table if not exists groups(
    id serial primary key,
    facultet_id int foreign key facultets(id)
);

create table if not exists students(
    id serial primary key,
    group_id int foreign key groups(id)
);

create table if not exists teachers_has_subjects(
    teacher_id int foreign key groups(id),
    subject_id int foreign key subjects(id)
);

create table if not exists students(
    id serial primary key,
    cabinet_id int foreign key cabinets(id),
    teacher_id int foreign key teachers(id),
    group_id int foreign key groups(id),
);

