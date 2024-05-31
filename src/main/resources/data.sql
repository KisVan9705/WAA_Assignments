

-- Insert into User table
INSERT INTO users (name) VALUES ('Test user1');
INSERT INTO users (name) VALUES ('Test user2');

-- Get the generated IDs for the users
-- Assuming the IDs are 1 and 2

-- Insert into Post table
INSERT INTO post (id,title, content, author, user_id) VALUES (1,'First Post', 'This is the content of the first post.', 'Test user1', 1);
INSERT INTO post (id,title, content, author, user_id) VALUES (2,'Second Post', 'This is the content of the second post.', 'Test user1', 1);
INSERT INTO post (id,title, content, author, user_id) VALUES (3,'Third Post', 'This is the content of the third post.', 'Test user2', 2);
INSERT INTO post (id,title, content, author, user_id) VALUES (4, 'Fourth Post', 'This is the content of the fourth post.', 'Test user2', 2);
