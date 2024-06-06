--Insert into address
INSERT INTO address (zip, address_id, city, state) VALUES (5226, 1, 'Fairfield', 'IA');
INSERT INTO address (zip, address_id, city, state) VALUES (5227, 2, 'Ottumwa', 'IA');
INSERT INTO address (zip, address_id, city, state) VALUES (5228, 3, 'Cedar Rapids', 'IA');
INSERT INTO address (zip, address_id, city, state) VALUES (5229, 4, 'Iowa City', 'IA');
INSERT INTO address (zip, address_id, city, state) VALUES (5230, 5, 'Des Moines', 'IA');


--Insert into Student
INSERT INTO student (gpa, address_id, student_id, name) VALUES (3.5, 1, 1, 'John Doe');
INSERT INTO student (gpa, address_id, student_id, name) VALUES (3.8, 2, 2, 'Jane Smith');
INSERT INTO student (gpa, address_id, student_id, name) VALUES (3.2, 3, 3, 'Alice Johnson');
INSERT INTO student (gpa, address_id, student_id, name) VALUES (3.9, 4, 4, 'Bob Brown');
INSERT INTO student (gpa, address_id, student_id, name) VALUES (3.4, 5, 5, 'Charlie Davis');


--Insert into course
INSERT INTO course (course_id, name) VALUES (112, 'Mathematics');
INSERT INTO course (course_id, name) VALUES (113, 'Physics');
INSERT INTO course (course_id, name) VALUES (114, 'Chemistry');
INSERT INTO course (course_id, name) VALUES (115, 'Biology');
INSERT INTO course (course_id, name) VALUES (116, 'History');
INSERT INTO course (course_id, name) VALUES (117, 'Economics');
INSERT INTO course (course_id, name) VALUES (118, 'Economics3');

--Insert into student_course
INSERT into course_student (student_id, course_id) VALUES (1, 112);
INSERT INTO course_student (student_id, course_id) VALUES (1, 113);
INSERT INTO course_student (student_id, course_id) VALUES (1, 114);
INSERT INTO course_student (student_id, course_id) VALUES (2, 115);
INSERT INTO course_student (student_id, course_id) VALUES (2, 116);
INSERT INTO course_student (student_id, course_id) VALUES (2, 117);
INSERT INTO course_student (student_id, course_id) VALUES (2, 118);