-- Insert into User table
INSERT INTO users (name) VALUES ('John Doe');
INSERT INTO users (name) VALUES ('Jane Smith');

-- Get the generated IDs for the users
-- Assuming the IDs are 1 and 2

-- Insert into Post table
INSERT INTO posts (title, content, author, user_id) VALUES ('First Post', 'This is the content of the first post.', 'John Doe', 1);
INSERT INTO posts (title, content, author, user_id) VALUES ('Second Post', 'This is the content of the second post.', 'John Doe', 1);
INSERT INTO posts (title, content, author, user_id) VALUES ('Third Post', 'This is the content of the third post.', 'Jane Smith', 2);
INSERT INTO posts (title, content, author, user_id) VALUES ('Fourth Post', 'This is the content of the fourth post.', 'Jane Smith', 2);


-- Insert into Comment table
INSERT INTO comments (name, post_id) VALUES ('This is comment1 for Post1',1);
INSERT INTO comments (name, post_id) VALUES ('This is comment2 for Post1',1);
INSERT INTO comments (name, post_id) VALUES ('This is comment3 for Post2',2);
INSERT INTO comments (name, post_id) VALUES ('This is comment4 for Post2',2);