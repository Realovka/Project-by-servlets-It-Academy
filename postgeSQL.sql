CREATE TABLE users_hb (
	id BIGSERIAL PRIMARY KEY,
	user_name VARCHAR(50) NOT NULL,
	age INTEGER NOT NULL,
	login VARCHAR(50) NOT NULL,
	login_and_password VARCHAR(150) NOT NULL,
	status VARCHAR(50) NOT NULL,
	group_id int8 null
);

CREATE TABLE groups_hb (
	id BIGSERIAL,
	name VARCHAR (50)
);

CREATE TABLE group_student (
   group_id int8,
   student_id int8
);

CREATE TABLE themes_hb (
   id BIGSERIAL,
   name_theme VARCHAR (150),
   mark smallint null,
   group_id int8 null,
   student_id int8 null
);

CREATE TABLE student_mark_hb (
   id BIGSERIAL,
   mark SMALLINT,
   student_id int8 null,
   theme_id int8 null

);