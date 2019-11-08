create table if not exists cabinets(
    id serial   primary key,
    free        varchar(255) not null
);

create table if not exists teachers(
    id serial   primary key
);

create table if not exists subjects(
    id serial   primary key,
    subjectscol varchar(255) not null
);

create table if not exists facultets(
    id serial   primary key
);

create table if not exists groups(
    id serial   primary key,
    facultet_id int references facultets(id)
);

create table if not exists students(
    id serial   primary key,
    group_id    int references groups(id)
);

create table if not exists teachersHasSubjects(
    teacher_id  int references groups(id),
    subject_id  int references subjects(id)
);

create table if not exists lessonsList(
    id serial   primary key,
    cabinet_id  int references cabinets(id),
    teacher_id  int references teachers(id),
    group_id    int references groups(id)
);


