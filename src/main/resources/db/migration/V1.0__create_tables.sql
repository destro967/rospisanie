create table if not exists Cabinets(
    id serial primary key,
    free varchar(255) not null
);

create table if not exists Teachers(
    id serial primary key
);

create table if not exists Subjects(
    id serial primary key,
    subjectscol varchar(255) not null
);

create table if not exists Facultets(
    id serial primary key
);

create table if not exists Groups(
    id serial primary key,
    facultet_id int foreign key Facultets(id)
);

create table if not exists Students(
    id serial primary key,
    group_id int foreign key Groups(id)
);

create table if not exists TeachersHasSubjects(
    teacher_id int foreign key Groups(id),
    subject_id int foreign key Subjects(id)
);

create table if not exists LessonsList(
    id serial primary key,
    cabinet_id int foreign key Cabinets(id),
    teacher_id int foreign key Teachers(id),
    group_id int foreign key Groups(id),
);


