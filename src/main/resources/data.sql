-- Insert into User table
INSERT INTO users (name) VALUES ('John Doe');
INSERT INTO users (name) VALUES ('Jane Smith');

-- Get the generated IDs for the users
-- Assuming the IDs are 1 and 2

-- Insert into Post table
INSERT INTO posts (id,title, content, author, user_id) VALUES (1,'First Post', 'This is the content of the first post.', 'John Doe', 1);
INSERT INTO posts (id,title, content, author, user_id) VALUES (2,'Second Post', 'This is the content of the second post.', 'John Doe', 1);
INSERT INTO posts (id,title, content, author, user_id) VALUES (3,'Third Post', 'This is the content of the third post.', 'Jane Smith', 2);
INSERT INTO posts (id,title, content, author, user_id) VALUES (4, 'Fourth Post', 'This is the content of the fourth post.', 'Jane Smith', 2);


-- Insert into Comment table
INSERT INTO comments (id,name, post_id) VALUES (1,'This is comment1 for Post1',1);
INSERT INTO comments (id,name, post_id) VALUES (2,'This is comment2 for Post1',1);
INSERT INTO comments (id,name, post_id) VALUES (3,'This is comment3 for Post2',2);
INSERT INTO comments (id,name, post_id) VALUES (4,'This is comment4 for Post2',2);